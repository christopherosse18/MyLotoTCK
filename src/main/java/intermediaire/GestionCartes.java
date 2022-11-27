package intermediaire;

import business.Carte;

import java.util.ArrayList;
import java.util.Collection;

import static operations.Operation.nombresEnCommun;

public class GestionCartes {

	private Carte carte;

	public static void checkCarte(Collection<Integer> listeBase, Carte carteAControler){
		if ((nombresEnCommun(listeBase, carteAControler.getCarteRangee1()).size() == 5) || (nombresEnCommun(listeBase, carteAControler.getCarteRangee2()).size() == 5)
				|| (nombresEnCommun(listeBase, carteAControler.getCarteRangee3()).size() == 5)){
			carteAControler.setKineIsTrue(true);
			//System.out.println("la carte "+carteAControler.getId()+" a une KINE BRUH");
		}
		if (((nombresEnCommun(listeBase, carteAControler.getCarteRangee1()).size() == 5) && (nombresEnCommun(listeBase, carteAControler.getCarteRangee2()).size() == 5)) ||
				((nombresEnCommun(listeBase, carteAControler.getCarteRangee1()).size() == 5) && (nombresEnCommun(listeBase, carteAControler.getCarteRangee3()).size() == 5)) ||
				((nombresEnCommun(listeBase, carteAControler.getCarteRangee2()).size() == 5) && (nombresEnCommun(listeBase, carteAControler.getCarteRangee3()).size() == 5))) {
			carteAControler.setDoubleKineIsTrue(true);
			// System.out.println("la carte "+carteAControler.getId()+" a une DOUBLE KINE BRUH");
		}
		if ((nombresEnCommun(listeBase, carteAControler.getCarteRangee1()).size() == 5) && (nombresEnCommun(listeBase, carteAControler.getCarteRangee2()).size() == 5) &&
				(nombresEnCommun(listeBase, carteAControler.getCarteRangee3()).size() == 5)) {
			carteAControler.setCartonIsTrue(true);
			// System.out.println("la carte "+carteAControler.getId()+" a une CARTON BRUH");
		}
	}

	public Carte getCarte() {
		return this.carte;
	}

	public String getCarteAsString(){return carte.getCarteAsString();}
	public String getRangees(){return carte.getRangees();}

	public void setCarte(Carte carte) {
		this.carte = carte;
	}

	public ArrayList<Integer> getCarteRangee1() {
		return carte.getCarteRangee1();
	}

	public ArrayList<Integer> getCarteRangee2() {
		return carte.getCarteRangee2();
	}
	public ArrayList<Integer> getCarteRangee3() {
		return carte.getCarteRangee3();
	}

	public void setKineIsTrue(boolean kineIsTrue) {
		carte.setKineIsTrue(kineIsTrue);
	}

	public boolean getDoubleKineIsTrue() {
		return carte.getDoubleKineIsTrue();
	}

	public boolean getCartonIsTrue() {
		return carte.getCartonIsTrue();
	}

	public boolean getKineIsTrue() {
		return carte.getKineIsTrue();
	}

	public void setDoubleKineIsTrue(boolean doubleKineIsTrue) {
		carte.setDoubleKineIsTrue(doubleKineIsTrue);
	}

	public void setCartonIsTrue(boolean cartonIsTrue) {
		carte.setCartonIsTrue(cartonIsTrue);
	}
}