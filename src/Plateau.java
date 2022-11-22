import java.util.HashMap;
import java.util.Map;

public class Plateau {

	private HashMap<Integer, Integer> nombreTires;

	public Plateau(){
		nombreTires = initialiseNombres();
	};
	public Plateau(HashMap<Integer, Integer> nombreTires){
		nombreTires = this.nombreTires;
	}
	public HashMap<Integer, Integer> getNombreTires() {
		return this.nombreTires;
	}

	public void setNombreTires(HashMap<Integer, Integer> nombreTires) {
		this.nombreTires = nombreTires;
	}

	public void put(int nombre){
		nombreTires.put(nombre, nombre);
	}

	public HashMap<Integer, Integer> initialiseNombres(){
		return new HashMap<>();
	}

	public boolean containsKey(int nombre){
		return nombreTires.containsKey(nombre);
	}

}