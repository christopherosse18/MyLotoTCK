package console;

import business.Carte;
import intermediaire.GestionCartes;
import intermediaire.GestionPlateau;
import intermediaire.PersistenceLoto;

import java.util.Scanner;

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
    public static void initInterface() {
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
        GestionCartes cartes = new GestionCartes();
        cartes.buildListeCarte();
        cartes.setCartes(PersistenceLoto.readerListeCarteJson());
        //Création du plateau de jeu
        GestionPlateau plateau = new GestionPlateau();
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
                System.out.println("/!\\ ERREUR /!\\ Vous n'avez pas saisi une option valide");
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
                    int nombreRecherche;
                    System.out.println("Quel nombre voulez-vous chercher ? : ");
                    nombreRecherche = scanner.nextInt();
                    if(plateau.nombreEstSorti(nombreRecherche)){
                        System.out.println("Le nombre " + nombreRecherche + " est déjà sorti");
                    } else{
                        System.out.println("Le nombre " + nombreRecherche + " n'est pas encore sorti");
                    }
                    break;
                //Vérification d'une carte
                case 3:
                    System.out.println("Insérer l'identifiant de la carte : ");
                    Carte carteJoueur = new Carte();
                    //Gestion d'erreur (insertion d'un mauvais ID)
                    try {
                        //Lecture de l'input de l'ID de carte
                        carteJoueur = cartes.getCarteById(scanner.next().toUpperCase());
                        GestionCartes.checkCarte(plateau.plateau.getNombreTires(), carteJoueur);
                        //Gestion de la possibilité d'avoir directement une double kine
                        if (carteJoueur.getDoubleKineIsTrue()) {
                            //Début de la phase de double Kine
                            phaseDoubleKine = true;
                           // System.out.println("-------- Phase Double-Quine entamée --------");
                        }
                        //Gestion de la possibilité d'avoir directement un carton
                        if (carteJoueur.getCartonIsTrue()) {
                            //Début de la phase de carton
                            phaseCarton = true;
                           // System.out.println("-------- Phase Carton entamée --------");
                        }
                        //Check de la Kine
                        if (carteJoueur.getKineIsTrue() && !carteJoueur.getDoubleKineIsTrue() && !carteJoueur.getCartonIsTrue() && phaseKine) {
                            System.out.println("La carte " + carteJoueur.getId() + " a bien une Quine !");

                            System.out.println("Voulez-vous passer à la phase double-quine ? (1 pour changer de phase, 0 pour contrôler une autre carte Quine)");
                            if(scanner.nextInt() == 1) {
                                //Fin de la phase Kine
                                phaseKine = false;
                                System.out.println("-------- Phase Quine terminée --------");
                                //Début de la phase double Kine
                                phaseDoubleKine = true;
                                System.out.println("-------- Phase Double-Quine entamée --------");
                            }
                        } else if (!carteJoueur.getKineIsTrue() && !carteJoueur.getDoubleKineIsTrue() && !carteJoueur.getCartonIsTrue()) {
                            System.out.println("La carte " + carteJoueur.getId() + " n'a rien");
                            //Check de la double Kine
                        } else if (carteJoueur.getDoubleKineIsTrue() && carteJoueur.getKineIsTrue() && !carteJoueur.getCartonIsTrue() && phaseDoubleKine) {
                            System.out.println("La carte " + carteJoueur.getId() + " a bien une double Quine !");
                            System.out.println("Voulez-vous passer à la phase carton ? (1 pour changer de phase, 0 pour contrôler une autre carte Double-Quine)");
                            if(scanner.nextInt() == 1) {
                                //Fin de la phase de double Kine
                                phaseDoubleKine = false;
                                System.out.println("-------- Phase Double-Quine terminée --------");
                                //Début de la phase de Carton
                                phaseCarton = true;
                                System.out.println("-------- Phase Carton entamée --------");
                            }
                        } else if (!carteJoueur.getDoubleKineIsTrue() && carteJoueur.getKineIsTrue() && !carteJoueur.getCartonIsTrue()) {
                            System.out.println("La carte " + carteJoueur.getId() + " n'a pas de double Quine !");
                            //Check du Carton
                        } else if (carteJoueur.getCartonIsTrue() && carteJoueur.getKineIsTrue() && carteJoueur.getDoubleKineIsTrue() && phaseCarton) {
                            System.out.println("La carte " + carteJoueur.getId() + " a carton");

                            System.out.println("Voulez-vous mettre fin à la partie ? (1 pour changer de phase, 0 pour contrôler une autre carte Carton)");
                            if(scanner.nextInt() == 1) {
                                System.out.println("Partie terminée ! Féliciations aux vainqueurs");
                                exit(0);
                            }
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
                    System.out.println("/!\\ ERREUR /!\\ Vous n'avez pas saisi une option valide");
            }

            //Séparateur
            System.out.println("==================================");

        } while (choixMenu != 5); //Condition de sortie de boucle (exit le programme)
    }
}



