public class Grua extends Vehiculo {
  Vehiculo vehiculo;
  // contructor Grua
  Grua() {
    // siempre la subclase debe llamar al constructor de la superclase Vehiculo
    super(6);
    vehiculo = null;
  }

  void cargar(Vehiculo aCargar) {
    if (vehiculo == null) {
      vehiculo = aCargar; 
    }
  }

  Vehiculo descargar() {
    Vehiculo aDescargar = vehiculo; 
    vehiculo = null;
    return aDescargar;
  }

  // aca estoy implementando el metodo abstracto de la superclase Vehiculo
  public void dondeEstas() {
    System.out.println("Esta grua esta en " + posicion.x + "," + posicion.y);
  }

}
