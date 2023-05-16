import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JavaifElse2Test {




    @Test
    public void javaifelse1(){
        int t = 3;
        int[] aArray = {1, 2, 3};
        int[] bArray = {2, 3, 4};
        int[] nArray = {3, 4, 5};

        int[] expected = {15,47,127};
        int[] result = JavaifElse2.calculateValues(t, aArray, bArray, nArray);

        Assertions.assertArrayEquals(expected, result);
    }


    @Test
    public void javaifelse3(){
        int t = 1;
        int[] aArray = { 1 };
        int[] bArray = { 1 };
        int[] nArray = { 1 };
        int[] expectedResult = { 2 };

        int[] result = JavaifElse2.calculateValues(t, aArray, bArray, nArray);

// Compare the result with the expected result
        Assertions.assertArrayEquals(result,expectedResult);

    }

}