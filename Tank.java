import java.text.BreakIterator;

public class Tank {
  private int x;
  private int y;
  private int health; // 0 to 10
  private int damage; // 5 to 10
  private int xSpeed;
  private int ySpeed;
  private int shells;

  public Tank() {
    this.x = 0;
    this.y = 0;
    this.health = 10;
    this.damage = 3;
    this.xSpeed = 0;
    this.ySpeed = 0;
    this.shells = 5;
  }

  public Tank(int x, int y, int health, int damage, int xSpeed, int ySpeed, int shells) {
    this.x = x;
    this.y = y;
    this.health = health;
    this.damage = damage;
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
    this.shells = shells;
  }

  public void setPosition(int newX, int newY) {
    this.x = newX;
    this.y = newY;
  }


  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public int getxSpeed() {
    return xSpeed;
  }

  public void setxSpeed(int xSpeed) {
    this.xSpeed = xSpeed;
  }

  public int getySpeed() {
    return ySpeed;
  }
  public int getShells() {
    return shells;
  }

  public void setySpeed(int ySpeed) {
    this.ySpeed = ySpeed;
  }
  

  public String toString() {
    return "x: " + this.x + " y: " + this.y + " health: " + this.health + " damage: " + this.damage + " xSpeed: "
        + this.xSpeed + " ySpeed: " + this.ySpeed + " shells: " + this.shells;
  }

  public void shoot(Tank t) {
    t.health -= this.damage;
    t.shells -= 1;
    System.out.println(
        "Tank " + this.x + ", " + this.y + " shoots tank " + t.x + ", " + t.y + " for " + this.damage + " damage.");
    if (t.health <= 0) {
      System.out.println("Tank " + t.x + ", " + t.y + " is destroyed.");
    }
  }
}