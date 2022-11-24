import java.util.ArrayList;
import java.util.Arrays;

public class GenerationCartes {

	private Carte carte;


	ArrayList rangee1 = new ArrayList<>(Arrays.asList(14,35,56,71,87));
	ArrayList rangee2 = new ArrayList<>(Arrays.asList(1,21,40,69,82));
	ArrayList rangee3 = new ArrayList<>(Arrays.asList(12,36,57,73,84));

	public void buildCartes(){
		carte = new Carte("A1", rangee1, rangee2, rangee3);
	};

	/*public static boolean checkRangee(Collection<Integer> nombreTires){
	}
	public static void checkCarte(Carte carte, Collection<Integer> nombreTires){
	}*/

	public Carte getCarte() {
		return this.carte;
	}

	public String getCarteAsString(){return carte.getCarteAsString()
			/*Arrays.deepToString(rangees)*/;}
	public String getRangees(){return carte.getRangees()
			/*Arrays.deepToString(rangees)*/;}

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