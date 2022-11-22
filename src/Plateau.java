import java.util.HashMap;
import java.util.Map;

public class Plateau {

	private HashMap<Integer, Integer> nombreTires;

	public Plateau(Map<Integer, Integer> nombreTires){
		nombreTires = this.nombreTires;
	}
	public HashMap<Integer, Integer> getNombreTires() {
		return this.nombreTires;
	}

	public void setNombreTires(HashMap<Integer, Integer> nombreTires) {
		this.nombreTires = nombreTires;
	}

}