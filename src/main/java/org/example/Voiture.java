package org.example;

public class Voiture {
    private int matricule;
    private String marque;

    public Voiture(int matricule, String marque) {
        this.matricule = matricule;
        this.marque = marque;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String obtenirInfos() {
        return "Voiture - Matricule : " + matricule + ", Marque : " + marque;
    }

}

