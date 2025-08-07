package SetFrameworkDemo.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        ArrayList<String> name = new ArrayList<>();
        name.add("Ashish");
        name.add("Manish");
        name.add("Saurav");
        name.add("Lalit");
        name.add("Parul");
        name.add("Sakshi");
        name.add("Banana");

        System.out.println(name + "\n");
        System.out.println(name.get(2) + "\n");
        System.out.println(name.size() + "\n");

        for (String names : name){
            System.out.println(names);
        }
        name.remove("Banana");
        System.out.println("\n" + name);
        System.out.println(name.contains("Banana") + "\n");

        boolean isContains = name.contains("Ashish");
        if (isContains) {
            System.out.println("Present at the index: " + name.indexOf("Ashish"));
        } else {
            System.out.println("Not in the list");
        }

        System.out.println("\n");

        name.add(2, "Aneeket");
        name.set(4, "Harsh");

        System.out.println(name);

        System.out.println("\n");

        List<String> list = Arrays.asList("Monday", "Tuesday", "Wednesday");
//        list.add("Thursday"); // throws exception, because it is still an array and size is fixed so adding and removing elements won't work.
        list.set(2, "Thursday"); // This will work.
        System.out.println(list.getClass());
        System.out.println(list);

        System.out.println("\nBelow is the solution for adding and removing elements from List backed by arrays");
        List<String> list1 = new ArrayList<>(Arrays.asList("Ashish", "Manish", "Saurav"));
        list1.add("Harsh");
        System.out.println("Harsh is added in the list1: " + list1);
        list1.clear();
        System.out.println("List 1 is emptied and it is shown as: " + list1);

        System.out.println("\n");
        List<Integer> count = List.of(1, 2, 3, 4);
//        count.add(5);
//        count.set(2, 5); // Both of these methods of adding or replacing new elements won't work as in this way of crating list, it is designed to be immutable.
        // Instead, we can do this, see below:
        List<Integer> num = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(num);
        num.add(6);
        System.out.println(num);
    }
}
