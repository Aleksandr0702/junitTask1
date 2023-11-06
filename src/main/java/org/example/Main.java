package org.example;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static ArrayList<Integer> filterAndSortPositiveEvenNumbers(List<Integer> intList) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : intList) {
            if (num > 0 && num % 2 == 0) {
                result.add(num);
            }
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        ArrayList<Integer> result = filterAndSortPositiveEvenNumbers(intList);

        for(int num : result) {
            System.out.println(num);
        }
    }
}
