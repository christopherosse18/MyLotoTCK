package business;

import static Jackson.MainReader.importCarteJson;

public class Main {
    public static void main(String[] args) {
        //Importe les cartes et créé les objets
        ListeCarte cartes = importCarteJson();
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

        //Récupère l'objet retourné par la méthode
        Carte tiree = cartes.getCarteById("A1");
        //Méthode pour vérifier si les n° tirés sont présent sur la carte
        //passée dans le dernier paramètre
        Operation.checkCarte(plateau.plateau.getNombreTires(), tiree);

        //Admin.initJeu();

    }
}