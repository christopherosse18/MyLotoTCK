package intermediaire;

import business.Carte;
import business.ListeCarte;

import java.util.Collection;

import static operations.Operation.nombresEnCommun;

public class GestionCartes {

    private ListeCarte cartes;

    public static void checkCarte(Collection<Integer> listeBase, Carte carteAControler) {
        if ((nombresEnCommun(listeBase, carteAControler.getCarteRangee1()).size() == 5) || (nombresEnCommun(listeBase, carteAControler.getCarteRangee2()).size() == 5)
                || (nombresEnCommun(listeBase, carteAControler.getCarteRangee3()).size() == 5)) {
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

    public void buildListeCarte() {
        cartes = new ListeCarte();
    }

    public ListeCarte getCartes() {
        return cartes;
    }

    public void setCartes(ListeCarte cartes) {
        this.cartes.setCartes(cartes);
    }

    public Carte getCarteById(String id) {
        return cartes.getCarteById(id);
    }

    public void add(Carte carte) {
        cartes.getCartes().add(carte);
    }
}