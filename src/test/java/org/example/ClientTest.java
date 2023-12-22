package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    public void testGetVoiture() {
        List<Voiture> voitures = new ArrayList<>();
        voitures.add(new Voiture(1, "Toyota"));
        Client client = new Client("John", voitures);

        assertEquals(voitures, client.getVoiture());
    }

    @Test
    public void testGetName() {
        Client client = new Client("Alice", new ArrayList<>());
        assertEquals("Alice", client.getName());
    }

    @Test
    public void testSetName() {
        Client client = new Client("Bob", new ArrayList<>());
        client.setName("Charlie");
        assertEquals("Charlie", client.getName());
    }

    @Test
    public void testSetVoiture() {
        List<Voiture> voitures = new ArrayList<>();
        voitures.add(new Voiture(2, "Honda"));
        Client client = new Client("Eve", new ArrayList<>());
        client.setVoiture(voitures);
        assertEquals(voitures, client.getVoiture());
    }

    @Test
    public void testObtenirInfoVoitureWithCar() {
        List<Voiture> voitures = new ArrayList<>();
        voitures.add(new Voiture(3, "Ford"));
        Client client = new Client("Grace", voitures);
        String expected = "Client possède une voiture avec matricule 3 et marque Ford";
        assertEquals(expected, client.obtenirInfoVoiture());
    }

    @Test
    public void testObtenirInfoVoitureWithoutCar() {
        Client client = new Client("David", new ArrayList<>());
        String expected = "Le client n'a pas de voiture.";
        assertEquals(expected, client.obtenirInfoVoiture());
    }

}