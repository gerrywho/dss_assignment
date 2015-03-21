import  junit.framework.*;
import java.awt.Button;
public class MyJUnitTestWithFixtures extends TestCase {
     // the fixtures as instance variables
     private Button b1, b2, b3;
    // set up the fixtures in this method
    public void setUp()  {
        b1 = new Button("OK");
        b2 = new Button("OK");
    }
    // this test should pass
    public void testButtonLabel()  {
        assertTrue(b1.getLabel().equals(b2.getLabel()));
     }
   // this test will fail
   public void testButtonNotNull()  {
       assertNotNull(b3);
    }
}
