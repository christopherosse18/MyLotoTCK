import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class GenerationCartes {

	private Carte cartes;


	ArrayList rangee1 = new ArrayList<>(Arrays.asList(14,35,56,71,87));
	ArrayList rangee2 = new ArrayList<>(Arrays.asList(1,21,40,69,82));
	ArrayList rangee3 = new ArrayList<>(Arrays.asList(12,36,57,73,84));

	public void buildCartes(){
		cartes = new Carte("A1", rangee1, rangee2, rangee3);
	};

	/*public static boolean checkRangee(Collection<Integer> nombreTires){
	}
	public static void checkCarte(Carte carte, Collection<Integer> nombreTires){
	}*/

	public Carte getCartes() {
		return this.cartes;
	}

	public String getCarte(){return cartes.getCarte()
			/*Arrays.deepToString(rangees)*/;}
	public String getRangees(){return cartes.getRangees()
			/*Arrays.deepToString(rangees)*/;}

	public void setCartes(Carte cartes) {
		this.cartes = cartes;
	}



}