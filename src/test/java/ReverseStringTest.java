import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {


    @Test
    public void reve(){
        String A ="Mahesh babu";
        String expected = "ubab hsehaM";
        String result = ReverseString.reverseString(A);

        Assertions.assertEquals(expected, result);

    }

}