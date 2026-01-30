package Listas;

import java.util.ArrayList;

public class ArrayListEX {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(20);
        num.add(10);
        num.add(10);
        num.add(10);
        num.add(10);
        num.add(10);
        num.set(0, 100);


//        var totArrayList = num.get(0);
//        var tamanhArrayList = num.size();
//        System.out.println(tamanhArrayList);

//
        num.forEach(System.out::println);

    }
}
