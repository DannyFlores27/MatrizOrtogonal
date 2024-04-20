
package programacioniii.matrizortogonal.logica;

import java.util.ArrayList;
import java.util.List;

public class MatrizDinamica {
    
    private Nodo[][] matriz; // Representa la matriz ortogonal como una matriz de nodos
    private int filas;
    private int columnas;

    // Constructor para inicializar la matriz ortogonal con el número de filas y columnas dados
    public MatrizDinamica(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new Nodo[filas][columnas];
    }

    // Método para insertar un vehículo en una posición específica de la matriz
    public void insertarDato(int fila, int columna, Vehiculo vehiculo) {

        Nodo nuevoNodo = new Nodo(vehiculo);
        if (matriz[fila][columna] == null) {
            matriz[fila][columna] = nuevoNodo;
        } else {
            Nodo nodoActual = matriz[fila][columna];
            while (nodoActual.getSiguienteFila() != null) {
                nodoActual = nodoActual.getSiguienteFila();
            }
            nodoActual.setSiguienteFila(nuevoNodo);
        }
        if (fila > 0 && matriz[fila - 1][columna] != null) {
            Nodo nodoAnteriorFila = matriz[fila - 1][columna];
            while (nodoAnteriorFila.getSiguienteColumna() != null) {
                nodoAnteriorFila = nodoAnteriorFila.getSiguienteColumna();
            }
            nodoAnteriorFila.setSiguienteColumna(nuevoNodo);
        }
        if (columna > 0 && matriz[fila][columna - 1] != null) {
            Nodo nodoAnteriorColumna = matriz[fila][columna - 1];
            while (nodoAnteriorColumna.getSiguienteFila() != null) {
                nodoAnteriorColumna = nodoAnteriorColumna.getSiguienteFila();
            }
            nodoAnteriorColumna.setSiguienteFila(nuevoNodo);
        }
    }

    // Método para obtener el vehículo en una posición específica de la matriz
    public Vehiculo obtenerDato(int fila, int columna) {
        // Restar 1 a fila y columna
        fila--;
        columna--;
        return matriz[fila][columna] != null ? matriz[fila][columna].getVehiculo() : null;
    }

    // Método para buscar vehículos por diferentes criterios
    public List<Vehiculo> buscarVehiculos(String criterio, String valor) {
        List<Vehiculo> vehiculosEncontrados = new ArrayList<>();
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                Nodo nodoActual = matriz[fila][columna];
                while (nodoActual != null) {
                    Vehiculo vehiculo = nodoActual.getVehiculo();
                    // Restar 1 a fila y columna
                    if (criterio.equalsIgnoreCase("placa") && vehiculo.getPlaca().equalsIgnoreCase(valor)) {
                        vehiculosEncontrados.add(vehiculo);
                    } else if (criterio.equalsIgnoreCase("color") && vehiculo.getColor().equalsIgnoreCase(valor)) {
                        vehiculosEncontrados.add(vehiculo);
                    } else if (criterio.equalsIgnoreCase("linea") && vehiculo.getLinea().equalsIgnoreCase(valor)) {
                        vehiculosEncontrados.add(vehiculo);
                    } else if (criterio.equalsIgnoreCase("modelo") && Integer.toString(vehiculo.getModelo()).equalsIgnoreCase(valor)) {
                        vehiculosEncontrados.add(vehiculo);
                    } else if (criterio.equalsIgnoreCase("propietario") && vehiculo.getPropietario().equalsIgnoreCase(valor)) {
                        vehiculosEncontrados.add(vehiculo);
                    }
                    nodoActual = nodoActual.getSiguienteFila();
                }
            }
        }
        return vehiculosEncontrados;
    }

    // Método para buscar nodos que contienen vehículos por criterio y valor
    public List<Nodo> buscarNodosVehiculo(String criterio, String valor) {
        List<Nodo> nodosEncontrados = new ArrayList<>();
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                Nodo nodoActual = matriz[fila][columna];
                while (nodoActual != null) {
                    Vehiculo vehiculo = nodoActual.getVehiculo();
                    // Restar 1 a fila y columna
                    if (criterio.equalsIgnoreCase("placa") && vehiculo.getPlaca().equalsIgnoreCase(valor)) {
                        nodosEncontrados.add(nodoActual);
                    } else if (criterio.equalsIgnoreCase("color") && vehiculo.getColor().equalsIgnoreCase(valor)) {
                        nodosEncontrados.add(nodoActual);
                    } else if (criterio.equalsIgnoreCase("linea") && vehiculo.getLinea().equalsIgnoreCase(valor)) {
                        nodosEncontrados.add(nodoActual);
                    } else if (criterio.equalsIgnoreCase("modelo") && Integer.toString(vehiculo.getModelo()).equalsIgnoreCase(valor)) {
                        nodosEncontrados.add(nodoActual);
                    } else if (criterio.equalsIgnoreCase("propietario") && vehiculo.getPropietario().equalsIgnoreCase(valor)) {
                        nodosEncontrados.add(nodoActual);
                    }
                    nodoActual = nodoActual.getSiguienteFila();
                }
            }
        }
        return nodosEncontrados;
    }

    // Método para eliminar un vehículo de una posición específica de la matriz
    public void eliminarDato(int fila, int columna) {
        // Restar 1 a fila y columna
        fila--;
        columna--;
        if (matriz[fila][columna] != null) {
            matriz[fila][columna] = null;
            if (fila > 0 && matriz[fila - 1][columna] != null) {
                Nodo nodoAnteriorFila = matriz[fila - 1][columna];
                while (nodoAnteriorFila.getSiguienteColumna() != null) {
                    if (nodoAnteriorFila.getSiguienteColumna().getVehiculo() == null) {
                        nodoAnteriorFila.setSiguienteColumna(null);
                        break;
                    }
                    nodoAnteriorFila = nodoAnteriorFila.getSiguienteColumna();
                }
            }
            if (columna > 0 && matriz[fila][columna - 1] != null) {
                Nodo nodoAnteriorColumna = matriz[fila][columna - 1];
                while (nodoAnteriorColumna.getSiguienteFila() != null) {
                    if (nodoAnteriorColumna.getSiguienteFila().getVehiculo() == null) {
                        nodoAnteriorColumna.setSiguienteFila(null);
                        break;
                    }
                    nodoAnteriorColumna = nodoAnteriorColumna.getSiguienteFila();
                }
            }
        }
    }

    // Método para eliminar un vehículo de una posición específica de la matriz dado un nodo
    public void eliminarDatoConNodo(Nodo nodo) {
        if (nodo != null) {
            // Obtener la posición del nodo en la matriz
            int fila = -1;
            int columna = -1;
            outerloop:
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (matriz[i][j] == nodo) {
                        fila = i;
                        columna = j;
                        break outerloop;
                    }
                }
            }
            // Eliminar el nodo de la matriz y las referencias a él desde filas y columnas vecinas
            if (fila != -1 && columna != -1) {
                matriz[fila][columna] = null;
                if (fila > 0 && matriz[fila - 1][columna] != null) {
                    Nodo nodoAnteriorFila = matriz[fila - 1][columna];
                    while (nodoAnteriorFila.getSiguienteColumna() != null) {
                        if (nodoAnteriorFila.getSiguienteColumna().getVehiculo() == null) {
                            nodoAnteriorFila.setSiguienteColumna(null);
                            break;
                        }
                        nodoAnteriorFila = nodoAnteriorFila.getSiguienteColumna();
                    }
                }
                if (columna > 0 && matriz[fila][columna - 1] != null) {
                    Nodo nodoAnteriorColumna = matriz[fila][columna - 1];
                    while (nodoAnteriorColumna.getSiguienteFila() != null) {
                        if (nodoAnteriorColumna.getSiguienteFila().getVehiculo() == null) {
                            nodoAnteriorColumna.setSiguienteFila(null);
                            break;
                        }
                        nodoAnteriorColumna = nodoAnteriorColumna.getSiguienteFila();
                    }
                }
            }
        }
    }

    public void mostrarVehiculos() {
        System.out.println("Vehículos almacenados en la matriz:");
        System.out.println("-------------------------");
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                Nodo nodoActual = matriz[fila][columna];
                while (nodoActual != null) {
                    Vehiculo vehiculo = nodoActual.getVehiculo();
                    // Sumar 1 a fila y columna al mostrar
                    System.out.println("Fila: " + (fila + 1) + ", Columna: " + (columna + 1) + " \n " + vehiculo);
                    System.out.println("-------------------------");
                    nodoActual = nodoActual.getSiguienteFila();
                }
            }
        }
    }
    
}
