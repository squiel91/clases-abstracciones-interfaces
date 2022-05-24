public class Camion extends Vehiculo {
  double toneladasCargadas;

  // contructor Camion
  Camion(int cantRuedas) {
    // siempre la subclase debe llamar al constructor de la superclase Vehiculo
    super(cantRuedas);
    toneladasCargadas = 0;
  }

  void cargar(double carga) {
    toneladasCargadas += carga;
  }

  void descargar(double carga) {
    toneladasCargadas = Math.max(
      toneladasCargadas - carga,
      0
    );
  }

  // aca estoy implementando el metodo abstracto de la superclase Vehiculo
  public void dondeEstas() {
    System.out.println("Este camion esta en " + posicion.x + "," + posicion.y);
  }
}
