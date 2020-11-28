package advanced.optionals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        List<String> cars = Arrays.asList("Dacia", "BMW", "Toyota");
        Stream<String> carsStream = cars.stream();

        List<String> carsFromStream = carsStream.collect(Collectors.toList());
        System.out.println(carsFromStream);

//        System.out.println(carsStream.count());

        cars.stream().forEach(c -> System.out.println(c));
        Optional<String> first = cars.stream().findFirst();
        if (first.isPresent()) {
            System.out.println(first.get());
        }

        Optional<String> elem = cars.parallelStream().findAny();
        if (elem.isPresent()) {
            System.out.println(elem.get());
        }

        System.out.println("-------------");

        List<String> endsWithAElements = cars.stream()
                .filter(c -> c.endsWith("a"))
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("-------------");

        List<Integer> countLetters = endsWithAElements.stream()
                .filter(c -> c.endsWith("a"))
                .map(String::length)
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println(countLetters);

        System.out.println("-------------");

        int countOfLetters = cars.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("The sum of all letters in the list is: " + countOfLetters);

        // reducer
        System.out.println("-------------");

        String concatenatedNames = cars.stream()
                .reduce("", (currentValue, element) ->
                        currentValue.isEmpty() ?
                                currentValue + element : currentValue + ", " + element);

        System.out.println(concatenatedNames);

        System.out.println("-------------");
        System.out.println("Homework");

        List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        List<Integer> numbers = Arrays.asList(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);

        // a) sort the list

        List<String> sortedList = names.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        System.out.println("-------------");

        List<Integer> sortedIntList = numbers.stream().sorted().collect(Collectors.toList());
        sortedIntList.forEach(System.out::println);

        System.out.println("-------------");

        // b) Print only those names, that start with „E” letter.

        List<String> endsWithE = names.stream()
                .filter(n -> n.startsWith("E"))
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("-------------");

        //c) Print values greater than 30 and lower than 200.

        List<Integer> requiredValues = numbers.stream()
                .filter(n -> n > 30 && n < 200)
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("-------------");

        //d) Print names uppercase.

        List<String> uppercasedStrings = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercasedStrings);

        System.out.println("-------------");

        // e) Remove first and last letter, sort and print names.

        List<String> requiredStrings = names.stream()
                .map(s -> s.substring(1, s.length() - 1))
//                .peek(System.out::println)
                .sorted(String::compareToIgnoreCase)
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("-------------");

        // *Sort backwards by implementing reverse Comparator and using lambda expression.

        Comparator<String> comparator1 = (aName, bName) -> bName.compareTo(aName);
        List<String> reversedList = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reversedList);

        System.out.println("-------------");

        Comparator<Integer> comparator2 = (n1, n2) -> n2.compareTo(n1);
        List<Integer> reversedNumbersList = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reversedNumbersList);

        System.out.println("-------------");

        // without implementing Comparator and using lambda expression

        List<String> reverseSortedNames = names.stream()
                .sorted(Comparator.reverseOrder())
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("-------------");

        List<Integer> reverseSortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
}
