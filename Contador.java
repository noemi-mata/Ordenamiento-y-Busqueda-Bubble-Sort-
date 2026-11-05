//Autor: Noemi Mata Ruiz
//Jueves 05 noviembre 2026

// Clase Contador: lleva la cuenta de lo que pasa mientras ordeno
// Los contadores son privados y solo se pueden aumentar con sus métodos

public class Contador {

    private int comparaciones;
    private int intercambios;
    private int pasadas;

    // Al crear el contador, todo empieza en cero
    public Contador() {
        reiniciar();
    }

    // Pongo los contadores en cero para empezar a contar otra vez
    public void reiniciar() {
        comparaciones = 0;
        intercambios = 0;
        pasadas = 0;
    }

    // Sumo una comparación cada vez que comparo a dos compañeros
    public void sumarComparacion() {
        comparaciones++;
    }

    // Sumo un intercambio cada vez que dos compañeros se cambian de lugar
    public void sumarIntercambio() {
        intercambios++;
    }

    // Sumo una pasada cada vez que termino de recorrer la fila
    public void sumarPasada() {
        pasadas++;
    }

    // Getters: solo dejan leer los valores, no cambiarlos
    public int getComparaciones() {
        return comparaciones;
    }

    public int getIntercambios() {
        return intercambios;
    }

    public int getPasadas() {
        return pasadas;
    }

    // Muestro los resultados finales
    public void mostrarResultados() {
        System.out.println("Pasadas: " + pasadas);
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Intercambios: " + intercambios);
    }
}
