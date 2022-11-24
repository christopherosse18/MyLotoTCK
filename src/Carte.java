import java.util.ArrayList;
import java.util.Arrays;

public class Carte {

	//private int[][] rangees;
	private String id;
	private Rangee rangee;

	public Carte(String id) {
		this.id = id;
		this.rangee = initialiseRangees();
	}

	public Carte(String id, ArrayList<Integer> rangee1, ArrayList<Integer> rangee2, ArrayList<Integer> rangee3) {
		this.id = id;
		this.rangee = new Rangee(rangee1, rangee2, rangee3);
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

	public String getCarte(){
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

}