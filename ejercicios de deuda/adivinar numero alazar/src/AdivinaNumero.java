import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secreto = random.nextInt(100) + 1;
        int intentos = 0;
        int intento;

        do {
            System.out.println("Adivine el numero (1-100):");
            intento = scanner.nextInt();
            intentos++;

            if (intento < secreto) {
                System.out.println("El numero es mayor");
            } else if (intento > secreto) {
                System.out.println("El numero es menor");
            }
        } while (intento != secreto);

        System.out.println("adivinaste el numero en " + intentos + " intentos");

        scanner.close();
    }
}