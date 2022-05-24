class Main {
  public static void main(String[] args) {
    Camion camion = new Camion(8);
    camion.moverse(5, 5);
    camion.moverse(1, -2);
    // camion.dondeEstas(); // 6 y 3
    
    // Equivalente a: Vehiculo [] flota = new Vehiculo[3]; flota[0] = camion; flota[1] = new Camion(16); flota[2] = new Grua();
    Vehiculo [] flota = {
      camion,
      new Camion(16),
      new Grua()
    };

    
    // Equivalente a: for (int i = 0; i < flota.length; i++) { Vehiculo v = flota[i]; v.dondeEstas();}
    for (Vehiculo v : flota) {
      v.dondeEstas();
    }
  }
}
