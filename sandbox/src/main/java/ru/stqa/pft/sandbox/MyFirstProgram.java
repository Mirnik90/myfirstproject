package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world"); // Создали функцию которая будет вызывать сообщение "Hello World"
    hello("user");
    hello("Mirnik");

    double l = 5;
    System.out.println("Площадь квадрата ос стороной " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
    }

  public static void hello (String somebody) { // Создали функцию которая будет вызывать сообщение "Hello World"
    System.out.println("Hello " + somebody + "!");
  }

  public static double area(double len) {
    return len * len;
  }
  public static double area(double a, double b) {
    return a * b;
  }
}

