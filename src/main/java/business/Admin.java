package business;

import java.util.Scanner;

import static Jackson.MainReader.importCarteJson;
import static java.lang.System.exit;

public class Admin {

    //Parcours du menu pour afficher les options
    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println("Que voulez-vous faire ? : ");
    }

    //Initialisation des options du menu
    public static void initJeu() {
        String[] options = {"1- Inserer un nombre",
                "2- Rechercher un nombre",
                "3- Verification de carte",
                "4- Sortir les numeros tires",
                "5- Quitter l'application",
        };


        //Message d'accueil
        System.out.println("==================================\n" +
                "*** Bienvenue sur le MyLotoTCK ***\n" +
                "==================================");

        //Initialisation des variables du jeu
        boolean phaseKine = true;
        boolean phaseDoubleKine = false;
        boolean phaseCarton = false;

        //Initialisation des ressources du jeu
        System.out.println("...Initialisation des ressources du jeu...");
            //Import des cartes
        ListeCarte cartes = importCarteJson();
            //Création du plateau de jeu
        ActionPlateau plateau = new ActionPlateau();
        plateau.buildPlateau();
        //Séparateurs
        for (int i = 0; i < 3; i++) {
            System.out.println("...");
        }
        ;
        System.out.println("==================================");


        //Création du scanner pour lecture de l'input de la CLI
        Scanner scanner = new Scanner(System.in);

        //Affichage du menu
        String option = "1";
        int choixMenu = 0;
        do {
            printMenu(options);
            option = scanner.next();
            //Gestion des erreurs lors de la saisie d'une mauvaise option de menu (String au lieu de int)
            try {
                choixMenu = Integer.parseInt(option);
            } catch (Exception ex2) {
                System.out.println("/!\\ ERREUR /!\\ Vous n'avez pas entre un nombre entier entre 1 et "
                        + options.length);
                System.out.println("==================================");
                continue;
            }
            //Gestion du choix de menu
            switch (choixMenu) {
                //Insertion d'un nombre tiré
                case 1:
                    System.out.println("Entrez un nombre : ");
                    System.out.println(plateau.insertionNum(scanner.next()));
                    break;
                //Recherche d'un nombre
                case 2:
                    System.out.println("Quel nombre voulez-vous chercher ? : ");
                    System.out.println(plateau.nombreEstSorti(scanner.nextInt()));
                    break;
                //Vérification d'une carte
                case 3:
                    System.out.println("Insérer l'identifiant de la carte : ");
                    Carte carteJoueur = new Carte();
                    //Gestion d'erreur (insertion d'un mauvais ID)
                    try {
                        //Lecture de l'input de l'ID de carte
                        carteJoueur = cartes.getCarteById(scanner.next().toUpperCase());
                        Operation.checkCarte(plateau.plateau.getNombreTires(), carteJoueur);
                        //Gestion de la possibilité d'avoir directement une double kine
                        if (carteJoueur.getDoubleKineIsTrue()) {
                            //Début de la phase de double Kine
                            phaseDoubleKine = true;
                        }
                        //Gestion de la possibilité d'avoir directement un carton
                        if (carteJoueur.getCartonIsTrue()) {
                            //Début de la phase de carton
                            phaseCarton = true;
                        }
                        //Check de la Kine
                        if (carteJoueur.getKineIsTrue() && !carteJoueur.getDoubleKineIsTrue() && !carteJoueur.getCartonIsTrue() && phaseKine) {
                            System.out.println("La carte " + carteJoueur.getId() + " a bien une Kine !");
                            //Fin de la phase de Kine
                            phaseKine = false;
                            //Début de la phase de double Kine
                            phaseDoubleKine = true;
                        } else if (!carteJoueur.getKineIsTrue() && !carteJoueur.getDoubleKineIsTrue() && !carteJoueur.getCartonIsTrue()) {
                            System.out.println("La carte " + carteJoueur.getId() + " n'a rien");
                        //Check de la double Kine
                        } else if (carteJoueur.getDoubleKineIsTrue() && carteJoueur.getKineIsTrue() && !carteJoueur.getCartonIsTrue() && phaseDoubleKine) {
                            System.out.println("La carte " + carteJoueur.getId() + " a bien une double Kine !");
                            //Fin de la phase de double Kine
                            phaseDoubleKine = false;
                            //Début de la phase de Carton
                            phaseCarton = true;
                        } else if (!carteJoueur.getDoubleKineIsTrue() && carteJoueur.getKineIsTrue() && !carteJoueur.getCartonIsTrue()) {
                            System.out.println("La carte " + carteJoueur.getId() + " n'a pas de double Kine !");
                        //Check du Carton
                        } else if (carteJoueur.getCartonIsTrue() && carteJoueur.getKineIsTrue() && carteJoueur.getDoubleKineIsTrue() && phaseCarton) {
                            System.out.println("La carte " + carteJoueur.getId() + " a carton");
                            System.out.println("Partie terminée ! Féliciations aux vainqueurs");
                            exit(0);
                        } else if (!carteJoueur.getCartonIsTrue() && carteJoueur.getDoubleKineIsTrue() && carteJoueur.getKineIsTrue()) {
                            System.out.println("La carte " + carteJoueur.getId() + " n'a pas de carton");
                        }
                    //Gestion de l'erreur si la carte n'existe pas
                    } catch (Exception ex4) {
                        System.out.println("La carte n'existe pas");
                    }
                    break;
                //Retourner tous les numéros tirés
                case 4:
                    System.out.println("Voici les numéros sortis par ordre de tirage");
                    System.out.println(plateau.getNombreTires());
                    break;
                //Quitter le programme
                case 5:
                    exit(0);
                //Gestion de l'erreur si aucun numéro rentré ne correspond à une option du menu
                default:
                    System.out.println("/!\\ ERREUR /!\\ Vous n'avez pas saisi un nombre entier entre 1 et "
                            + options.length);

            }

            //Séparateur
            System.out.println("==================================");

        } while (choixMenu != 5); //Condition de sortie de boucle (exit le programme)
    }
}



