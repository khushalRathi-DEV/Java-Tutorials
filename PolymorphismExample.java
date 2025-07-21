// Base class - Animal
class Animal {
  // Method to be overridden - this will demonstrate Runtime Polymorphism
  void makeSound() {
      System.out.println("Some generic animal sound");
  }
}

// Derived class - Dog
class Dog extends Animal {
  // Overriding makeSound() - Runtime Polymorphism
  @Override
  void makeSound() {
      System.out.println("Dog barks");
  }
}

// Derived class - Cat
class Cat extends Animal {
  // Overriding makeSound() - Runtime Polymorphism
  @Override
  void makeSound() {
      System.out.println("Cat meows");
  }
}

// Class to demonstrate Compile-time Polymorphism
class Calculator {
  // Method overloading - same method name, different parameters (Compile-time Polymorphism)
  
  int add(int a, int b) {
      return a + b;
  }

  int add(int a, int b, int c) {
      return a + b + c;
  }

  double add(double a, double b) {
      return a + b;
  }
}

public class PolymorphismExample {
  public static void main(String[] args) {

      // ===== Compile-Time Polymorphism (Method Overloading) =====
      Calculator calc = new Calculator();

      System.out.println("Sum of 2 ints: " + calc.add(2, 3));             // Calls int add(int, int)
      System.out.println("Sum of 3 ints: " + calc.add(2, 3, 4));          // Calls int add(int, int, int)
      System.out.println("Sum of 2 doubles: " + calc.add(2.5, 3.7));      // Calls double add(double, double)

      // ===== Runtime Polymorphism (Method Overriding + Upcasting) =====
      Animal myAnimal; // reference of type Animal

      myAnimal = new Dog();  // Dog object is assigned to Animal reference
      myAnimal.makeSound();  // Calls Dog's makeSound() - runtime decision

      myAnimal = new Cat();  // Cat object is assigned to Animal reference
      myAnimal.makeSound();  // Calls Cat's makeSound() - runtime decision

      // Note: Actual method call is decided at runtime based on the object type (Dog or Cat)
  }
}
