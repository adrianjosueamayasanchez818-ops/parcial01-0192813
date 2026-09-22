
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int consumo[] = new int[10];
        
        int consutotal = 0;
        int mayor = 0;
        int longitud = consumo.length;
        for (int i = 0; i < longitud; i++) {
            System.out.println("ingrese el consumo del agua del sector " + (i+1));
            consumo[i] = scanner.nextInt();
            
            if (consumo[i] >= 0 ) {
                consutotal += consumo[i];
                if (consumo[i] > mayor) {
                    mayor = consumo[i];
                }
            }else{
                System.out.println("valor invalido");
            }
                
        }
        System.out.println("el mayor consumo total es de: " + mayor);
        System.out.println("el consumo total es de: " + consutotal);
        double promedio = consutotal/longitud;
         System.out.println("el promedio es de: " + promedio);

        scanner.close();
    }
         
}

 