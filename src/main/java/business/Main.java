package business;

import static Jackson.MainReader.importCarteJson;

public class Main {
    public static void main(String[] args) {
        ListeCarte cartes = new ListeCarte();
        cartes = importCarteJson();
        /*GenerationCartes rangees = new GenerationCartes();
        rangees.buildCartes();*/
        ActionPlateau plateau = new ActionPlateau();
        plateau.buildPlateau();
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
        Carte tiree = cartes.getCarteById("A1");
        /*System.out.println(Operation.nombresEnCommun(plateau.plateau.getNombreTires(), rangees.rangee1));*/
        Operation.checkCarte(plateau.plateau.getNombreTires(), tiree);

        //Admin.initJeu();

    }
}