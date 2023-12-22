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

    @Given("le client possède une voiture avec matricule {int} et marque {string}")
    public void leClientPossedeUneVoitureAvecMatriculeEtMarque(int matricule, String marque) {
        Voiture voiture = new Voiture(matricule, marque);
        client.setVoiture(Arrays.asList(voiture));
    }

    @Given("le client n'a pas de voiture")
    public void leClientNaPasDeVoiture() {
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


