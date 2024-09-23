

public class Main {

   public static void main(String[] args) {
     
     // 2D array = an array of arrays
     
     // manyally assigining the values:
     String[][] cars2 = new String[3][3];

     cars2[0][0] = "Camaro";
     cars2[0][1] = "Corvette";
     cars2[0][2] = "Silverado";
     cars2[1][0] = "Mustang";
     cars2[1][1] = "Ranger";
     cars2[1][2] = "F-150";
     cars2[2][0] = "Ferrari";
     cars2[2][1] = "Lambo";
     cars2[2][2] = "Tesla";

     for (int i=0; i<cars2.length; i++) {
      System.out.println();
      for (int j=0; j<cars2[i].length; j++) {
        System.out.println(cars2[i][j]+ " ");
      }
    }


     String[][] cars = {
                            {"Camaro", "Corvette", "Silverado"},
                            {"Mustang", "Ranger", "F-150"},
                            {"Ferrari", "Lambo", "Tesla"},
                        };
     for (int i=0; i<cars.length; i++) {
       System.out.println();
       for (int j=0; j<cars[i].length; j++) {
         System.out.println(cars[i][j]+ " ");
       }
     }
   }
  
}
