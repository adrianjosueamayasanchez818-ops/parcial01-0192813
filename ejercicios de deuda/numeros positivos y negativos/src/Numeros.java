import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int longitud = numeros.length;
        int total =0;
        int may=0;
        int men=0;
        int ceros=0;
        System.out.println("Ingresa 10 numeros numero");
        for (int i = 0; i < longitud; i++) {
            System.out.println("Ingresa el numero " + (i+1));
            numeros[i] = scanner.nextInt();
            
            if (numeros[i]>0) {
                may ++;
            }
            if (numeros[i]<0) {
                men++;
            }
            if (numeros[i]==0) {
                ceros++;
            }
            total= total + numeros[i];
        }

        System.out.println("Hay "+ may+ " numeros mayores a 0");
        System.out.println("Hay "+ men+ " numeros menores a 0");
        System.out.println("Hay "+ ceros+ " numeros iguales a 0");

        System.out.println("");
        System.out.println("El total de todos estos numeros es: "+total);

        scanner.close();
    }
}
