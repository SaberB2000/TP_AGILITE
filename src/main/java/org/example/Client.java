package org.example;

import java.util.List;

public class Client {
    // Variable d'instance - remplacez l'exemple qui suit par le vôtre
    private String name;
    private List<Voiture> voiture;

    /**
     * Constructeur d'objets de classe Client
     */
    public Client(String name, List<Voiture> voiture) {
        // Initialisation des variables d'instance
        this.name = name;
        this.voiture = voiture;
    }

    /**
     * Accéder à la voiture associée au client
     */
    public List<Voiture> getVoiture() {
        return voiture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoiture(List<Voiture> voiture) {
        this.voiture = voiture;
    }

    // Nouvelle méthode qui collabore avec la méthode de la classe Voiture
    public String obtenirInfoVoiture() {
        // Vérification si la liste de voitures n'est pas vide
        if (voiture != null && !voiture.isEmpty()) {
            // Utilisation de la première voiture de la liste
            Voiture premiereVoiture = voiture.get(0);

            // Utilisation de la méthode de la classe Voiture
            int matriculeVoiture = premiereVoiture.getMatricule();
            String marqueVoiture = premiereVoiture.getMarque();

            // Construction d'une information basée sur la contribution des deux objets
            return name + " possède une voiture avec matricule " + matriculeVoiture + " et marque " + marqueVoiture;
        } else {
            return name + " n'a pas de voiture.";
        }
    }
}
