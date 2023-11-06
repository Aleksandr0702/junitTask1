package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class MainTest {

    @Test
    public void testMainLogic() {
        // given:
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> expected = Arrays.asList(2, 4, 8, 16, 32);
        // when:
        ArrayList<Integer> result = Main.filterAndSortPositiveEvenNumbers(intList);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStreamMainLogic() {
        // given:
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> expected = Arrays.asList(2, 4, 8, 16, 32);
        // when:
        List<Integer> result = StreamMain.filterAndSortPositiveEvenNumbers(intList);
        // then:
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testBothMethodsConsistency() {
        // given:
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        // when:
        ArrayList<Integer> resultMain = Main.filterAndSortPositiveEvenNumbers(intList);
        List<Integer> resultStream = StreamMain.filterAndSortPositiveEvenNumbers(intList);
        // then:
        Assertions.assertEquals(resultMain, resultStream);
    }
}

