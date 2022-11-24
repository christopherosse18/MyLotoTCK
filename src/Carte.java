import java.util.ArrayList;

public class Carte {

	//private int[][] rangees;
	private String id;
	private Rangee rangee;
	private boolean kineIsTrue;
	private boolean doubleKineIsTrue;
	private boolean cartonIsTrue;

	public Carte(String id) {
		this.id = id;
		this.rangee = initialiseRangees();
	}

	public Carte(String id, ArrayList<Integer> rangee1, ArrayList<Integer> rangee2, ArrayList<Integer> rangee3) {
		this.id = id;
		this.rangee = new Rangee(rangee1, rangee2, rangee3);
		this.kineIsTrue = false;
		this.doubleKineIsTrue = false;
		this.cartonIsTrue = false;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRangees() {
		return rangee.getRangees();
	}

	public String getCarteAsString(){
		return id+",\n[\n"+rangee.getRangees()+"\n]";
	}

	public void setRangee(Rangee rangee) {
		this.rangee = rangee;
	}

	public void verifCarte(String nomCarte) {

	}
	public Rangee initialiseRangees(){
		return new Rangee();
	}

	public ArrayList<Integer> getCarteRangee1() {
		return rangee.rangee1;
	}

	public ArrayList<Integer> getCarteRangee2() {
		return rangee.rangee2;
	}
	public ArrayList<Integer> getCarteRangee3() {
		return rangee.rangee1;
	}

	public Rangee getRangee() {
		return rangee;
	}

	public boolean getKineIsTrue() {
		return kineIsTrue;
	}

	public void setKineIsTrue(boolean kineIsTrue) {
		this.kineIsTrue = kineIsTrue;
	}

	public boolean getDoubleKineIsTrue() {
		return doubleKineIsTrue;
	}

	public void setDoubleKineIsTrue(boolean doubleKineIsTrue) {
		this.doubleKineIsTrue = doubleKineIsTrue;
	}

	public boolean getCartonIsTrue() {
		return cartonIsTrue;
	}

	public void setCartonIsTrue(boolean cartonIsTrue) {
		this.cartonIsTrue = cartonIsTrue;
	}
}