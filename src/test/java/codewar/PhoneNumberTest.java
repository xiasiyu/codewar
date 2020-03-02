package codewar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PhoneNumberTest {

    @Test
    public void createPhoneNumber() {

        int numbers[] = {1,2,3,4,5,6,7,8,9,0};

        String phoneNumber = PhoneNumber.createPhoneNumber(numbers);
        System.out.println(phoneNumber);
    }
}
