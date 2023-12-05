package Es2;
import java.util.*;


public class Main2 {
    public static void main(String[] args) {
        List<Integer> listaNumeri = new ArrayList<>();
        generatoreNumeriCasuali(listaNumeri, 10);
        invertiLista(listaNumeri);
    }

    public static void generatoreNumeriCasuali (List<Integer> listaNumeri, int lunghezza){
        Random random = new Random();
        for(int i = 0; i < lunghezza; i++) {
            int numero = random.nextInt(101);
            listaNumeri.add(numero);
        }

        System.out.println(listaNumeri);
    }

    public static void invertiLista (List<Integer> listaNumeri){
        Collections.reverse(listaNumeri);
        System.out.println(listaNumeri);
    }

}
