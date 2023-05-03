import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CodeUpTest {
    @Test
    public void testAssertEquals() {
        assertEquals("failure - strings are equal", "CodeUp", "CodeUp");
    }
    @Test
    public void testAssertNotEquals() {
        assertNotEquals("failure - strings are not equal", "Codeup", "CodeUp");
    }

    @Test
    public void testAssertNotSame() {
        List languages=new ArrayList<>();
        List moreLanguages=new ArrayList<>();
        assertNotSame("failure - Objects are not same", "languages", "moreLanguages");
    }
    @Test
    public void testAssertSame() {
        List languages=new ArrayList<>();
        assertSame("failure - Objects are not same", "languages", "languages");
    }
    @Test
    public void testAssertArrayEquals() {
        int[] numbers={1,2,3};
        int[] otherNumbers=new int[3];
        otherNumbers[0]=1;
        otherNumbers[1]=2;
        otherNumbers[2]=3;
        assertArrayEquals("failure - Arrays are equals", numbers,otherNumbers);
    }
    @Test
    public void testAssertTrue() {
        String lang="PHP";
        assertTrue("Contains H ",lang.contains("H") );
    }
    @Test
    public void testAssertFalse() {
        String lang="PHP";
        assertFalse("Not Contains J ",lang.contains("J") );
    }
}

