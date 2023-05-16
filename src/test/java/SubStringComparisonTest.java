import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubStringComparisonTest {

    @Test
    public void Compa(){
        String s="maheshbabu";
        int k = 3;
        String expected = "abu"+"\n"+
                "shb";
        String result = SubStringComparison.getSmallestAndLargest(s, k);
        Assertions.assertEquals(expected,result);
    }

}