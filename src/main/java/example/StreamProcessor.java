package example;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProcessor {

    /**
     * isEvenNumber(List<Integer> numbers) using following methods from Stream API.
     * allMatch(): returns true if all the elements of the stream matches the mentioned predicate(condition) otherwise
     * false
     * stream(): creates sequential Stream
     *
     * @param numbers
     * @return true if all the elements are even number otherwise false.
     */
    public boolean isEvenNumber(List<Integer> numbers) {

        return numbers.stream().allMatch(value -> value % 2 == 0);
    }

    /**
     * isOddNumber(List<Integer> numbers) using following methods from Stream API.
     * anyMatch(): returns true if any of the elements of the stream matches the mentioned predicate(condition) otherwise
     * false
     * stream(): creates sequential Stream
     *
     * @param numbers
     * @return true if any of the elements are odd otherwise false.
     */
    public boolean isOddNumber(List<Integer> numbers) {

        return numbers.stream().anyMatch(value -> value % 2 != 0);
    }

    /**
     * concatenateTwoStreams() using following methods from Stream API.
     * of(): static method which returns sequential ordered stream
     * concat(): creates a concatenated stream having all the elements of first stream followed by another
     * collect(): collect the result of a Stream processing pipeline in a list by using Collectors.toList() method
     *
     * @return concatenated list of Integer
     */
    public List<Integer> concatenateTwoStreams() {

        Stream<Integer> evenStream = Stream.of(2, 4, 6);
        Stream<Integer> oddStream = Stream.of(1, 3, 5);

        return Stream.concat(evenStream, oddStream).collect(Collectors.toList());
    }

    /**
     *removeDuplicates( List<Integer> numbers) using following methods from Stream API.
     * stream(): creates sequential Stream
     * distinct(): returns a stream that consist distinct elements only
     * collect(): collect the result of a Stream processing pipeline in a list by using Collectors.toList() method
     *
     * @param numbers
     * @return list of distinct integers
     */
    public List<Integer> removeDuplicates(List<Integer> numbers) {

        return numbers.stream().distinct().collect(Collectors.toList());
    }

    /**
     * countElements(List<Integer> numbers) using following methods from Stream API.
     * stream(): creates sequential Stream
     * count(): return the number of elements in the stream.
     * @param numbers
     * @return long value
     */

    public long countElements(List<Integer> numbers) {

        return numbers.stream().count();
    }

    /**
     * sortElements(List<Integer> numbers) using following methods from Stream API.
     * stream(): creates sequential Stream
     * sorted(): sort the list with Comparator.naturalOrder() i.e Ascending order
     * collect(): collect the result of a Stream processing pipeline in a list by using Collectors.toList() method
     * @param numbers
     * @return list of integer arranged in ascending order
     */
    public List<Integer> sortElements(List<Integer> numbers) {

        return numbers.stream().sorted().collect(Collectors.toList());

    }

    /**
     * sortElementsInDescendingOrder(List<Integer> numbers) using following methods from Stream API.
     * stream(): creates sequential Stream
     * sorted(): sort the list with Comparator.reverseOrder() i.e Descending order
     * collect(): collect the result of a Stream processing pipeline in a list by using Collectors.toList() method
     * @param numbers
     * @return list of integer arranged in ascending order
     */
    public List<Integer> sortElementsInDescendingOrder(List<Integer> numbers) {

        return numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    }

    /**
     * generateRandomNumber() using following methods from Stream API.
     * generate(): returns an infinite sequential unordered stream.
     * limit(): returns a stream of size no more than N mentioned in argument.
     * collect(): collect the result of a Stream processing pipeline in a list by using Collectors.toList() method
     * @return list of Random
     */
    public List<Random> generateRandomNumber() {

        return Stream.generate(Random::new).limit(3).collect(Collectors.toList());
    }

    /**
     * transformIntoString(List<Integer> numbers) using following methods from Stream API
     * stream(): creates sequential Stream
     * map(): returns a stream consisting of the results of applying function to the elements of this stream.
     * collect(): collect(): collect the result of a Stream processing pipeline in a list by using Collectors.toList()
     * method
     *
     * @param numbers
     * @return list of String
     */
    public List<String> transformIntoString(List<Integer> numbers) {

        return numbers.stream().map(String::valueOf).collect(Collectors.toList());

    }

    /**
     * implementFindFirst(List<Integer> numbers) using following methods from Stream API
     * stream(): creates sequential Stream
     * findFirst(): returns an Optional consisting the first element of this stream
     * @param numbers
     * @return Option of Integer
     */
    public Optional<Integer> implementFindFirst(List<Integer> numbers) {

        return numbers.stream().findFirst();
    }

    /**
     * findSumOfAllTheElements(List<Integer> numbers) using following methods from Stream API
     * stream(): creates sequential Stream
     * reduce(): reduce the elements into a single value
     * @param numbers
     * @return Option of Integer
     */
    public Optional<Integer> findSumOfAllTheElements(List<Integer> numbers) {

        return numbers.stream().reduce((a, b) -> a + b);
    }

    /**
     * findSumOfAllTheElements(List<String> numbers) using following methods from Stream API
     * stream(): creates sequential Stream
     * reduce(): reduce the elements into a single value
     * @param fruits
     * @return Map<String, Integer>
     */
    public Map<String, Integer> convertListIntoMap(List<String> fruits) {

        return fruits.stream().collect(Collectors.toMap(Function.identity(), String::length));

    }

    /**
     * getFruitsInUpperCaseWithLengthTwo(List<String> fruits) using following methods from Stream API
     * stream(): creates sequential Stream
     * filter(): returns Stream that match the predicate
     * map(): returns a stream consisting of the results of applying function to the elements of this stream.
     * peek(): returns a stream consisting of the elements of this stream, additionally
     *      * performing the provided action on each element as elements are consumed
     *      * from the resulting stream.
     * @param fruits
     * @return List<String>
     */
    public List<String> getFruitsInUpperCaseWithLengthFive(List<String> fruits) {

        return fruits.stream()
                .filter(value -> value.length() == 5)
                .peek(System.out::println)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    }
}
