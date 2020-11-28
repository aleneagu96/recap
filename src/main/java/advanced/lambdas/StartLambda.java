package advanced.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class StartLambda {

    public static void main(String[] args) {

        // using Predicate
        Person person3 = new Person(19, "Bob", "Bobson");
        Predicate<Person> adultTest = new AdultPerson();
        System.out.println(adultTest.test(person3));

        //with lambda
        Person person2 = new Person(12, "Maria", "Popescu");
        Predicate<Person> lambdaAdultTest = person -> person.getAge() >= 18;
        System.out.println(lambdaAdultTest.test(person2));


        Runnable runnableExample = () -> System.out.println("This is now running");
        runnableExample.run();

        Predicate<String> endsWith = (string) -> string.endsWith("ant");
        System.out.println(endsWith.test("Restaurant"));
        System.out.println(endsWith.test("Zebra"));

        // using Function
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("whatever"));

        Function<Person, Integer> personGetAgeFunction = person -> person.getAge();
        System.out.println(personGetAgeFunction.apply(person2));
        System.out.println(personGetAgeFunction.apply(person3));

        Function<Person, String> personGetFirstName = person -> person.getFirstName();
        System.out.println(personGetFirstName.apply(person2));

        // using Method Reference
        Function<Person, Integer> getAgeWithReference = Person::getAge;
        System.out.println(getAgeWithReference.apply(person2));

        // using Supplier
        Supplier<Integer> takeRandomInt = () -> new Random().nextInt();
        System.out.println("Supplier output" + takeRandomInt.get());

        Supplier<Person> createPerson = () -> new Person(2, "Ana", "Pop");
        System.out.println("Person supplier output " + createPerson.get());

        // using Consumer
        Consumer<Integer> printNumber = number -> System.out.println(number);
        printNumber.accept(2);

        Consumer<Person> printPersonAge = person -> System.out.println(person.getAge());
        printPersonAge.accept(person2);

        Consumer<Person> bodyConsumer = person -> {
            System.out.println("In 5 years the person will be " + (person.getAge() + 5));
        };
        Person firstPerson = new Person(10, "Maria", "Rus");
        System.out.println(firstPerson);
        bodyConsumer.accept(firstPerson);

        // using UnaryOperator
        UnaryOperator<Double> toSquare = i -> Math.pow(i, 2);
        System.out.println("UnaryOperator result is: " + toSquare.apply(4.0));


        //a) Addition, subtraction, multiplication, division.
        // using a self made Functional Interface
        ArithmeticOperations<Integer> addition = (a, b) -> (a + b);
        System.out.println(addition.operation(10, 0));

        ArithmeticOperations<Integer> subtraction = (a, b) -> (a - b);
        System.out.println(subtraction.operation(1, 3));

        ArithmeticOperations<Integer> multiplication = (a, b) -> (a * b);
        System.out.println(multiplication.operation(10, 0));

        ArithmeticOperations<Integer> division = (a, b) -> (a / b);
        System.out.println(division.operation(3, 2));

        // using BinaryOperator
        BinaryOperator<Integer> addition2 = (i, j) -> i + j;
        System.out.println(addition2.apply(5, 5));

        BinaryOperator<Integer> subtraction2 = (i, j) -> i - j;
        System.out.println(subtraction2.apply(8, 4));

        BinaryOperator<Integer> multiply2 = (i, j) -> i * j;
        System.out.println(multiply2.apply(4, 4));

        BinaryOperator<Integer> divide2 = (i, j) -> i / j;
        System.out.println(divide2.apply(9, 3));


       // The sum of elements (int type) of the list.

        List<Integer> listOfElements = Arrays.asList(2, 4, 6);

        Function<List<Integer>, Integer> sum = list -> {
            int sum2 = 0;
            for (int i = 0; i < list.size(); i++) {
                sum2 = sum2 + list.get(i);
            }
            return sum2;
        };
        System.out.println("Sum of list elements is " + sum.apply(listOfElements));

        // Number of words in the input expression (list containing elements of type String).

        List<String> listOfStringElements = Arrays.asList("car", "dog", "apple");

        Function<List<String>, Long> count = countString -> countString.stream().count();
        System.out.println("First count: " +count.apply(listOfStringElements));

        Function<List<String>, Integer> countString = listOfStrings -> listOfStrings.size();
        System.out.println("Second count: " + countString.apply(listOfStringElements));

        Function<List<String>, Integer> countString2 = List::size;
        System.out.println("Third count: " + countString2.apply(listOfStringElements));

        // List before and after sorting (use the Arrays class and lambda expressions: String :: compareToIgnoreCase as a comparator)
        List<String> stringElemenents = Arrays.asList("car", "Dog", "apple", "bubble");
        System.out.println("The list of elements before sorting: " + stringElemenents);
        Consumer<List<String>> sortedList = listOfStrings -> listOfStrings.sort(String::compareToIgnoreCase);
        sortedList.accept(stringElemenents);
        System.out.println("The list of elements after the sorting: " + stringElemenents);


        //using Collections, but the sorting is natural:
        //Consumer<List<String>> sortList = listOfStrings -> Collections.sort(listOfStrings);
        //using Collections but same sorting result as first method:
        //Collections.sort(listOfStrings, String::compareToIgnoreCase);
    }
}

