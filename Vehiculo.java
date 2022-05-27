// como tiene un metodo abstracto entonces la clase debe, si o si, ser abstracta
abstract class Vehiculo {
  public Posicion posicion;
  protected int cantRuedas;

  // constructor de Vehiculo
  public Vehiculo(int cantRuedas) {
    this.cantRuedas = cantRuedas;
    posicion = new Posicion(0, 0);
  }

  public void moverse(int dx, int dy) {
    this.posicion.x += dx;
    this.posicion.y += dy;
  }

  // Notar que al ser abstracta, el metodo no tiene una implementacion
  // Toda subclase debe implementar este metodo
  abstract public void dondeEstas();
}
