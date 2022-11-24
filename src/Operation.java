import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Operation {
    public static ArrayList<Integer> nombresEnCommun(Collection<Integer> listeBase, ArrayList<Integer> listeAComparer){
        ArrayList<Integer> nombresCommuns = new ArrayList<Integer>(listeBase);
        nombresCommuns.retainAll(listeAComparer);
        Collections.sort(nombresCommuns);
        return nombresCommuns;
    }

    public static void checkCarte(Collection<Integer> listeBase, GenerationCartes carteAControler){
        if ((nombresEnCommun(listeBase, carteAControler.rangee1).size() == 5) || (nombresEnCommun(listeBase, carteAControler.rangee2).size() == 5)
        || (nombresEnCommun(listeBase, carteAControler.rangee3).size() == 5)){
            carteAControler.setKineIsTrue(true);
            System.out.println("KINE BRUH");
        }
        if (((nombresEnCommun(listeBase, carteAControler.rangee1).size() == 5) && (nombresEnCommun(listeBase, carteAControler.rangee2).size() == 5)) ||
                ((nombresEnCommun(listeBase, carteAControler.rangee1).size() == 5) && (nombresEnCommun(listeBase, carteAControler.rangee3).size() == 5)) ||
                ((nombresEnCommun(listeBase, carteAControler.rangee2).size() == 5) && (nombresEnCommun(listeBase, carteAControler.rangee3).size() == 5))) {
            carteAControler.setDoubleKineIsTrue(true);
            System.out.println("DOUBLE KINE BRUH");
        }
        if ((nombresEnCommun(listeBase, carteAControler.rangee1).size() == 5) && (nombresEnCommun(listeBase, carteAControler.rangee2).size() == 5) &&
        (nombresEnCommun(listeBase, carteAControler.rangee3).size() == 5)) {
            carteAControler.setCartonIsTrue(true);
            System.out.println("CARTON BRUH");
        }
    }


}
