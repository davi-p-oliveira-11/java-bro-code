package Encapsulation;

public class Main {

    public static void main(String[] args) {
      
       
     // Encapsulation = attribute of a class will be hidden or private,
     //                 can be accessed only through methods (getters and setters)
     //                 You should make attributes private if you don't have a reason to make 
     //                 them public/protected.

     Car car = new Car("Chevrolet", "Camaro", 2021);

     car.setYear(2022);

     System.out.println(car.getMake());
     System.out.println(car.getModel());
     System.out.println(car.getYear());

    }


}
