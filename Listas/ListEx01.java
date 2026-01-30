package Listas;

import java.util.ArrayList;
import java.util.List;

public class ListEx01 {
    public static void main(String[] args) {
        int[] codes = {10,20};
        List<Integer>  codes2 = new ArrayList<>();
        codes2.add(codes[0]);
        codes2.add(codes[1]);
        codes2.add(30);

        codes2.forEach(System.out::println);
    }
}
