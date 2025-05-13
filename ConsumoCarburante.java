import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ConsumoCarburante {

    private static final Logger log = LoggerFactory.getLogger(ConsumoCarburante.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserire numero km percorsi");
            double kmPercorsi = scanner.nextDouble();

            System.out.println("Inserire litri usati");
            double litriUsati = scanner.nextDouble();

            if (kmPercorsi <= 0 && litriUsati <= 0) {
                System.out.println("ERRORE: Inserire valori postivi");
            } else {
                double consumo = kmPercorsi / litriUsati;
                System.out.println("Consumo = " + consumo);
            }
        }catch(Exception e){
            System.out.println("Inserisci valori validi");
        }
        scanner.close();
    }
}
