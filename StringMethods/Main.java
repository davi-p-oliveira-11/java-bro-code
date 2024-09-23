
public class Main {

  public static void main(String[] args) {

     // String  =  a reference data type that can store one or more characters
     //            reference data types have access to useful methods

     String name = "Bro";
     
     // see if  it's equal
     boolean result10 = name.equals("bro");

     // see if its equal ignoring lowercase
     boolean result = name.equalsIgnoreCase("bro");

     //tells the lenght of the string
     int result2 = name.length();

     // tellas wchich character os located in the specified index
     char result3 = name.charAt(0);
      
     // finds the index of the specified chaacter
     int result4 = name.indexOf("o");

     // checks if its empty
     boolean result5 = name.isEmpty();

     // hcnage the characters to upperCase
     String result6 = name.toUpperCase();

     // change the characters to lowercase
     String result7 = name.toLowerCase();

     // no white spaces
     String result8 = name.trim();

     // replace some chars 
     String result9 = name.replace('o', 'a');

  

     System.out.println(result);
     System.out.println(result2);
     System.out.println(result3);
     System.out.println(result4);
     System.out.println(result5);
     System.out.println(result6);
     System.out.println(result7);
     System.out.println(result8);
     System.out.println(result9);
     System.out.println(result10);
  }
  
}
