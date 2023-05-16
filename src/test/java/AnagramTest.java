import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {


    @Test
    public void isanagaram(){
        String A="Heart";
        String B ="Earth";
        Boolean expected = true;
        Boolean result = Anagram.isAnagram(A,B);
        assertEquals(expected, result);


    }

}