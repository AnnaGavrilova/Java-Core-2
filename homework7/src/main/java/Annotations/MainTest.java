package Annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestClass test = new TestClass();
        startTest(test);
    }

    public static void startTest(TestClass test) throws InvocationTargetException, IllegalAccessException {
        Class c = TestClass.class;
        Method[] m = c.getDeclaredMethods();
        for (Method o : m) {
            if (o.isAnnotationPresent(BeforeSuite.class)) {
                o.invoke(test);
            }
        }

        int index = 1;
        for (Method o : m) {
            if (o.isAnnotationPresent(Test.class)) {
                if (o.getAnnotation(Test.class).priotity() == index) {
                    o.invoke(test);
                }
            }
            index += 1;
        }

        for (Method o : m) {
            if (o.isAnnotationPresent(AfterSuite.class)) {
                o.invoke(test);
            }
        }
    }
}
