import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
       
       Scanner scanner = new Scanner(System.in);
       int produccion[][] =  new int[4][5];

       //pedir los datos de las maquinas 
       int longitud = produccion.length;
       for (int i = 0; i < longitud; i++) {
           for (int j = 0; j < produccion[i].length; j++) {
               System.out.println("ingrese la produdcion de la maquina " + (i+1) + " del dia: " + (j+1));
               produccion[i][j] = scanner.nextInt();

               while (produccion[i][j] < 0) {
                 System.out.println("valor incorrecto");
                  produccion[i][j] = scanner.nextInt();
               }
           }
        }
        
        //el total de cada maquina
        int[] totalmaquina = new int[4];
        for (int i = 0; i < 4; i++) {
            int suma = 0;
            for (int j = 0; j < 5; j++) {
                suma = suma + produccion[i][j];
            }
            totalmaquina[i] = suma;
        }

        //total de cada dia
        int[] totaldia = new int[5];
        for (int j = 0; j < 5; j++) {
            int suma = 0;
            for (int i = 0; i < 4; i++) {
                suma = suma + produccion[i][j];
            }
            totaldia[j] = suma;
        }
        
        //mayor produccion por maquina
        int maquinamayor = 0;
        for (int i = 1; i < 4; i++) {
            if (totalmaquina[i] > totalmaquina[maquinamayor]) {
                maquinamayor = i;
            }
        }

         //menor produccion por dia
        int diaMenor = 0;
        for (int j = 1; j < 5; j++) {
            if (totaldia[j] < totaldia[diaMenor]) {
                diaMenor = j;
            }
        }

        //mostrar la matriz
        for (int i = 0; i < longitud; i++) {
           for (int j = 0; j < produccion[i].length; j++) {
               System.out.print( "[" + produccion[i][j] + "] ");
           }
           System.out.println();
        }
        
        //mostrar los resultados
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println("total de la maquina " + (i+1) + ": " + totalmaquina[i]);
        }
 
        for (int j = 0; j < 5; j++) {
            System.out.println("total del dia " + (j+1) + ": " + totaldia[j]);
        }
 
        System.out.println("la maquina que tiene mayor produccion es la " + (maquinamayor+1));
        System.out.println("el dia que tiene menor produccion es el dia " + (diaMenor+1));

        scanner.close();
    }
}
