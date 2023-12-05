package Es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci il numero di parole da inserire");
        int numeroParole = scanner.nextInt();
        System.out.println("numero di parole: "+numeroParole);
        scanner.nextLine();


        Set<String> parole = new HashSet<>();
        Set<String> paroleDoppie = new HashSet<>();

        for (int i = 0; i < numeroParole; i++) {
            System.out.println("inserisci una parola");
            String parola = scanner.next();

            if (parole.add(parola)) {
                parole.add(parola);
            }
            else {
                paroleDoppie.add(parola);
            }
        }

        System.out.println(parole);
        System.out.println(paroleDoppie);

        scanner.close();
    }
}