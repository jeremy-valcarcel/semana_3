import java.util.HashMap;
import java.util.Set;

public class TestListaDeCanciones {
    public static void main(String[] args) {
        ListaDeCanciones manipulador = new ListaDeCanciones();

        HashMap<String, String> lista = manipulador.trackList();
        Set<String> claves = lista.keySet();
        for (String key : claves) {
            System.out.println("Nombre cancion " + key);
            System.out.println("Letra cancion:" + lista.get(key));
        }
    }
}
