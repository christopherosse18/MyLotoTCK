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



}
