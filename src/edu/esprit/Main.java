package edu.esprit;

import edu.esprit.Entities.Equipe;
import edu.esprit.Entities.Joueur;
import edu.esprit.Entities.Partie;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Equipe equipe1 = new Equipe("Equipe 1");
        Equipe equipe2 = new Equipe("Equipe 2");

        Partie partie = new Partie(1);

        Joueur j1 = new Joueur(1,"Farouk","H",1000,true);
        Joueur j2 =new Joueur(2,"Manel","F",1000,true);
        Joueur j3 = new Joueur(3,"Ezzedine","H",1000,true);
        Joueur j4 = new Joueur(4,"Salma","F",1000,false);

        Joueur j5 = new Joueur(5,"Aziz","H",1000,true);
        Joueur j6 =new Joueur(6,"Aerz","H",1000,false);
        Joueur j7 = new Joueur(7,"Aerz","H",1000,true);
        Joueur j8 = new Joueur(8,"Aerz","H",1000,true);

        equipe1.ajouterJoueur(j1);
        equipe1.ajouterJoueur(j2);
        equipe1.ajouterJoueur(j3);
        equipe1.ajouterJoueur(j4);

        equipe2.ajouterJoueur(j5);
        equipe2.ajouterJoueur(j6);
        equipe2.ajouterJoueur(j7);
        equipe2.ajouterJoueur(j8);


        partie.ajouterParticipants("Arena",equipe1);
        partie.ajouterParticipants("Arena",equipe2);

        System.out.println("Number of players in "+equipe1.getLibelle()+" ************************************************************");
        System.out.println(partie.nbJoueursParEquipe("Arena",equipe1));
        System.out.println("************************************************************");
        partie.eliminerJoueur("Arena",j1,j2);
        System.out.println("************************************************************");
        System.out.println(partie);
        System.out.println("*********************List of players alive***************************************");
        List<Joueur> alivePlayers = partie.joueursVivants();
        equipe1.retirerJoueur(j1);
        System.out.println("Number of players in "+equipe1.getLibelle()+" ************************************************************");
        System.out.println(partie.nbJoueursParEquipe("Arena",equipe1));
        System.out.println(alivePlayers);
    }
}
