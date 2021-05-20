package ru.stqa.pft.sandbox;

public class Square {
  public double l;

  public Square(double l) { // Конструктор - это не обычная функция, имеет такое же название как класс и не имеет никакого
    this.l = l;                // возвращаемого значения, перед именем конструктора никакой тип возвращаемого значения не ука
                              // зывается, также как и функция - конструктор может принимать параметры

  }

  public double area() { // В качестве параметра принимает объект (класс)
    return this.l * this.l; // Атрибут объекта l (класса)
  }


}
