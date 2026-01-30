package Set;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(3);
        set.add(2);
        set.add(1);

        set.forEach(System.out::println);

    }
}
