package operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Operation {
    public static ArrayList<Integer> nombresEnCommun(Collection<Integer> listeBase, ArrayList<Integer> listeAComparer) {
        ArrayList<Integer> nombresCommuns = new ArrayList<Integer>(listeBase);
        nombresCommuns.retainAll(listeAComparer);
        Collections.sort(nombresCommuns);
        return nombresCommuns;
    }

    public static boolean saisieEstBonne(String nombre) {
        String message;
        if (!checkEstString(nombre)) {
            return false;
        } else if (checkEstNegatif(nombre)) {
            return false;
        } else if (!checkEstRange(nombre)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkEstNegatif(String nombre) {
        int intNombre = Integer.parseInt(nombre);
        if (intNombre < 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkEstString(String nombre) {
        if (nombre.chars().allMatch(Character::isDigit)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkEstRange(String nombre) {
        int intNombre = Integer.parseInt(nombre);
        if (intNombre > 90) {
            return false;
        } else {
            return true;
        }
    }


}
