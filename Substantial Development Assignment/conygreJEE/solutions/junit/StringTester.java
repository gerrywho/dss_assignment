// In this class you are testing the use of the == method to compare strings
import  junit.framework.*;

public class StringTester extends TestCase
{

    // test using == with two strings from the JVM string pool
    public void testStringPool()
    {
        String s1 = "hello";
        String s2 = "hello";
        assertTrue(s1==s2);
    }

    // test using == with one string from the JVM string pool
    // and one new string
    public void testNewString()
    {
        String s1 = new String("hello");
        String s2 = "hello";
        assertTrue(s1==s2);
    }

    // test using the equals method to compare strings
    public void testEquals()
    {
        String s1 = new String("hello");
        String s2 = "hello";
        assertTrue(s1.equals(s2));
    }

}