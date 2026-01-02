package gr.aueb.cf.cf9.ch17.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class FilterMain {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //filter even number
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        List<Integer> evenNumbers2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        var evenNumber3 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toArray();

        List<Integer> cities = List.of("Athens", "Berlin", "Paris", "Tokyo");

        var filtersedCities = cities.stream()
                .filter(city -> city.startsWith("T"))
                .collect(Collectors.toCollection(HashSet::new));
        filteredCities.forEach(Syatem.out::println);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        var filteredArr


    }
}
