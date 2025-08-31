package SetFrameworkDemo.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class listToArray {
    public static void main(String[] args) {
        System.out.println("Converting List into an Array");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        System.out.println(list.getClass());
        Object[] array = list.toArray();
        for(Object i : array){
            System.out.println(i);
        }
        System.out.println(array.getClass());

        System.out.println("\n");
        Integer[] array1 = list.toArray(new Integer[0]);
        for (int i : array1){
            System.out.println(i);
        }
        System.out.println(array1.getClass());
    }
}
