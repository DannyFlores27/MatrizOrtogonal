
package programacioniii.matrizortogonal.logica;

public class Vehiculo {
    
  private String placa; // Placa del vehículo
  private String color; // Color del vehículo
  private String linea; // Línea del vehículo
  private int modelo; // Modelo del vehículo
  private String propietario; // Nombre del propietario del vehículo

  // Constructor por defecto
  public Vehiculo(){

  }

  // Constructor con parámetros
  public Vehiculo(String placa, String color, String linea, int modelo, String propietario){
    this.placa = placa;
    this.color = color;
    this.linea = linea;
    this.modelo = modelo;
    this.propietario = propietario;
  }

  // Métodos de acceso (getters) para cada atributo
  public String getPlaca(){
    return this.placa;
  }

  public String getColor(){
    return this.color;
  }

  public String getLinea(){
    return this.linea;
  }

  public int getModelo(){
    return this.modelo;
  }

  public String getPropietario(){
    return this.propietario;
  }

  // Métodos de modificación (setters) para cada atributo
  public void setPlaca(String placa){
    this.placa = placa;
  }

  public void setColor(String color){
    this.color = color;
  }

  public void setLinea(String linea){
    this.linea = linea;
  }

  public void setModelo(int modelo){
    this.modelo = modelo;
  }

  public void setPropietario(String propietario){
    this.propietario = propietario;
  }

  // Método para obtener una representación en forma de cadena del objeto
  public String toString(){
    return "Placa: " + this.placa + "\nColor: " + this.color + "\nLinea: " + this.linea + "\nModelo: " + this.modelo + "\nPropietario: " + this.propietario;
  }  
    
}
