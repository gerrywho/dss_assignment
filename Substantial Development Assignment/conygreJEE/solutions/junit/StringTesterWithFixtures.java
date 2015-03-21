// In this class you are testing the use of the == method to compare strings
import  junit.framework.*;

public class StringTesterWithFixtures extends TestCase
{
    String s1, s2, s3;

    public void setUp()
    {
        s1 = "hello";
        s2 = "hello";
        s3 = new String("hello");
    }

    // test using == with two strings from the JVM string pool
    public void testStringPool()
    {
        assertTrue(s1==s2);
    }

    // test using == with one string from the JVM string pool
    // and one new string
    public void testNewString()
    {
        assertTrue(s1==s3);
    }

    // test using the equals method to compare strings
    public void testEquals()
    {
        assertTrue(s1.equals(s3));
    }

}