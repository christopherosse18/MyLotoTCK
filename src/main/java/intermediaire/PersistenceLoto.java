package intermediaire;

import Jackson.JsonToListeCarte;
import business.ListeCarte;

public class PersistenceLoto {

    public static GestionCartes readerListeCarteJson(){
        return JsonToListeCarte.importCarteJson();
    }
}
