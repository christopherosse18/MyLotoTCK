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

		try {
			//Message d'accueil
			System.out.println("==================================\n"+
							   "*** Bienvenue sur le MyLotoTCK ***\n"+
							   "==================================");
			TimeUnit.SECONDS.sleep(1);

			//Initialisation deu jeu
			System.out.println("Initialisation des ressources du jeu");
			TimeUnit.SECONDS.sleep(1);
			for(int i=0; i<3; i++){
				System.out.println("...");
				TimeUnit.MILLISECONDS.sleep(750);
			};
			System.out.println("==================================");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//Création du scanner pour lecture de l'input de la CLI
		Scanner scanner = new Scanner(System.in);

		//Affichage du menu
		int option = 0;
		while (option != 4) {
			printMenu(options);
			try {
				option = scanner.nextInt();
				switch (option) {
					case 1:
						//insertionNum();
						option1();
						break;
					case 2:
						//rechercheNombre();
						option2();
						break;
					case 3:
						//controleCarte();
						option3();
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
	// Options
	private static void option1() {
		System.out.println("Thanks for choosing option 1");
	}
	private static void option2() {
		System.out.println("Thanks for choosing option 2");
	}
	private static void option3() {
		System.out.println("Thanks for choosing option 3");
	}
}