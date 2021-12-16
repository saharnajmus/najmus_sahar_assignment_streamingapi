package be.intecbrussel;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class FiltersAndConversions {
    public static void main(String[] args) {
        Person[] pArr;

        pArr = new Person[]{
                new Person("Jeans-","Pierre", Person.Gender.MALE,25,50.5f,1.50f),
                new Person("Jeans-","Zara", Person.Gender.FEMALE,65,55.5f,1.60f),
                new Person("Jeans-","Olivia", Person.Gender.FEMALE,35,60.5f,1.20f),
                new Person("Jeans-","Sophia", Person.Gender.FEMALE,15,80.5f,1.80f),
                new Person("Jeans-","Luc", Person.Gender.MALE,85,85.5f,1.30f),
                new Person("Jeans-","William", Person.Gender.MALE,45,65.5f,1.70f),
                new Person("Jeans-","Paul", Person.Gender.MALE,55,70.5f,1.77f)};
        /////Assignment 4 //////
        //part1//
        System.out.println("****only Female****");
        Stream.of(pArr)
                .filter(person -> person.getGender().equals(Person.Gender.FEMALE))
                .forEach(System.out::println);
        /////Assignment 4 part 2 //////
        System.out.println("****People having weight between 50 and 80***");
        Stream.of(pArr)
                .filter(person -> person.getWeight()>50)
                .filter(person -> person.getWeight()<80)
                .forEach(System.out::println);
        /////Assignment 4 part 3 //////
        System.out.println("****people older than 30 years having weight more than 60 kgs***");
        Stream.of(pArr)
                .filter(person -> person.getAge()>30)
                .filter(person -> person.getWeight()>60)
                .forEach(System.out::println);
        /////Assignment 4 part 4 //////
        System.out.println("****print ages of all persons one by one***");
        Stream.of(pArr)
                .map(person -> person.getAge())
                .forEach(System.out::println);
        System.out.println("****print first and last name of all persons***");
        Stream.of(pArr)
                .map(person ->
                    person.getName() + person.getLastName())
                .forEach(System.out::println);
        System.out.println("****print average , minimum and maximum ages ***");
       OptionalDouble averageAge = Stream.of(pArr)
                .mapToInt(person -> person.getAge())
                .average();
        System.out.println(averageAge.isPresent()?averageAge.getAsDouble():"0");
        OptionalInt maximum = Stream.of(pArr)
                .mapToInt(person -> person.getAge())
                .max();
        System.out.println("maximum age");
        System.out.println(maximum.isPresent()?maximum.getAsInt():"0");
        System.out.println("minimum age");
        OptionalInt minimum = Stream.of(pArr)
                .mapToInt(person -> person.getAge())
                .min();
        System.out.println(minimum.isPresent()?minimum.getAsInt():"0");
        System.out.println("****print weight of all persons one by one***");
        Stream.of(pArr)
                .map(person -> person.getWeight())
                .forEach(System.out::println);
        System.out.println("****print average , minimum and maximum weight***");
        OptionalDouble averageWeight = Stream.of(pArr)
                .mapToDouble(person -> person.getWeight())
                .average();
        System.out.println(averageWeight.isPresent()?averageWeight.getAsDouble():"0");
        OptionalDouble maximumWeight = Stream.of(pArr)
                .mapToDouble(person -> person.getWeight())
                .max();
        System.out.println("maximum weight");
        System.out.println(maximumWeight.isPresent()?maximumWeight.getAsDouble():"0");
         OptionalDouble minimumWeight = Stream.of(pArr)
                .mapToDouble(person -> person.getWeight())
                .min();
        System.out.println("minimum weight");
        System.out.println(minimumWeight.isPresent()?minimumWeight.getAsDouble():"0");




    }
}
