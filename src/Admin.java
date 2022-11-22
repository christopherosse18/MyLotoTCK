import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.lang.System.exit;

public class Admin {

	public static void printMenu(String[] options) {
		for (String option : options) {
			System.out.println(option);
		}
		System.out.println("Que voulez-vous faire ? : ");
	}

	public static void initJeu() {
		// TODO - implement Admin.initJeu
		String[] options = {"1- Inserer un nombre",
				"2- Rechercher un nombre",
				"3- Verification de carte",
				"4- Quitter l'application",
		};


		//Message d'accueil
		System.out.println("==================================\n"+
						   "*** Bienvenue sur le MyLotoTCK ***\n"+
						   "==================================");
		//Initialisation deu jeu
		System.out.println("...Initialisation des ressources du jeu...");
		ActionPlateau plateau = new ActionPlateau();
		plateau.buildPlateau();
		for(int i=0; i<3; i++){
			System.out.println("...");
		};
		System.out.println("==================================");



		//Création du scanner pour lecture de l'input de la CLI
		Scanner scanner = new Scanner(System.in);

		//Affichage du menu
		int option = 0;
		int chiffre;
		while (option != 4) {
			printMenu(options);
			try {
				option = scanner.nextInt();
				switch (option) {
					case 1:
						System.out.println("Entrez un nombre : ");
						System.out.println(plateau.insertionNum(scanner.next()));
						break;
					case 2:
						System.out.println("Quel nombre voulez-vous chercher ? :");
						plateau.nombreEstSorti(scanner.nextInt());
						break;
					case 3:
						//controleCarte();
						break;
					case 4:
						exit(0);
					default:
						throw new Exception();
				}
				System.out.println("==================================");
			} catch (Exception ex) {
				System.out.println("/!| ERREUR /!| Vous n'avez pas entre un nombre entier entre 1 et "
						+ options.length + ", entrez 0 pour revenir au menu ");
				scanner.next();

			}

		}

	}

}