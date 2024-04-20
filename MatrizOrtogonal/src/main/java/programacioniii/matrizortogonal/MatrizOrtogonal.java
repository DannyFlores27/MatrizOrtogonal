
package programacioniii.matrizortogonal;

import java.util.Scanner;
import java.util.List;
import programacioniii.matrizortogonal.logica.MatrizDinamica;
import programacioniii.matrizortogonal.logica.Nodo;
import programacioniii.matrizortogonal.logica.Vehiculo;

public class MatrizOrtogonal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int filas = 0;
        int columnas = 0;
        MatrizDinamica matriz = null;

        boolean dimensionesValidas = false;

        while (!dimensionesValidas) {
            try {
                System.out.println("Menú #1");
                System.out.println("1. Ingresar cantidad de filas y columnas");
                System.out.println("2. Generar cantidad aleatoria de filas y columnas");
                System.out.println("3. Salir");
                System.out.print("Ingrese su opción: ");
                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el número de filas: ");
                        filas = Integer.parseInt(scanner.nextLine());
                        System.out.print("Ingrese el número de columnas: ");
                        columnas = Integer.parseInt(scanner.nextLine());
                        dimensionesValidas = true;
                        break;

                    case 2:
                        // Generar números aleatorios para filas y columnas hasta que ambos sean mayores o iguales a cero
                        do {
                            filas = (int) (Math.random() * 10) + 1;
                            columnas = (int) (Math.random() * 10) + 1;
                        } while (filas < 0 || columnas < 0);

                        // Mostrar el número de filas y columnas generadas
                        System.out.println("Se han generado " + filas + " filas y " + columnas + " columnas.");

                        // Marcar que las dimensiones son válidas y salir del bucle
                        dimensionesValidas = true;
                        break; // Salir del case
                        
                    case 3:
                        System.out.println("Saliendo del programa...");
                        return;

                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                        break;
                }

                if (dimensionesValidas) {
                    matriz = new MatrizDinamica(filas, columnas);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Por favor, ingrese valores válidos para filas y columnas.");
            }
        }

        boolean continuar = true;
        while (continuar) {
            try {
                System.out.println("\nMenú #2");
                System.out.println("1. Ingresar vehículo");
                System.out.println("2. Buscar vehículo");
                System.out.println("3. Eliminar vehículo");
                System.out.println("4. Mostrar todos los vehículos guardados");
                System.out.println("5. Salir");
                System.out.print("Ingrese su opción: ");
                int opcionMenu2 = Integer.parseInt(scanner.nextLine());

                switch (opcionMenu2) {
                    case 1:
                        System.out.print("Ingrese la placa del vehículo: ");
                        String placa = scanner.nextLine();
                        System.out.print("Ingrese el color del vehículo: ");
                        String color = scanner.nextLine();
                        System.out.print("Ingrese la línea del vehículo: ");
                        String linea = scanner.nextLine();
                        System.out.print("Ingrese el modelo del vehículo: ");
                        int modelo = Integer.parseInt(scanner.nextLine());
                        System.out.print("Ingrese el nombre del propietario del vehículo: ");
                        String propietario = scanner.nextLine();

                        Vehiculo nuevoVehiculo = new Vehiculo(placa, color, linea, modelo, propietario);

                        boolean guardar = true;
                        while (guardar) {
                            System.out.println("\nMenú #3");
                            System.out.println("1. Ingresar posición");
                            System.out.println("2. Posición aleatoria");
                            System.out.println("3. Cancelar");
                            System.out.print("Ingrese su opción: ");
                            int opcionMenu3 = Integer.parseInt(scanner.nextLine());

                            switch (opcionMenu3) {
                                case 1:
                                    System.out.print("Ingrese la fila para guardar el vehículo: ");
                                    int fila = Integer.parseInt(scanner.nextLine());
                                    if (fila < 0 || fila > filas) {
                                        System.out.println("Fila no válida. Debe estar entre 1 y " + (filas) + ".");
                                        break;
                                    }
                                    System.out.print("Ingrese la columna para guardar el vehículo: ");
                                    int columna = Integer.parseInt(scanner.nextLine());
                                    if (columna < 0 || columna > columnas) {
                                        System.out.println("Columna no válida. Debe estar entre 1 y " + (columnas) + ".");
                                        break;
                                    }
                                    //Restar 1 a fila y columna
                                    fila--;
                                    columna--;
                                    matriz.insertarDato(fila, columna, nuevoVehiculo);
                                    guardar = false;
                                    break;

                                case 2:
                                    // Generar números aleatorios en un rango dentro de la matriz
                                    int filaAleatoria;
                                    int columnaAleatoria;

                                    // Generar números aleatorios hasta que se encuentre una posición válida en la matriz
                                    do {
                                        // Generar números aleatorios para fila y columna
                                        filaAleatoria = (int) (Math.random() * filas);
                                        columnaAleatoria = (int) (Math.random() * columnas);

                                        // Verificar si la posición es válida dentro de la matriz
                                        if (filaAleatoria >= 0 && filaAleatoria < filas && columnaAleatoria >= 0 && columnaAleatoria < columnas) {
                                            // Insertar el valor en la matriz y mostrar la posición
                                            matriz.insertarDato((filaAleatoria-1), (columnaAleatoria-1), nuevoVehiculo);
                                            System.out.println("Se guardó en fila: " + filaAleatoria + " y columna: " + columnaAleatoria);
                                            // Marcar que se guardó exitosamente y salir del bucle
                                            guardar = false;
                                            break;
                                        }
                                    } while (true); // El bucle se ejecutará hasta que se encuentre una posición válida

                                    break; // Salir del case


                                case 3:
                                    System.out.println("Operación cancelada.");
                                    guardar = false;
                                    break;

                                default:
                                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                                    break;
                            }
                        }
                        break;

                    case 2:
                        // Buscar vehículo
                        System.out.println("¿Qué criterio desea utilizar para buscar el vehículo?");
                        System.out.println("1. Placa");
                        System.out.println("2. Color");
                        System.out.println("3. Línea");
                        System.out.println("4. Modelo");
                        System.out.println("5. Propietario");
                        System.out.print("Ingrese el número correspondiente al criterio: ");
                        int criterioBusqueda = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer del scanner

                        String criterio = "";
                        switch (criterioBusqueda) {
                            case 1:
                                criterio = "placa";
                                break;
                            case 2:
                                criterio = "color";
                                break;
                            case 3:
                                criterio = "linea";
                                break;
                            case 4:
                                criterio = "modelo";
                                break;
                            case 5:
                                criterio = "propietario";
                                break;
                            default:
                                System.out.println("Opción no válida. Volviendo al menú principal.");
                                continue;
                        }

                        System.out.print("Ingrese el valor para buscar el vehículo: ");
                        String valorBusqueda = scanner.nextLine();

                        // Realizar la búsqueda utilizando el método correspondiente en la matriz
                        List<Vehiculo> vehiculosEncontrados = matriz.buscarVehiculos(criterio, valorBusqueda);

                        if (vehiculosEncontrados.isEmpty()) {
                            System.out.println("No se encontraron vehículos con ese criterio de búsqueda.");
                        } else {
                            System.out.println("Se encontraron los siguientes vehículos:");
                            System.out.println("------------------------");
                            for (Vehiculo vehiculoEncontrado : vehiculosEncontrados) {
                                System.out.println(vehiculoEncontrado);
                                System.out.println("------------------------");
                            }
                        }
                        break;

                    case 3:
                        // Eliminar vehículo
                        System.out.println("¿Cómo desea eliminar el vehículo?");
                        System.out.println("1. Por posición");
                        System.out.println("2. Por placa");
                        System.out.print("Ingrese el número correspondiente a la opción: ");
                        int opcionEliminar = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer del scanner

                        switch (opcionEliminar) {
                            case 1:
                                // Eliminar por posición
                                System.out.print("Ingrese la fila del vehículo que desea eliminar: ");
                                int filaEliminar = scanner.nextInt();
                                scanner.nextLine(); // Limpiar el buffer del scanner
                                System.out.print("Ingrese la columna del vehículo que desea eliminar: ");
                                int columnaEliminar = scanner.nextInt();
                                scanner.nextLine(); // Limpiar el buffer del scanner
                                matriz.eliminarDato(filaEliminar, columnaEliminar);
                                System.out.println("Vehículo eliminado correctamente.");
                                break;

                            case 2:
                                // Eliminar por placa
                                System.out.print("Ingrese la placa del vehículo que desea eliminar: ");
                                String placaEliminar = scanner.next();
                                scanner.nextLine(); // Limpiar el buffer del scanner
                                List<Nodo> nodosConPlaca = matriz.buscarNodosVehiculo("placa", placaEliminar);
                                if (!nodosConPlaca.isEmpty()) {
                                    for (Nodo nodo : nodosConPlaca) {
                                        matriz.eliminarDatoConNodo(nodo);
                                        System.out.println("Vehículo con placa " + placaEliminar + " eliminado correctamente.");
                                    }
                                } else {
                                    System.out.println("No se encontraron vehículos con la placa especificada.");
                                }
                                break;

                            default:
                                System.out.println("Opción no válida. Volviendo al menú principal.");
                                break;
                        }
                        break;

                    case 4:
                        // Mostrar todos los vehículos guardados
                        matriz.mostrarVehiculos();
                        break;

                    case 5:
                        System.out.println("Saliendo del programa...");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
    }
}
