class A extends Thread{
  public void run(){
    for(int i=0;i<20;i++){
      System.out.println("Running in Thread A");
      try {
        Thread.sleep(10);   //this will sleep the thread for 10ms
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
class B extends Thread{
  public void run(){      //we need to implement run() method,its the method that gets called wehen we use start()
    for(int i=0;i<20;i++){
      System.out.println("Running in Thread B");
      try {
        Thread.sleep(10);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

public class ThreadsDemo {
  public static void main(String args[]){
    A a = new A();
    B b = new B();

    a.setPriority(5); //setting priority of thread, we can also do Thread.MAX_PRIORITY,which is 10 by default 
   

    a.start();  //when start() method is called, run() method gets called
    b.start();
  }  
}
