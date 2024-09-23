import java.util.Scanner;

public class Main {

    /* 
     * Math Methods:
     */
     
    // Finds the maximum number:
    //  double z = Math.max(x, y);
    
    // Finds the minimum number:
    // double z = Math.min(x, y);

    // Finds the abstract number:
    // double z = Math.abs(z);

    // Find the squaee root:
    // double z = Math.sqrt(z);

    // double z = Math.ceil(z);

    // double z = Math.round(z);

    // double z = Math.floor(z);
    
   
   
  public static void main(String[] args) {

    double x;
    double y;
    double z;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter side x: ");
    x = scanner.nextDouble();

    System.out.println("Enter side y: ");
    y = scanner.nextDouble();

    z = Math.sqrt((x*x)+(y*y));
    

    System.out.println("The hypotenuse is : " + z);


    
  }

}
