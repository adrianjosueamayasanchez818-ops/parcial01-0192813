import java.util.Scanner;
public class tien {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String[] productos = new String[5];
        int[] precio = new int[5];
        long longitud = precio.length;

        int total = 0;
        int mayorprecio=0;
        String mayorprod= "";
        for (int i = 0; i < longitud; i++) {
            System.out.println("Ingresa el nombre del nuevo producto " + (i+1));
            productos[i]= scanner.nextLine();
            System.out.println("Ingresa el precio del nuevo producto " + (i+1));
            precio[i] = scanner.nextInt();
            scanner.nextLine();
        }
        for (int i = 0; i < longitud; i++) {
            System.out.println("El nuevo producto "+productos[i]+" cuesta "+precio[i]);
            total=total+precio[i];
            if (mayorprecio<precio[i]){
                mayorprecio = precio[i];
                mayorprod = productos[i];
            }
            System.out.println("");
        }
        
        System.out.println("El producto de mayor precio es "+mayorprod+" con un valor de "+mayorprecio);

        System.out.println("La suma de todos los nuevos productos es de "+total);

        scanner.close();
    }
}
