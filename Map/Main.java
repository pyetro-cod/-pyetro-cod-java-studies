package Map;

import Map.domain.User;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, User> users = new TreeMap<>();
        users.put("Joao@.com", new User("João", 22));
        users.put("maria@gmail.com", new User("Maria",11));

        users.forEach((k,v) -> System.out.printf("key %s | value %s \n",k,v));



    }
}
