import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void getName () throws Exception {
        Person p = new Person("John");
        assertEquals("John", p.getName());
    }

    @Test
    public void testIsHappy() {
        Person p = new Person("John");
        assertFalse(p.isHappy());
    }
}