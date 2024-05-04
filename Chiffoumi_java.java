package chiffoumi;

import java.util.Random;
import java.util.Scanner;

public class Chiffoumi_java {

	public static void main(String[] args) {
        // Initialisation du scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);
        // Initialisation du générateur de nombres aléatoires
        Random random = new Random();

        // Message de bienvenue
        System.out.println("Bienvenue dans le jeux Chiffoumi (Pierre-Feuille-Ciseaux !)");
        // Message de demande de choix
        System.out.println("Veuillez choisir : 0 pour Pierre, 1 pour Feuille, 2 pour Ciseaux");

        // L'utilisateur fait un choix
        int choixJoueur = scanner.nextInt();
        // L'ordinateur fait un choix aléatoire entre 0, 1 et 2
        int choixOrdinateur = random.nextInt(3);

        // Affichage du choix de l'ordinateur
        System.out.println("L'ordinateur a choisi : " + choixOrdinateur);

        // Tant que le choix de l'utilisateur est égal au choix de l'ordinateur
        while (choixJoueur == choixOrdinateur) {
            // Affichage de l'égalité
            System.out.println("Égalité !");
            // L'utilisateur refait un choix
            choixJoueur = scanner.nextInt();
            // L'ordinateur refait un choix aléatoire
            choixOrdinateur = random.nextInt(3);
            // Affichage du nouveau choix de l'ordinateur
            System.out.println("L'ordinateur a choisi : " + choixOrdinateur);
        }

        // Si l'utilisateur gagne
        if ((choixJoueur == 0 && choixOrdinateur == 2) ||
            (choixJoueur == 1 && choixOrdinateur == 0) ||
            (choixJoueur == 2 && choixOrdinateur == 1)) {
            System.out.println("Vous avez gagné !");
        } else {
            // Sinon, l'ordinateur gagne
            System.out.println("L'ordinateur a gagné !");
        }
    }
}