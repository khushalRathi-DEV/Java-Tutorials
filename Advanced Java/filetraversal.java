import java.nio.file.*;
// java nio(new input/output) package


public class filetraversal {
  public static void main(String[] args){
    if(args.length == 0){
      System.out.println("Please enter a directory path as an argument.");
    }

    Path root = Paths.get(args[0]); 
    try{
      Files.walk(root)
        .filter(Files::isRegularFile)
        .filter(path -> path.toString().endsWith(".java"))
        .forEach(System.out::println);
    } catch (Exception e){
      e.printStackTrace();
    }
  }
}

