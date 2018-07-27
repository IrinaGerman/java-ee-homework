package com;

//прописала зависимость в pom.xml:
// <groupId>main_logic_project</groupId>
// <artifactId>main_logic_project</artifactId>
// <version>1.0</version>

public class MyCalculatorTest {
    public static void main(String[] args) {
        int expectedResult = 25;
        int actualResult = new com.MyCalculator("12", "13").sum();
        //конструктор должен принимать строки в качестве параметров
        //public MyCalculator(String numberFirstAsString, String numberSecondAsString)

        // System.out.println(actualResult);
        assert expectedResult == actualResult : "bug";
        //добавила -ea в конфигурацию
    }
}
