package business;

import java.util.Collection;

public class ActionPlateau {

	Plateau plateau;

	public void buildPlateau(){
		plateau = new Plateau();
	}
	public String insertionNum(String nombre) {
		String message;
		if(saisieEstBonne(nombre)){
			if (nombreEstSorti(Integer.parseInt(nombre))) {
				return message = "Le nombre "+nombre+" a déjà été saisi";
			} else {
				int intNombre = Integer.parseInt(nombre);
				plateau.put(intNombre);
				return message = "Le nombre "+intNombre+" a été saisi";
			}
		}  else {
			return message = "La saisie est négative ou n'est pas un nombre";
		}
	}

	/**
	 * 
	 * @param nombreRecherche
	 */
	public boolean nombreEstSorti(int nombreRecherche) {
		if (plateau.containsKey(nombreRecherche)) {
			System.out.println("Le nombre " + nombreRecherche + " est déjà sorti"); //à supprimer plus tard
			return true;
		} else {
			System.out.println("le nombre " + nombreRecherche + " n'est pas encore sorti"); //à supprimer plus tard
			return false;
		}
	}


	/**
	 * 
	 * @param nombre
	 */
	public boolean saisieEstBonne(String nombre) {
		String message;
		if (!checkEstString(nombre)){
			return false;
		} else if (checkEstNegatif(nombre)){
			return false;
		} else if (!checkEstRange(nombre)) {
			return false;
		} else {
			return true;
		}
	}

	public boolean checkEstNegatif(String nombre){
		int intNombre = Integer.parseInt(nombre);
		if (intNombre < 1){
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkEstString(String nombre){
		if(nombre.chars().allMatch(Character::isDigit)){
			return true;
		} else {
			return false;
		}
	}

	public boolean checkEstRange(String nombre){
		int intNombre = Integer.parseInt(nombre);
		if(intNombre > 90){
			return false;
		} else {
			return true;
		}
	}

	public Collection<Integer> getNombreTires(){
		return this.plateau.getNombreTires();
	}
}