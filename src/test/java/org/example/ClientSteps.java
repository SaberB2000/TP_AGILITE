package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ClientSteps {
    private Client client;
    private String result;

    @Given("un client avec le nom {string}")
    public void unClientAvecLeNom(String name) {
        client = new Client(name, null);
    }

    @Given("{string} possède une voiture avec matricule {int} et marque {string}")
    public void leClientPossedeUneVoitureAvecMatriculeEtMarque(String name, int matricule, String marque) {
        Voiture voiture = new Voiture(matricule, marque);
        client.setName(name);
        client.setVoiture(Arrays.asList(voiture));
    }

    @Given("{string} n'a pas de voiture")
    public void leClientNaPasDeVoiture(String name) {
        client.setName(name);
        client.setVoiture(null);
    }

    @When("je demande les informations de la voiture pour le client")
    public void jeDemandeLesInformationsDeLaVoiturePourLeClient() {
        result = client.obtenirInfoVoiture();
    }

    @Then("je devrais obtenir {string}")
    public void jeDevraisObtenir(String expected) {
        assertEquals(expected, result);
    }
}