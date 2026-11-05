//Autor: Noemi Mata Ruiz
//Jueves 05 noviembre 2026

// Clase Fila: representa la fila de compañeros de la actividad
// Guardo los números en un arreglo privado para que nadie lo cambie desde afuera
public class Fila {

    // Atributo privado: solo esta clase puede tocar el arreglo directamente
    private int[] numeros;

    // Constructor: copio el arreglo que me pasan para no modificar el original
    public Fila(int[] numeros) {
        this.numeros = numeros.clone();
    }

    // Regresa cuántos compañeros hay en la fila
    public int getTamano() {
        return numeros.length;
    }

    // Regresa el número del compañero en una posición
    public int getNumero(int posicion) {
        return numeros[posicion];
    }

    // Regresa una copia de la fila, así afuera no pueden cambiar la original
    public int[] getNumeros() {
        return numeros.clone();
    }

    // Reviso si el de la izquierda es mayor que el de su derecha
    public boolean esMayorQueElDeLaDerecha(int posicion) {
        return numeros[posicion] > numeros[posicion + 1];
    }

    // Intercambio a dos compañeros que están juntos
    // Uso aux para guardar un número y no perderlo al hacer el cambio
    public void intercambiarConElDeLaDerecha(int posicion) {
        int aux = numeros[posicion];
        numeros[posicion] = numeros[posicion + 1];
        numeros[posicion + 1] = aux;
    }

    // Convierto la fila en texto para poder mostrarla en pantalla
    @Override
    public String toString() {
        String texto = "";
        for (int i = 0; i < numeros.length; i++) {
            texto += numeros[i] + " ";
        }
        return texto.trim();
    }
}
