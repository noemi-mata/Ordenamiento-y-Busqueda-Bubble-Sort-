//Autor: Noemi Mata Ruiz
//Jueves 05 noviembre 2026

// Clase OrdenadorBurbuja: aquí está el algoritmo de Bubble Sort
// Hace lo mismo que hicimos en clase con la fila de compañeros
public class OrdenadorBurbuja {

    // El contador es privado, solo esta clase lo usa mientras ordena
    private Contador contador;

    public OrdenadorBurbuja() {
        contador = new Contador();
    }

    // Método principal que pide la actividad: bubbleSort(int[] arreglo)
    // Ordena el arreglo y deja el resultado en el mismo arreglo
    public void bubbleSort(int[] arreglo) {
        contador.reiniciar();
        Fila fila = new Fila(arreglo);
        int n = fila.getTamano();
        boolean huboCambio = true;
        int i = 1;

        // Muestro cómo estaba la fila al principio
        System.out.println("Fila inicial: " + fila);

        // Aquí empiezan las pasadas, las repito mientras alguien se siga cambiando de lugar
        while (i < n && huboCambio) {
            huboCambio = false;

            // En cada pasada voy comparando a cada compañero con el que tiene a su derecha
            // Uso n - i porque los últimos ya están en su lugar y ya no los tomo en cuenta
            for (int j = 0; j < n - i; j++) {
                contador.sumarComparacion();

                // Si el de la izquierda es mayor, se cambian de lugar
                if (fila.esMayorQueElDeLaDerecha(j)) {
                    fila.intercambiarConElDeLaDerecha(j);
                    contador.sumarIntercambio();
                    // Marco que sí hubo un cambio en esta pasada
                    huboCambio = true;
                }
            }

            // Al terminar la pasada muestro cómo quedó la fila
            contador.sumarPasada();
            System.out.println("Pasada " + i + ": " + fila);
            i++;
        }

        // Copio la fila ya ordenada al arreglo que me pasaron
        int[] ordenado = fila.getNumeros();
        for (int k = 0; k < arreglo.length; k++) {
            arreglo[k] = ordenado[k];
        }

        // Cuando ya nadie se cambió de lugar, la fila quedó ordenada y muestro los resultados
        contador.mostrarResultados();
        System.out.println();
    }

    // Getter para poder consultar los contadores desde afuera sin modificarlos
    public Contador getContador() {
        return contador;
    }
}
