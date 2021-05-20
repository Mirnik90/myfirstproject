package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world"); // Создали функцию которая будет вызывать сообщение "Hello World"
    hello("user");
    hello("Mirnik");

    Square s = new Square(5); // Создаём объект, слово new используется для создания объектов заданного типа
    System.out.println("Площадь квадрата ос стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    }

  public static void hello (String somebody) { // Создали функцию которая будет вызывать сообщение "Hello World"
    System.out.println("Hello " + somebody + "!");
  }

}

