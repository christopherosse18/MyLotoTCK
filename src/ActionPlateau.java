public class ActionPlateau {

	Plateau plateau;
	public void buildPlateau(){
		plateau = new Plateau();
	}
	public String insertionNum(String nombre) {
		String message;
		if(saisieEstBonne(nombre)){
			int intNombre = Integer.parseInt(nombre);
			plateau.put(intNombre);
			return message = "Le nombre "+intNombre+" a été saisi";
		} else {
			return message = "Le nombre est négatif ou invalide";
		}
	}

	/**
	 * 
	 * @param nombreRecherche
	 */
	public boolean rechercheNombre(int nombreRecherche) {
		// TODO - implement ActionPlateau.rechercheNombre
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 */
	public boolean saisieEstBonne(String nombre) {
		String message;
		if (!checkNegatif(nombre)){
			return false;
		} else if (!checkString(nombre)){
			return false;
		} else {
			return true;
		}

	}

	public boolean checkNegatif(String nombre){
		int intNombre = Integer.parseInt(nombre);
		if (intNombre < 0){
			return true;
		} else {
			return false;
		}
	}

	public boolean checkString(String nombre){
		if(nombre.chars().allMatch(Character::isDigit)){
			return false;
		} else {
			return false;
		}
	}

}