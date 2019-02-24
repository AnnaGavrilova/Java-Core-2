package Annotations;

public class TestClass {

    @BeforeSuite
    public void methodBefore() {
        System.out.println("Выполняется тест Before");
    }

    @Test(priotity = 1)
    public void method1() {
        System.out.println("Выполняется тест №1");
    }

    @Test(priotity = 2)
    public void method2() {
        System.out.println("Выполняется тест №2");
    }

    @Test(priotity = 3)
    public void method3() {
        System.out.println("Выполняется тест №3");
    }

    @Test(priotity = 4)
    public void method4() {
        System.out.println("Выполняется тест №4");
    }

    @Test(priotity = 5)
    public void method5() {
        System.out.println("Выполняется тест №5");
    }

    @Test(priotity = 6)
    public void method6() {
        System.out.println("Выполняется тест №6");
    }

    @Test(priotity = 7)
    public void method7() {
        System.out.println("Выполняется тест №7");
    }

    @Test(priotity = 8)
    public void method8() {
        System.out.println("Выполняется тест №8");
    }

    @Test(priotity = 9)
    public void method9() {
        System.out.println("Выполняется тест №9");
    }

    @Test(priotity = 10)
    public void method10() {
        System.out.println("Выполняется тест №10");
    }

    @AfterSuite
    public void methodAfter() {
        System.out.println("Выполняется тест After");
    }
}
