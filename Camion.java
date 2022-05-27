public class Camion extends Vehiculo implements Estacionable, Recargable {
  double toneladasCargadas;
  private boolean estacionado = true;
  private double nivelCombustible = 0;

  // contructor Camion
  Camion(int cantRuedas) {
    // siempre la subclase debe llamar al constructor de la superclase Vehiculo
    super(cantRuedas);
    toneladasCargadas = 0;
  }

  void cargar(double carga) {
    System.out.println(this.cantRuedas);
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

  // Implementacion de Estacionable
  public void estacionar(boolean e) {
    estacionado = e;
  }

  public boolean estaEstacionado() {
    return estacionado;
  }

  // Implementacion de Recargable
  public void recargar() {
    nivelCombustible = 1;
  }

  public double nivelCombustible() {
    return nivelCombustible;
  }
}
