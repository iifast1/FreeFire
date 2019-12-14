package edu.esprit.Entities;

import java.util.Objects;

public class Joueur implements Comparable{
    private int id;
    private String nom,gende;
    private int nbDiamonds;
    private boolean vivant;

    public Joueur() {
    }

    public Joueur(int id, String nom, String gende, int nbDiamonds, boolean vivant) {
        this.id = id;
        this.nom = nom;
        this.gende = gende;
        this.nbDiamonds = nbDiamonds;
        this.vivant = vivant;
    }

    @Override
    public String toString() {
        return "\n Joueur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", gende='" + gende + '\'' +
                ", nbDiamonds=" + nbDiamonds +
                ", vivant=" + vivant +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Joueur joueur = (Joueur) o;
        return id == joueur.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, gende);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGende() {
        return gende;
    }

    public void setGende(String gende) {
        this.gende = gende;
    }

    public int getNbDiamonds() {
        return nbDiamonds;
    }

    public void setNbDiamonds(int nbDiamonds) {
        this.nbDiamonds = nbDiamonds;
    }

    public boolean isVivant() {
        return vivant;
    }

    public void setVivant(boolean vivant) {
        this.vivant = vivant;
    }

    @Override
    public int compareTo(Object o) {
        Joueur jo = (Joueur) o;
        return Integer.compare(jo.getId(),this.getId());
    }
}
