package Streams;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams01 {
    public static void main(String[] args) {
        var value =  Stream.of("Maria", "João", "pedro", "José","Carla")
                .limit(2)
                .filter(name -> name.endsWith("a"))
                .toList();

        System.out.println(value);
    }
}
