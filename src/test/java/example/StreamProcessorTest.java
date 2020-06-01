package example;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class StreamProcessorTest {

    @Test
    public void testIsEvenNumberReturnTrue() {
        StreamProcessor processor = new StreamProcessor();

        //Return true as all the elements of the list are even number.
        boolean result = processor.isEvenNumber(Arrays.asList(2, 4, 6, 8));
        assertTrue(result);
    }

    @Test
    public void testIsEvenNumberReturnFalse() {
        StreamProcessor processor = new StreamProcessor();

        //Return false as all the elements of the list are not even number.
        boolean result =  processor.isEvenNumber(Arrays.asList(1, 2, 3, 4));
        assertFalse(result);
    }

    @Test
    public void testIsOddNumberReturnTrue() {
        StreamProcessor processor = new StreamProcessor();

        //Return true as any of the elements are odd
        boolean result =  processor.isOddNumber(Arrays.asList(1, 2, 3, 4));
        assertTrue(result);
    }

    @Test
    public void testIsOddNumberReturnFalse() {
        StreamProcessor processor = new StreamProcessor();

        //Return false as none of the element matches the condition of having odd number
        boolean result =  processor.isOddNumber(Arrays.asList(2, 4, 6));
        assertFalse(result);
    }

    @Test
    public void testConcatenateTwoStream() {
        StreamProcessor processor = new StreamProcessor();

        List<Integer> concatenatedList =  processor.concatenateTwoStreams();
        assertEquals(6, concatenatedList.size());
    }

    @Test
    public void testRemoveDuplicates() {
        StreamProcessor processor = new StreamProcessor();

        List<Integer> processedList =  processor.removeDuplicates(Arrays.asList(1, 2, 3, 4, 1, 1, 1, 1, 2, 3, 2));
        assertEquals(4, processedList.size());
    }

    @Test
    public void testCountElements() {
        StreamProcessor processor = new StreamProcessor();

        long numberOfElements =  processor.countElements(Arrays.asList(1, 2, 3, 4));
        assertEquals(4, numberOfElements);
    }

    @Test
    public void testSortElements() {
        StreamProcessor processor = new StreamProcessor();

        List<Integer> processedList =  processor.sortElements(Arrays.asList(4, 2, 1, 5));
        assertEquals(Arrays.asList(1, 2, 4, 5), processedList);
    }

    @Test
    public void testSortElementsInDescendingOrder() {
        StreamProcessor processor = new StreamProcessor();

        List<Integer> processedList =  processor.sortElementsInDescendingOrder(Arrays.asList(4, 2, 1, 5));
        assertEquals(Arrays.asList(5, 4, 2, 1), processedList);
    }

    @Test
    public void testGenerateRandomNumber() {
        StreamProcessor processor = new StreamProcessor();

        assertEquals(3, processor.generateRandomNumber().size());

    }

    @Test
    public void testTransformIntoString() {
        StreamProcessor processor = new StreamProcessor();

        List<String> processedResult = processor.transformIntoString(Arrays.asList(1, 2, 3, 4));
        assertEquals(Arrays.asList("1", "2", "3", "4"), processedResult);

    }

    @Test
    public void testImplementFindFirst() {
        StreamProcessor processor = new StreamProcessor();

        Optional<Integer> processedResult = processor.implementFindFirst(Arrays.asList(1, 2, 3, 4));
        assertEquals(Optional.of(1), processedResult);

    }

    @Test
    public void testFindSumOfAllTheElements() {
        StreamProcessor processor = new StreamProcessor();

        Optional<Integer> processedResult = processor.findSumOfAllTheElements(Arrays.asList(1, 2, 3, 4));
        assertEquals(Optional.of(10), processedResult);

    }

    @Test
    public void convertListIntoMap() {
        StreamProcessor processor = new StreamProcessor();

        Optional<Integer> processedResult = processor.findSumOfAllTheElements(Arrays.asList(1, 2, 3, 4));
        assertEquals(Optional.of(10), processedResult);

    }

    @Test
    public void testConvertListIntoMap() {
        StreamProcessor processor = new StreamProcessor();
        Map<String, Integer> result = new HashMap<>();
        result.put("Apple", 5);
        result.put("Mango", 5);
        Map<String, Integer> processedResult = processor.convertListIntoMap(Arrays.asList("Apple", "Mango"));
        assertEquals(result, processedResult);

    }

    @Test
    public void testGetFruitsInUpperCaseWithLengthFive() {
        StreamProcessor processor = new StreamProcessor();
        List<String> processedResult = processor.getFruitsInUpperCaseWithLengthFive(Arrays.asList("Apple", "PineApple"));
        assertEquals(Arrays.asList("APPLE"), processedResult);

    }

}
