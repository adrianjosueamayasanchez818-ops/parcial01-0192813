
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int consumo[] = new int[10];
        
       
        int longitud = consumo.length;
        for (int i = 0; i < longitud; i++) {
            System.out.println("ingrese el consumo del agua del sector " + (i+1));
            consumo[i] = scanner.nextInt();
             int consutotal = 0;
            if (consumo[i] >= 0 ) {
                consutotal += consumo[i];
            }else{
                System.out.println("valor invalido");
            }
                
            }
        }
    }

