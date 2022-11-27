package intermediaire;

import operations.Operation;
import business.Plateau;

import java.util.Collection;

public class GestionPlateau {

	public Plateau plateau;

	public void buildPlateau(){
		plateau = new Plateau();
	}
	public String insertionNum(String nombre) {
		String message;
		if(Operation.saisieEstBonne(nombre)){
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




	public Collection<Integer> getNombreTires(){
		return this.plateau.getNombreTires();
	}
}