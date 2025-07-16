package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void setUp(){
        System.out.println("Before All");
    }

    @BeforeEach
    public void setUpEach(){
        System.out.println("Before each");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("after All");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After each");
    }

    @Test
    @DisplayName("Проверка суммирования 1")
    @Timeout(10)
    @Tag("Summ")
    void summ1() {
        Calc cal= new Calc();
        int result = cal.summ(1,6);
        Assertions.assertEquals(7, result,"Не тот Ответ");
    }

    @RepeatedTest(10)
    @DisplayName("Проверка суммирования 10 раз")
    @Timeout(10)
    void summ2() {
        Calc cal= new Calc();
        int result = cal.summ(1,6);
        Assertions.assertEquals(7, result,"Не тот Ответ");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @DisplayName("Граничные значения ")
    @Tag("param")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0 ,0"})
    void summ3(int a, int b, int expectedResult) {
        Calc cal= new Calc();
        int result = cal.summ(a, b);
        Assertions.assertEquals(expectedResult, result,"Не тот Ответ");
    }
    @Test
    @DisplayName("Вычитания 1")
    @Timeout(10)
    @Tag("Sub")
    void sub1() {
        Calc cal = new Calc();
        int result = cal.sub(10, 3);
        Assertions.assertEquals(7, result, "Неверный результат вычитания");
    }

    @RepeatedTest(5)
    @DisplayName("Вычитания 5 раз")
    @Timeout(10)
    void sub2() {
        Calc cal = new Calc();
        int result = cal.sub(5, 2);
        Assertions.assertEquals(3, result, "Неверный результат вычитания");
    }

    @ParameterizedTest(name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @DisplayName("Граничные значения для вычитания 3")
    @Tag("param2")
    @CsvSource({"5, 3, 2", "2, 2, 0", "-1, -1, 0", "0, 5, -5"})
    void sub3(int a, int b, int expectedResult) {
        Calc cal = new Calc();
        int result = cal.sub(a, b);
        Assertions.assertEquals(expectedResult, result, "Неверный результат вычитания");
    }
}