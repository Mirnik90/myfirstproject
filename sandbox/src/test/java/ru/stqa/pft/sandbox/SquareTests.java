package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {
  @Test // Аннотация (псевдокомментарий) - для определения тестового метода, даёт понимание фреймворку что это тестовый метод
  public void testArea(){
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25);
  }
}
