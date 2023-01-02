package org.example.ap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class mergeTwo {

    // https://codingbat.com/prob/p139150

    /*
       Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
       Return a new array containing the first N elements from the two arrays.
       The result array should be in alphabetical order and without duplicates.
       A and B will both have a length which is N or more.
       The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are
       in alphabetical order, copying elements directly to the new array.
     */

    // Jako imperatywna implementacja to bardzo dobre rozwiązanie. Wada jest, ze za duzo sie dzieje na raz.
    // Ja bym rozbil to na kroki. Utworzenie osobnego, posortowanego seta, a pozniej wyciagniecie n pierwszych znakow.

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] merged = new String[n];

        int i = 0;
        int j = 0;
        int count = 0;

        while (count < n) {
            if (a[i].compareTo(b[j]) < 0) {
                merged[count] = a[i];
                i++;
            } else if (a[i].compareTo(b[j]) > 0) {
                merged[count] = b[j];
                j++;
            } else {
                merged[count] = a[i];
                i++;
                j++;
            }
            count++;
        }
        return merged;
    }

    // Metoda testowa do Twojego rozwiązania

    @ParameterizedTest
    @MethodSource("testCasesData")
    public void mergeTwoUnitTests(String[] a, String[] b, int n, String[] expected) {
        String[] actual = mergeTwo(a, b, n);
        Assertions.assertEquals(expected, actual);
    }

    // Alternatywne rozwiązanie poniżej

    public String[] mergeTwo_alternate(String[] a, String[] b, int n) {
        Set<String> setA = new HashSet<>(Arrays.stream(a).toList());
        Set<String> setB = new HashSet<>(Arrays.stream(b).toList());

        Set<String> mergedSet = new HashSet<>();
        mergedSet.addAll(setA);
        mergedSet.addAll(setB);

        return mergedSet.stream().toList().subList(0, n).toArray(new String[n]);

        // Obie wersje return poprawne, ale ta z gory ciut lepsza
        // return (String[]) mergedSet.stream().toList().subList(0,n).toArray();
    }

    // Metoda testowa do alternatywnego rozwiązania

    @ParameterizedTest
    @MethodSource("testCasesData")
    public void mergeTwo_alternateUnitTests(String[] a, String[] b, int n, String[] expected) {
        String[] actual = mergeTwo_alternate(a, b, n);

        Assertions.assertArrayEquals(expected, actual);
    }

    static Stream<Arguments> testCasesData() {
        return Stream.of(
                arguments(new String[]{"a", "c", "z"}, new String[]{"b", "f", "z"}, 3, new String[]{"a", "b", "c"}),
                arguments(new String[]{"a", "c", "z"}, new String[]{"c", "f", "z"}, 3, new String[]{"a", "c", "f"}),
                arguments(new String[]{"f", "g", "z"}, new String[]{"c", "f", "g"}, 3, new String[]{"c", "f", "g"}),
                arguments(new String[]{"a", "c", "z"}, new String[]{"a", "c", "z"}, 3, new String[]{"a", "c", "z"}),
                arguments(new String[]{"a", "b", "c", "z"}, new String[]{"a", "c", "z"}, 3, new String[]{"a", "b", "c"}),
                arguments(new String[]{"a", "c", "z"}, new String[]{"a", "b", "c", "z"}, 3, new String[]{"a", "b", "c"}),
                arguments(new String[]{"a", "c", "z"}, new String[]{"a", "c", "z"}, 2, new String[]{"a", "c"}),
                arguments(new String[]{"a", "c", "z"}, new String[]{"a", "c", "y", "z"}, 3, new String[]{"a", "c", "y"}),
                arguments(new String[]{"x", "y", "z"}, new String[]{"a", "b", "z"}, 3, new String[]{"a", "b", "x"})
        );
    }

}
