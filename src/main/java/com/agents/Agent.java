package com.agents;

import java.util.List;
//Class Agent 

public class Agent {
    //attribues
    private String nom;
    private String prenom;
    private String mission;
    private String motDePasse;
    private String pseudonyme;
    private List<String> materiels;

    //Constructeur
    public Agent(String nom, String prenom, String mission, String motDePasse, String pseudonyme, List<String> materiels) {
        this.nom = nom;
        this.prenom = prenom;
        this.mission = mission;
        this.motDePasse = motDePasse;
        this.pseudonyme = pseudonyme;
        this.materiels = materiels;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getPseudonyme() {
        return pseudonyme;
    }

    public void setPseudonyme(String pseudonyme) {
        this.pseudonyme = pseudonyme;
    }

    public List<String> getMateriels() {
        return materiels;
    }

    public void setMateriels(List<String> materiels) {
        this.materiels = materiels;
    }
   
    @Override
    public String toString() {
        return "Agent{" + "nom=" + nom + ", prenom=" + prenom + ", mission=" + mission + ", motDePasse=" + motDePasse + ", pseudonyme=" + pseudonyme + ", materiels=" + materiels + '}';
    }
    
}
