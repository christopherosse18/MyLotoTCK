package business;

import java.util.ArrayList;
import java.util.Arrays;

public class GenerationCartes {

	private Carte carte;

	/*public void buildCartes(){
		carte = new Carte("A1");
		Rangee rangee = new Rangee();
		ran
		carte.setRangee();
	}*/

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