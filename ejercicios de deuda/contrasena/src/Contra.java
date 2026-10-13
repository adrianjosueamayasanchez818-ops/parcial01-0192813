import java.util.Scanner;

public class Contra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cree su contrasena");
        String contrasena = scanner.nextLine();

        String clave;
        while (true) {
            System.out.print("Ingrese la contrasena: ");
            clave = scanner.nextLine();
            if (clave.equals(contrasena)) {
                System.out.println("Contrasena correcta");
                break;
            }
            System.out.println("Contrasena incorrecta");
        }

        scanner.close();
    }
}
