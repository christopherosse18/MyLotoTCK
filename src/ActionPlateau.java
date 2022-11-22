import java.util.HashMap;

public class ActionPlateau {

	Plateau plateau;
	/**
	 * 
	 * @param nombre
	 */
	public void buildPlateau(){
		plateau = new Plateau();
	}
	public void insertionNum(int number) {
		// TODO - implement ActionPlateau.insertionNum
		plateau.put(number);
	}

	/**
	 * 
	 * @param nombreRecherche
	 */
	public boolean rechercheNombre(int nombreRecherche, HashMap plateau) {
		if (plateau.containsKey(nombreRecherche)) {
			System.out.println("Le nombre " + nombreRecherche + " est déjà sortit"); //à supprimer plus tard
			return true;
		} else {
			System.out.println("le nombre " + nombreRecherche + " n'est pas encore sortit"); //à supprimer plus tard
			return false;
		}
	}

	/**
	 * 
	 * @param nombre
	 */
	public void controleSaisieNum(int nombre) {

	}

}