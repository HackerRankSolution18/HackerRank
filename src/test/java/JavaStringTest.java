import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaStringTest {



    @Test
    public void string1(){
        String A = "I LOVE";
        String B = "Babu";
        String expected = "I LOVE Babu";
        String result = JavaString.capFirstLetter(A)+" "+JavaString.capFirstLetter(B);
        Assertions.assertEquals(expected,result);
    }

}