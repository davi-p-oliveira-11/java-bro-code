

public class Main {

  public static void main(String[] args) {
     
    // method = a block of code that is executed whenever it is called upon

    int x = 3;
    int y = 4;

    System.out.println(add(x, y));
    hello();
  }
  
  // only use void when you return a value
  static void hello() {
    System.out.println("Hallo");
  }

  static int add(int x, int y) {
    
    return x + y;

  }

}
