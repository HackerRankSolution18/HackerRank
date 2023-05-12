import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaIfElseTest {



    @Test
    public void ifelseEven2to5(){
        int input = 3;
        String expected = "Weird";
        String actual = JavaIfElse.checkNumber(input);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifelseEven6to10(){
        int input = 2;
        String expected = "Not Weird";
        String actual = JavaIfElse.checkNumber(input);
        Assertions.assertEquals(expected, actual);
    }

}