import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("What is your name ? ");
    String name = scanner.nextLine();

    System.out.print("How old are you ? ");
    int age = scanner.nextInt();
    scanner.nextLine();

    System.out.print("What is your favorite food ? ");
    String food = scanner.nextLine();

    System.out.println("Hallo " + name);
    System.out.println("You are " + age + " years old");
    System.out.println("You like " + food);
    
  }

}
