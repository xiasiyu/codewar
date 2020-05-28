package codewar;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindOddInt {
    public static int findIt(int[] a) {
        Stream<Integer> integerStream = IntStream.of(a).boxed();
        Set<Integer> set = integerStream.collect(Collectors.toSet());

        for (Integer integer : set) {
            int times = (int) integerStream.filter(i -> i.equals(integer)).count();
            if(times % 2 == 1) {
                return integer;
            }

        }
        return 0;
    }

    public static int minValue(int[] values){
        String integers = IntStream.of(values).distinct().sorted().mapToObj(String::valueOf).collect(Collectors.joining());
        return Integer.parseInt(integers);

    }
}
