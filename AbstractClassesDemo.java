// Abstract class 'Computer' defines a partial implementation for all computers
abstract class Computer {
  int price = 3000; // Instance variable (not static final like in interfaces)

  // Abstract method — must be implemented by subclasses
  abstract void compiler();

  // Concrete method — shared logic for all subclasses
  void powerOn() {
    System.out.println("Powering on the computer...");
  }
}

// Abstract class 'PortableDevice' extends 'Computer' and adds portable behavior
abstract class PortableDevice extends Computer {
  // Abstract method specific to portable devices
  abstract void move();
}

// 'Laptop' extends 'PortableDevice' — must implement both abstract methods
class Laptop extends PortableDevice {
  void compiler() {
    System.out.println("Compiling from Laptop...");
    System.out.println("Laptop Price: " + price);
  }

  void move() {
    System.out.println("Laptop is portable — it can be moved easily.");
  }
}

// 'Desktop' extends 'Computer' directly — not portable
class Desktop extends Computer {
  void compiler() {
    System.out.println("Compiling from Desktop... (Usually faster due to better specs)");
    System.out.println("Desktop Price: " + price);
  }

  // No move() method — because it's not a portable device
}

// 'Developer' uses any object derived from 'Computer'
class Developer {
  public void code(Computer c) {
    System.out.println("\nDeveloper is starting to code...");

    c.powerOn();     // Shared behavior
    c.compiler();    // Polymorphic behavior

    System.out.println("Coding session completed.\n");
  }
}

// Main class
public class AbstractClassesDemo {
  public static void main(String[] args) {
    Laptop laptop = new Laptop();
    Desktop desktop = new Desktop();

    Developer dev = new Developer();

    dev.code(laptop);   // Portable and abstract class
    dev.code(desktop);  // Only abstract base class
  }
}
