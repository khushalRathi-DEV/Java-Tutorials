// This is a good example of Encapsulation in Java

// Parent class representing the description of a car
class CarDesc {
  // Fields are declared private to enforce encapsulation
  private String color;
  private String model;
  private String brand;

  // Public method to access object information (acts like a display method)
  public void yourCar() {
    System.out.println("Your Car is " + color + " " + model + " " + brand);
  }

  // Getter and Setter methods to access and modify private fields

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }
}

// Child class that extends CarDesc and adds speed-related functionality
class CarSpeed extends CarDesc {
  // Private field to ensure encapsulation
  private int topSpeed;

  // Getter for topSpeed (controlled access)
  public int getTopSpeed() {
    return topSpeed;
  }

  // Setter method uses business logic to determine speed based on brand
  // This ensures values are set logically and not randomly by the user
  public void calculateTopSpeed() {
    String brand = getBrand(); // Accessing parent's private field via getter

    // ⚠️ Always use .equals() for string comparison in Java, NOT ==
    if (brand.equals("Mustang")) {
      topSpeed = 200;
    } else if (brand.equals("Porsche")) {
      topSpeed = 250;
    } else {
      topSpeed = 150;
    }
  }

  // Display method to print top speed
  public void displayTopSpeed() {
    System.out.println("Top Speed is " + topSpeed + " km/h");
  }
}

// Main class to test encapsulation example
public class Encapsulation {
  public static void main(String[] args) {
    // Object created from the child class (inherits from CarDesc)
    CarSpeed obj = new CarSpeed();

    // Setting values using setter methods (not directly accessing fields)
    obj.setColor("Grey");
    obj.setBrand("Porsche");
    obj.setModel("911");

    // Accessing car description
    obj.yourCar();

    // Logic-based speed setting — internal logic hidden from user
    obj.calculateTopSpeed();

    // Display top speed (not directly accessing topSpeed)
    obj.displayTopSpeed();
  }
}
