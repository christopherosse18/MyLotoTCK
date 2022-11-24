package business;

import java.util.ArrayList;
import java.util.List;

public class ListeCarte {

    private List<Carte> cartes = new ArrayList<>();

    public ListeCarte() {
    }

    public List<Carte> getCartes() {
        return cartes;
    }

    public void setCartes(List<Carte> cartes) {
        this.cartes = cartes;
    }

    public Carte getCarteById(String id){
        Carte carteTrouvee = new Carte();
        for (Carte carte:
             cartes) {
            if (carte.getId().equals(id)){
                carteTrouvee = carte;
            }
        }
        return carteTrouvee;
    }

    @Override
    public String toString() {
        return "ListeCarte{" +
                "cartes=" + cartes.toString() +
                '}'+"\n";
    }
}
