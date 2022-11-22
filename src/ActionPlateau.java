import java.util.HashMap;

public class ActionPlateau {

	/**
	 * 
	 * @param nombre
	 */
	public void insertionNum(int nombre) {
		// TODO - implement ActionPlateau.insertionNum
		throw new UnsupportedOperationException();
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