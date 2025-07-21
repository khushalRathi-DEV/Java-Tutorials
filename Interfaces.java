interface Computer {
  int price = 3000; //by default the price is final i.e it cannot be changed
  void compiler(); // its of type abstract by default ,we dont evene need to specify it
}

interface Portable {
  void move();
}

class Laptop implements Computer,Portable { // Multiple interfaces have been implemented,possible only with interfaces
  public void compiler(){   //we need to implement all the abstract methods
    System.out.println("Compiling...");
  }
  public void move (){
    System.out.println("It is portable,it can be moved easily..");
  } 
}

class Desktop implements Computer {
  public void compiler() {
    System.out.println("Compiling Faster...");
  }
}

class Developer {
  public void code(Computer c){   //since computer is an interface we can pass any object that implements it 
    c.compiler();
  }
}

public class Interfaces {
  public static void main(String args[]){
    Laptop L = new Laptop();
    Developer D = new Developer();
    D.code(L);
    Desktop D1 = new Desktop();
    D.code(D1);
  }
}
