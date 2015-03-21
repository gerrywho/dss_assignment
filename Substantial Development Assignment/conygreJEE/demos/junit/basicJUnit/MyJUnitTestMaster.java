import  junit.framework.*;
import java.awt.Button;

public class MyJUnitTest extends TestCase
{

    // this test should pass
    public void testButtonLabel()
    {
        Button b1 = new Button("OK");
        Button b2 = new Button("OK");
        assertTrue(b1.getLabel().equals(b2.getLabel()));
    }

    // this test should pass
    public void testButtonNull()
    {
        Button b1 = null;
        assertNull(b1);
    }

    // this test will fail
    public void testButtonNotNull()
    {
        Button b1 = null;
        assertNotNull(b1);
    }

}