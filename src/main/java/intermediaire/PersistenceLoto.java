package intermediaire;

import Jackson.JsonToListeCarte;
import business.ListeCarte;

public class PersistenceLoto {

    public static ListeCarte readerListeCarteJson() {
        return JsonToListeCarte.importCarteJson();
    }
}
