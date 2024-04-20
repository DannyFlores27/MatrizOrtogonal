
package programacioniii.matrizortogonal.logica;

public class Nodo {
    
    private Vehiculo vehiculo; // Almacena el vehículo asociado al nodo
    private Nodo siguienteFila; // Referencia al siguiente nodo en la misma fila
    private Nodo siguienteColumna; // Referencia al siguiente nodo en la misma columna

    // Constructor para inicializar un nodo con un vehículo dado
    public Nodo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.siguienteFila = null;
        this.siguienteColumna = null;
    }

    // Métodos de acceso y modificación para el vehículo, siguiente fila y siguiente columna
    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }

    public Nodo getSiguienteFila() {
        return this.siguienteFila;
    }

    public Nodo getSiguienteColumna() {
        return this.siguienteColumna;
    }

    public void setSiguienteFila(Nodo siguiente) {
        this.siguienteFila = siguiente;
    }

    public void setSiguienteColumna(Nodo siguiente) {
        this.siguienteColumna = siguiente;
    }
    
}
