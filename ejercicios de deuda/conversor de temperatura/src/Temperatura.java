import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        int opcion = scanner.nextInt();

        System.out.println("Ingrese la temperatura:");
        double temp = scanner.nextDouble();

        if (opcion == 1) {
            System.out.println(temp + " C = " + (temp * 9 / 5 + 32) + " F");
        } else if (opcion == 2) {
            System.out.println(temp + " F = " + ((temp - 32) * 5 / 9) + " C");
        } else {
            System.out.println("Opcion no valida");
        }

        scanner.close();
    }
}