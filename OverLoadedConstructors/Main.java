package OverLoadedConstructors;

public class Main {
  
    public static void main(String[] args) {
        
       // overloaded constructors = multiple constructors wothin a class wiht the same name,
       //                           but have different parameters
       //                           name + parameters

       Pizza pizza = new Pizza("thicc crust");

       System.out.println("Here are the ingredients of your pizza:");
       System.out.println(pizza.bread);
       System.out.println(pizza.sauce);
       System.out.println(pizza.cheese);
       System.out.println(pizza.topping);
    }

}
