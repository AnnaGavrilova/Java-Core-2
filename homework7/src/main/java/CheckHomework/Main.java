package CheckHomework;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        Class cl = URLClassLoader.newInstance(new URL[]{new File("/123").toURL()}).loadClass("ReadyHomework");

        Method[] method = cl.getDeclaredMethods();

        for (Method m : method) {
            System.out.println(m);
        }

        Method method1 = cl.getDeclaredMethod("calculate");
        Object[] param = new Object[]{new Integer(2), new Integer(3), new Integer(10), new Integer(2)};
        if ((Integer) method1.invoke(cl, param) == 16) {
            System.out.println("Задание 1 выполнено верно!");
        } else {
            System.out.println("Ошибка в задании 1!");
        }

        Method method2 = cl.getDeclaredMethod("checkTwoNumbers");
        Object[] param2 = new Object[]{new Integer(8), new Integer(7)};
        if ((Boolean) method2.invoke(cl, param2)) {
            System.out.println("Задание 2 выполнено верно!");
        } else {
            System.out.println("Ошибка в задании 2!");
        }

        Method method3 = cl.getDeclaredMethod("printIsPositive");
        Object[] param3 = new Object[]{new Integer(25)};
        String rezult = (String) method3.invoke(cl, param3);
        if (rezult.contains("positive") || rezult.contains("negative")) {
            System.out.println("Задание 3 выполнено верно!");
        } else {
            System.out.println("Ошибка в задании 3!");
        }

        Method method4 = cl.getDeclaredMethod("isNegative");
        Object[] param4 = new Object[]{new Integer(-40)};
        if ((Boolean) method4.invoke(cl, param4)) {
            System.out.println("Задание 4 выполнено верно!");
        } else {
            System.out.println("Ошибка в задании 4!");
        }

        Method method5 = cl.getDeclaredMethod("printWelocome");
        Object[] param5 = new Object[]{new String("Ivan")};
        String rezult5 = (String) method5.invoke(cl, param5);
        if (rezult5.contains("Ivan") && rezult5.contains("Привет")) {
            System.out.println("Задание 5 выполнено верно!");
        } else {
            System.out.println("Ошибка в задании 5!");
        }

        Method method6 = cl.getDeclaredMethod("isLeapYear");
        Object[] param6 = new Object[]{new Integer(2000)};
        if ((Boolean) method6.invoke(cl, param6)) {
            System.out.println("Задание 6 выполнено верно!");
        } else {
            System.out.println("Ошибка в задании 6!");
        }
    }
}

