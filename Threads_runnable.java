class A implements Runnable {
  public void run() {
    for (int i = 0; i < 20; i++) {
      System.out.println("Running in Thread A");
      try {
        Thread.sleep(10);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

}

class B implements Runnable {
  public void run() {
    for (int i = 0; i < 20; i++) {
      System.out.println("Running in Thread B");
      try {
        Thread.sleep(10);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  
}

public class Threads_runnable {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    Thread t1 = new Thread(a);
    Thread t2 = new Thread(b);
    t1.start();
    t2.start();

    try {
      t1.join();    // wait for thread t1 to finish
      t2.join();    // wait for thread t2 to finish
    } catch (Exception e) {
      e.printStackTrace();
    }

    // now main thread can continue,once t1 and t2 are finished

    System.out.println("Bye..");
  }
}
