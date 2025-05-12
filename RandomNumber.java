import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) + 1;
        }

        System.out.println("Array iniziale: " + Arrays.toString(arr));

        while (true) {
            try {
                System.out.println("Inserisci posizione da 0 a 4:");
                int posizione = scanner.nextInt();

                System.out.println("Inserisci nuovo valore (inserisci 0 per terminare):");
                int valore = scanner.nextInt();

                if (valore == 0) {
                    System.out.println("Fine programma.");
                    break;
                }

                if (posizione >= 0 && posizione < arr.length) {
                    arr[posizione] = valore;
                    System.out.println("Nuovo stato dell'array: " + Arrays.toString(arr));
                } else {
                    System.out.println("Posizione non valida! Riprova.");
                }
            }catch (Exception e){
                System.out.println("errore: input non valido ");
                scanner.next();
            }
        }

        scanner.close();
    }
}