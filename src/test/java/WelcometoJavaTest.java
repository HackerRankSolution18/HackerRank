import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WelcometoJavaTest {

    @Test
    public void Welcometoindia(){
        String a="Welcome to india";
        assertEquals("Welcome to india", a);
    }

    @Test
    public void WelcometoBangalore(){
        String b="Welcome to Bangalore";
        assertEquals("Welcome to Bangalore", b);
    }
}