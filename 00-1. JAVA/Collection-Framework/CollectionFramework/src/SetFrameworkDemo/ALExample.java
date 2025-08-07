package SetFrameworkDemo;

import java.util.ArrayList;

public class ALExample {
    public static void main(String[] args) {
        System.out.println("Example");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
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
    }
}