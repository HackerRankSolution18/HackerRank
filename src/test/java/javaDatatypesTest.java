import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class javaDatatypesTest {



    @Test
    public void datatypes(){
        long x = 10;
        List<String> dataTypes = javaDatatypes.getDataTypes(x);
        assertEquals(4, dataTypes.size());
        assertTrue(dataTypes.contains("byte"));
        assertTrue(dataTypes.contains("short"));
        assertTrue(dataTypes.contains("int"));

        x = 100000000000000L;
        dataTypes = javaDatatypes.getDataTypes(x);
        assertEquals(1, dataTypes.size());
        assertTrue(dataTypes.contains("long"));


    }

}