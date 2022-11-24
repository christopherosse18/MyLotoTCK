package business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Operation {
    public static ArrayList<Integer> nombresEnCommun(Collection<Integer> listeBase, ArrayList<Integer> listeAComparer){
        ArrayList<Integer> nombresCommuns = new ArrayList<Integer>(listeBase);
        nombresCommuns.retainAll(listeAComparer);
        Collections.sort(nombresCommuns);
        return nombresCommuns;
    }

    public static void checkCarte(Collection<Integer> listeBase, Carte carteAControler){
        if ((nombresEnCommun(listeBase, carteAControler.getCarteRangee1()).size() == 5) || (nombresEnCommun(listeBase, carteAControler.getCarteRangee2()).size() == 5)
        || (nombresEnCommun(listeBase, carteAControler.getCarteRangee3()).size() == 5)){
            carteAControler.setKineIsTrue(true);
            System.out.println("KINE BRUH");
        }
        if (((nombresEnCommun(listeBase, carteAControler.getCarteRangee1()).size() == 5) && (nombresEnCommun(listeBase, carteAControler.getCarteRangee2()).size() == 5)) ||
                ((nombresEnCommun(listeBase, carteAControler.getCarteRangee1()).size() == 5) && (nombresEnCommun(listeBase, carteAControler.getCarteRangee3()).size() == 5)) ||
                ((nombresEnCommun(listeBase, carteAControler.getCarteRangee2()).size() == 5) && (nombresEnCommun(listeBase, carteAControler.getCarteRangee3()).size() == 5))) {
            carteAControler.setDoubleKineIsTrue(true);
        }
        if ((nombresEnCommun(listeBase, carteAControler.getCarteRangee1()).size() == 5) && (nombresEnCommun(listeBase, carteAControler.getCarteRangee2()).size() == 5) &&
        (nombresEnCommun(listeBase, carteAControler.getCarteRangee3()).size() == 5)) {
            carteAControler.setCartonIsTrue(true);
        }
    }

}
