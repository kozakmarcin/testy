package org.example.ap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;


public class commonTwo {

    // https://codingbat.com/prob/p100369

    // Jako imperatywna implementacja to bardzo dobre rozwiązanie
    public int commonTwo(String[] a, String[] b) {
        int sum = 0;
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (i > 0 && a[i - 1].equals(a[i]) || a[i].compareTo(b[j]) < 0) {
                i++;
            } else if (j > 0 && b[j - 1].equals(b[j]) || a[i].compareTo(b[j]) > 0) {
                j++;
            } else {
                sum++;
                if (i <= a.length - 1) i++;
                if (j <= b.length - 1) j++;
            }

        }
        return sum;
    }

    // Metoda testowa do Twojego rozwiązania

    @ParameterizedTest
    @MethodSource("testCasesData")
    public void commonTwoUnitTests(String[] a, String[] b, int expected) {
        int actual = commonTwo(a, b);
        Assertions.assertEquals(expected, actual);
    }

    // Alternatywne rozwiązanie poniżej

    public int commonTwo_alternate(String[] a, String[] b) {
        Set<String> setA = new HashSet<>(Arrays.stream(a).toList());
        Set<String> setB = new HashSet<>(Arrays.stream(b).toList());

        List<String> duplicatedElements = setA.stream().filter(setB::contains).toList();
        return duplicatedElements.size();
    }

    // Metoda testowa do alternatywnego rozwiązania

    @ParameterizedTest
    @MethodSource("testCasesData")
    public void commonTwo_alternateUnitTests(String[] a, String[] b, int expected) {
        int actual = commonTwo_alternate(a, b);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> testCasesData() {
        return Stream.of(
                arguments(new String[]{"a", "c", "x"}, new String[]{"b", "c", "d", "x"}, 2),
                arguments(new String[]{"a", "c", "x"}, new String[]{"a", "b", "c", "x", "z"}, 3),
                arguments(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}, 3),
                arguments(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "c"}, 3),
                arguments(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "b", "b", "c"}, 3),
                arguments(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "b", "c", "c"}, 3),
                arguments(new String[]{"b", "b", "b", "b", "c"}, new String[]{"a", "b", "b", "b", "c"}, 2),
                arguments(new String[]{"a", "b", "c", "c", "d"}, new String[]{"a", "b", "b", "c", "d", "d"}, 4),
                arguments(new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b", "b"}, 1),
                arguments(new String[]{"a", "a", "b", "b", "c"}, new String[]{"c", "c"}, 1),
                arguments(new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b", "b", "x"}, 1),
                arguments(new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b"}, 1),
                arguments(new String[]{"a"}, new String[]{"a", "b"}, 1),
                arguments(new String[]{"a"}, new String[]{"b"}, 0),
                arguments(new String[]{"a", "a"}, new String[]{"b", "b"}, 0),
                arguments(new String[]{"a", "b"}, new String[]{"a", "b"}, 2),
// --- Nadmiarowe przypadki testowe
                arguments(new String[]{"a", "a", "a", "b", "b", "b", "c"}, new String[]{"b", "b", "b"}, 1)
        );
    }

}
