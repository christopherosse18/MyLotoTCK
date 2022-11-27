package Jackson;

import business.Carte;
import business.ListeCarte;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JsonToListeCarte {
    private static final Logger logger = Logger.getLogger(JsonToListeCarte.class.getName());

    public static ListeCarte importCarteJson() {
        ListeCarte cartes = new ListeCarte();
        try {
            ObjectMapper om = new ObjectMapper();
            JsonNode rootNode = om.readTree(new File("cartesLoto.json"));

            JsonNode listeCartes = rootNode.path("cartes");

            for (int i = 0; i < listeCartes.size(); i++) {

                String id = listeCartes.get(i).path("id").asText();
                ArrayList<Integer> listeR1 = new ArrayList<>();
                ArrayList<Integer> listeR2 = new ArrayList<>();
                ArrayList<Integer> listeR3 = new ArrayList<>();
                JsonNode rangee1 = listeCartes.get(i).get("rangees").get(0).get("rangee1");
                for (int j = 0; j < listeCartes.get(i).get("rangees").get(0).get("rangee1").size(); j++) {
                    listeR1.add(rangee1.get(j).asInt());
                }
                JsonNode rangee2 = listeCartes.get(i).get("rangees").get(0).get("rangee2");
                for (int j = 0; j < listeCartes.get(i).get("rangees").get(0).get("rangee2").size(); j++) {
                    listeR2.add(rangee2.get(j).asInt());
                }
                JsonNode rangee3 = listeCartes.get(i).get("rangees").get(0).get("rangee3");
                for (int j = 0; j < listeCartes.get(i).get("rangees").get(0).get("rangee3").size(); j++) {
                    listeR3.add(rangee3.get(j).asInt());
                }

                Carte carte = new Carte(id, listeR1, listeR2, listeR3);
                cartes.getCartes().add(carte);
            }
            //logger.log(Level.INFO, cartes.toString());
        } catch (IOException ex) {
           logger.log(Level.SEVERE, null, ex);
        }
        return cartes;
    }
}
