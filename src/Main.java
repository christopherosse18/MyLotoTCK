import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        GenerationCartes rangees = new GenerationCartes();
        rangees.buildCartes();
        ActionPlateau plateau = new ActionPlateau();
        plateau.buildPlateau();
        System.out.println(rangees.getCarte());
        System.out.println(plateau.insertionNum("1"));
        System.out.println(plateau.insertionNum("14"));
        System.out.println(plateau.insertionNum("35"));
        System.out.println(plateau.insertionNum("56"));
        System.out.println(plateau.insertionNum("71"));
        System.out.println(plateau.insertionNum("87"));
        System.out.println(plateau.insertionNum("88"));
        System.out.println(plateau.insertionNum("89"));
        System.out.println(plateau.insertionNum("21"));
        System.out.println(plateau.insertionNum("40"));
        System.out.println(plateau.insertionNum("69"));
        System.out.println(plateau.insertionNum("82"));
        System.out.println(plateau.insertionNum("12"));
        System.out.println(plateau.insertionNum("36"));
        System.out.println(plateau.insertionNum("57"));
        System.out.println(plateau.insertionNum("73"));
        System.out.println(plateau.insertionNum("84"));
        System.out.println(plateau.plateau.getNombreTires());
        System.out.println(Operation.nombresEnCommun(plateau.plateau.getNombreTires(), rangees.rangee1));
        Operation.checkCarte(plateau.plateau.getNombreTires(), rangees);
        System.out.println(rangees.getKineIsTrue());

        //Admin.initJeu();

    }
}