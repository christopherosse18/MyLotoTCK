public class Main {
    public static void main(String[] args) {
        System.out.println("Hello worlvcxcvxcxvd!");

        ActionPlateau plateau = new ActionPlateau();

        plateau.buildPlateau();

        System.out.println(plateau.insertionNum("5"));
        System.out.println(plateau.insertionNum("A"));
        System.out.println(plateau.insertionNum("-1"));
        System.out.println(plateau.insertionNum("20"));
        System.out.println(plateau.insertionNum("38"));
        System.out.println(plateau.insertionNum("A"));
        System.out.println(plateau.rechercheNombre(20));

        System.out.println(plateau.plateau.getNombreTires());
    }
//testkev
}