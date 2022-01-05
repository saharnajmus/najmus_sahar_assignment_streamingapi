package be.intecbrussel;

import java.util.stream.IntStream;

public class StreamApp {
    public static void main(String[] args) {
      double doubleStream =  IntStream.range(0,10000)
                .mapToDouble(Math::sqrt)
                .filter(s->s%5==0&s%8==0)
              .limit(20)
        .reduce(1,(acc,e1)->acc+e1);
        System.out.println(doubleStream);

    }

}
