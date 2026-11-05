//Autor: Noemi Mata Ruiz
//Jueves 05 noviembre 2026

// Clase Main: aquí arranca el programa
// Pido los números de la fila y hago las pruebas que pide la actividad
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        OrdenadorBurbuja ordenador = new OrdenadorBurbuja();
        int[] fila = new int[5];

        // Primero pido el número de cada compañero, así como nos formamos en la fila
        System.out.println("=== Nuestra fila de la clase ===");
        for (int i = 0; i < fila.length; i++) {
            System.out.print("Numero del compañero " + (i + 1) + ": ");
            fila[i] = leer.nextInt();
        }
        ordenador.bubbleSort(fila);

        // Después hago las pruebas que pide la actividad
        System.out.println("=== Prueba 1: arreglo de ejemplo ===");
        ordenador.bubbleSort(new int[]{34, 12, 25, 8, 19});

        System.out.println("=== Prueba 2: arreglo ya ordenado ===");
        ordenador.bubbleSort(new int[]{8, 12, 19, 25, 34});

        System.out.println("=== Prueba 3: arreglo en orden inverso ===");
        ordenador.bubbleSort(new int[]{34, 25, 19, 12, 8});

        leer.close();
    }
}
