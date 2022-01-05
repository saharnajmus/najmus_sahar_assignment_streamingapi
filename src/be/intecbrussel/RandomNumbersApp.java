package be.intecbrussel;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RandomNumbersApp {
    public static void main(String[] args) {
        IntStream intStream =  IntStream.range(0,10000);
        IntStream.generate(()->new Random().nextInt())
                .filter(value -> value%2==0)
                .limit(5)
                .sorted()
        .forEach(System.out::println);


        }
    }

