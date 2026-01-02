package gr.aueb.cf.cf9.ch17.streams;

import gr.aueb.cf.cf9.ch17.sorting.Product;

import java.util.List;

public class MainMap {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1 ,2, 3, 4, 5);
        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.5, 100),
                new Product("Oranges", 8.1, 50),
                new Product("Milk", 2.8, 100),
                new Product("Apples", 22.5, 120)
        ));

        List<Integer> squares = numbers.stream()
                .map(num -> num * num)
                .toList();
        squares.forEach(System.out::println);

        var ListOfDescriptions = products.stream()
                .map(p -> p.getDescription())
                .toList();
    }

    public static class ReduceMain {
        public static void main(String[] args) {

        }
    }
}
