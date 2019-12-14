package edu.esprit.Entities;

import java.util.*;
import java.util.stream.Collectors;

public class Partie {
    private int idPartie;
    private HashMap<String, HashSet<Equipe>> participants = new HashMap<String, HashSet<Equipe>>();

    public Partie(int idPartie) {
        this.idPartie = idPartie;
    }

    public void ajouterParticipants(String arena, Equipe e){
        participants.computeIfAbsent( arena, k -> new HashSet<>() ).add(e);
    }
    public long nbJoueursParEquipe(String r,Equipe p){
        return participants.get(r).stream().map(Equipe::getJoueurs).findFirst().get().size();
    }
    public void eliminerJoueur(String place,Joueur j1,Joueur j2){
        if(!(j1.isVivant()||j2.isVivant()))
            return;
        participants.get(place).stream().map(Equipe::getJoueurs).flatMap(Collection::stream).filter(joueur -> joueur.equals(j1)).forEach(joueur -> joueur.setNbDiamonds(joueur.getNbDiamonds()+1));
        participants.get(place).stream().map(Equipe::getJoueurs).flatMap(Collection::stream).filter(joueur -> joueur.equals(j2)).forEach(joueur -> {joueur.setNbDiamonds(joueur.getNbDiamonds()-1);joueur.setVivant(false);});
        System.out.println(j1.getNom()+" has killed "+j2.getNom());
    }
    public List<Joueur> joueursVivants(){
        return participants.values().stream().flatMap(Collection::stream).map(Equipe::getJoueurs).flatMap(Collection::stream).filter(Joueur::isVivant).collect(Collectors.toCollection(ArrayList::new));
    }
    @Override
    public String toString() {
        return "Partie{" +
                "idPartie=" + idPartie +
                ",participants=" + participants +
                '}';
    }
}
