import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class outputFormatting2Test {


    @Test
    public void multiple5(){
        int N = 5;
        String expectedOutput = "5 x 1 = 5\n" +
                "5 x 2 = 10\n" +
                "5 x 3 = 15\n" +
                "5 x 4 = 20\n" +
                "5 x 5 = 25\n" +
                "5 x 6 = 30\n" +
                "5 x 7 = 35\n" +
                "5 x 8 = 40\n" +
                "5 x 9 = 45\n" +
                "5 x 10 = 50\n";
        String actual = outputFormatting2.multiple(N);
        Assertions.assertEquals(expectedOutput, actual.toString());
    }

}