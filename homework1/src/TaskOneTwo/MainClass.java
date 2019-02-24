package TaskOneTwo;

import TaskOneTwo.ClassGeneric;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        String massStr[] = {"яблоко", "апельсин", "вишня", "банан"};
        ClassGeneric<String> exampleStr = new ClassGeneric<String>(massStr);
        String[] rezultMass = exampleStr.changeElements(1,2);
        for(String o : rezultMass) {
            System.out.println(o);
        }

        Integer massInt[] = {1,2,3,4,5,6,7,8,9,10};
        ClassGeneric<Integer> exampleInt = new ClassGeneric<Integer>(massInt);
        List<Integer> myArray = exampleInt.getArrayList();
        System.out.println(myArray);
    }
}
