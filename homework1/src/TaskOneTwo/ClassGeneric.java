package TaskOneTwo;

import java.util.Arrays;
import java.util.List;

public class ClassGeneric<T> {
    private T[] mass;

    public ClassGeneric(T[] o) {
        mass = o;
    }

    public T[] changeElements(int first, int second) {
        T element1 = mass[first];
        T element2 = mass[second];
        for (int i = 0; i < mass.length; i++) {
            if (i == first) {
                mass[i] = element2;
            }
            if (i == second) {
                mass[i] = element1;
            }
        }
        return mass;
    }

    public List getArrayList() {
        List<T> array = Arrays.asList(mass);
        return array;
    }

}
