package SetFrameworkDemo.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ALExample {
    public static void main(String[] args) {
        System.out.println("Example");
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(5);
        list.add(1);
        list.add(10);
        list.add(20);

        if (!list.contains(15)){
            list.add(15);
            for (int i : list){
                System.out.println(i);
            }
        } else {
            System.out.println("List is perfectly fine");
        }
        System.out.println("\n");

        System.out.println(list.remove(1)); // This removes the element at index 1 not the element with the value 1.
        list.remove(Integer.valueOf(1)); // This removes the first occurrence of the element with the value 1.
        System.out.println(list);
    }
}