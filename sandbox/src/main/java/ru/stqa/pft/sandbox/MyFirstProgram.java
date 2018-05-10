package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    String somebody = "world";
    hello(somebody);
    hello("user");

    double l = 8.0;
    System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
  }

  private static void hello(String somebody){
    System.out.println("Hello " + somebody);
  }

  private static double area(double l){
    return l * l;
  }
}