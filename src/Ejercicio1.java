import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        //asicnacion del array
        int consumo[] = new int[10];
        
        //declaracion de variables
        int consutotal = 0;
        int mayor = 0;
        int pos = 0;
        int longitud = consumo.length;
        double promedio = 0;
        int superiorprom = 0;
        
        //fori para asicnar valores al array 
        for (int i = 0; i < longitud; i++) {

            System.out.println("ingrese el consumo del agua del sector " + (i+1));
            consumo[i] = scanner.nextInt();
            while (consumo[i] < 0) {
                System.out.println("valor invalodo");

                System.out.println("ingrese el consumo del agua del sector " + (i+1));
                 consumo[i] = scanner.nextInt();
            }
            if (consumo[i] >= 0 ) {
                consutotal += consumo[i];
                if (consumo[i] > mayor) {
                    mayor = consumo[i];
                    pos = i;
                }
            }
        }

        //calcular el promedio
        promedio = (double) consutotal/longitud;
        for (int i = 0; i < longitud; i++) {
         if (consumo[i] > promedio) {
            superiorprom ++;
         }
        }

        //salida de datos
        System.out.println();
        System.out.println("el sector :" + (pos+1) + " tiene mayor consumo y es de: " + mayor );
        System.out.println("el consumo total de todos los sectores es de: " + consutotal);
        System.out.println("el promedio es de: " + promedio);
        System.out.println(superiorprom + " tubieron un consumo superior al promedio");

        System.out.println();

        for (int i = 0; i < longitud; i++) {
            System.out.println("sector : " + (i+1) + " consumo: " + consumo[i]);
        }
    

        scanner.close();
    }
         
}