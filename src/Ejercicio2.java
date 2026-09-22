import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
       
         Scanner scanner = new Scanner(System.in);
    int matriz[][] =  new int[4][5];

        int total = 0;
        int mayor = 0;
       int longitud = matriz.length;
       for (int i = 0; i < longitud; i++) {
           for (int j = 0; j < matriz[i].length; j++) {
               System.out.println("ingrese la produdcion de la maquina");
               matriz[i][j] = scanner.nextInt();
               if (matriz[i][j] > mayor) {
                 mayor = matriz[i][j];
               }
               total +=  matriz[i][j];
           }
        }
        for (int i = 0; i < longitud; i++) {
           for (int j = 0; j < matriz[i].length; j++) {
               System.out.print( "[" + matriz[i][j] + "] ");
           }
           System.out.println();
        }
        
        System.out.println("la mayor producido es de:" + mayor);
        System.out.println("el total producido es de:" + total);

      scanner.close();
    }
}
