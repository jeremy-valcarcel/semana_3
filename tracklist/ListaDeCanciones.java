import java.util.HashMap;

public class ListaDeCanciones {
    public HashMap<String, String> trackList() {

        HashMap<String, String> listaHash = new HashMap<String, String>();
        listaHash.put("Hasta la piel", "no te quiero perder que la distancia es");
        listaHash.put("Divino","vivo dentro de un poema" );
        listaHash.put("despertar junto a ti ya no tener miedo a","Diamantes");
        listaHash.put("tristezas aceptar que te entregue mis dias","No Me Llames" );
        return listaHash;
    }
}