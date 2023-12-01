class Main {
  public static void main(String[] args) {
    Tank tank = new Tank(0, 0, 10, 5, 0, 0, 5);
    Tank default2 = new Tank();
    Tank tank3 = default2;
    System.out.println(tank);
    System.out.println(default2);
    System.out.println(tank3);
    tank.shoot(default2);
    tank.shoot(default2);
    System.out.println("after" + default2);

  }
}

