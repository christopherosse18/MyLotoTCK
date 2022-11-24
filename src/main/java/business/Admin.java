package business;

import java.util.Scanner;

import static java.lang.System.exit;

public class Admin {

    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println("Que voulez-vous faire ? : ");
    }

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
        //Initialisation deu jeu
        System.out.println("...Initialisation des ressources du jeu...");
        ActionPlateau plateau = new ActionPlateau();
        plateau.buildPlateau();
        for (int i = 0; i < 3; i++) {
            System.out.println("...");
        }
        ;
        System.out.println("==================================");


        //Création du scanner pour lecture de l'input de la CLI
        Scanner scanner = new Scanner(System.in);

        //Affichage du menu
        String option="1";
        int choixMenu=0;
        do {
                printMenu(options);
                option = scanner.next();
                try {
                    choixMenu = Integer.parseInt(option);
                } catch (Exception ex2) {
                    System.out.println("/!| ERREUR /!| Vous n'avez pas entre un nombre entier entre 1 et "
                            + options.length);
                    System.out.println("==================================");
//                    console().flush();
                    continue;
                }
                switch (choixMenu) {
                    case 1:
                        System.out.println("Entrez un nombre : ");
                        System.out.println(plateau.insertionNum(scanner.next()));
                        break;
                    case 2:
                        System.out.println("Quel nombre voulez-vous chercher ? :");
                        System.out.println(plateau.nombreEstSorti(scanner.nextInt()));
                        break;
                    case 3:
                        //controleCarte();
                        break;
                    case 4:
                        System.out.println("Voici les numéros sortis par ordre de tirage");
                        System.out.println(plateau.getNombreTires());
                        break;
                    case 5:
                        exit(0);
                    default:
                        System.out.println("/!| ERREUR /!| Vous n'avez pas entre un nombre entier entre 1 et "
                                + options.length);

                }

                System.out.println("==================================");

        } while (choixMenu != 5);
    }
}



