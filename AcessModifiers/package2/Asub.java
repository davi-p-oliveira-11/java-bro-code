package AcessModifiers.package2;

import AcessModifiers.package1.A;
import package1.*;

public class Asub extends A {

  public static void main(String[] args) {
    
    Asub asub = new Asub();
    System.out.println(asub.protectedMessage);
  }
}
