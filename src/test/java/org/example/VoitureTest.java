package org.example;

import org.junit.jupiter.api.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoitureTest {

    @Test
    public void testGetMatricule() {
        Voiture voiture = new Voiture(123, "Toyota");
        assertEquals(123, voiture.getMatricule());
    }

    @Test
    public void testSetMatricule() {
        Voiture voiture = new Voiture(456, "Honda");
        voiture.setMatricule(789);
        assertEquals(789, voiture.getMatricule());
    }

    @Test
    public void testGetMarque() {
        Voiture voiture = new Voiture(101, "Ford");
        assertEquals("Ford", voiture.getMarque());
    }

    @Test
    public void testSetMarque() {
        Voiture voiture = new Voiture(202, "Chevrolet");
        voiture.setMarque("Tesla");
        assertEquals("Tesla", voiture.getMarque());
    }


    @Test
    public void testAfficherInfos() {
        Voiture voiture = new Voiture(777, "Mazda");

        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));



        // Reset System.out to the original OutputStream
        System.setOut(System.out);


    }
}
