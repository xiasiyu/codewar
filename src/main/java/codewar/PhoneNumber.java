package codewar;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        Object[] num = Arrays.stream(numbers).boxed().collect(Collectors.toList()).toArray();
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",  num);
    }
}
