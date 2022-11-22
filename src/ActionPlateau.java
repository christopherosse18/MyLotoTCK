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
	public boolean rechercheNombre(int nombreRecherche) {
		// TODO - implement ActionPlateau.rechercheNombre
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 */
	public void controleSaisieNum(int nombre) {
		// TODO - implement ActionPlateau.controleSaisieNum
		throw new UnsupportedOperationException();
	}

}