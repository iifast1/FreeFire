package edu.esprit.Entities;

import java.util.*;

public class Equipe {
    private String libelle;
    private HashSet<Joueur> joueurs = new HashSet<Joueur>();

    public Set<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(HashSet<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Equipe(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipe equipe = (Equipe) o;
        return Objects.equals( libelle, equipe.libelle);
    }

    public void ajouterJoueur(Joueur j){
        if(joueurs.size()<4)
            if(!joueurs.contains(j))
                joueurs.add(j);
            else
                System.out.println("Player already in team!");
        else
            System.out.println("Maximum number of players reached");
    }
    public void retirerJoueur(Joueur j){
        joueurs.remove(j);
    }
    public TreeSet<Joueur> trierListeJoueurs(){
        return new TreeSet<>(joueurs);
    }

    @Override
    public String toString() {
        return "\nEquipe{" +
                "Libelle='" + libelle + '\'' +
                ",Joueurs=" + joueurs +
                "}\n";
    }
}
