import junit.framework.*;

public class MyJUnitTest2 extends TestCase
{

	public void testName()
	{
		String myName = "Nick";

		assertTrue(myName.equals("Nick"));

	}

	public void testName2()
		{
			String myName = "Nick";

			assertTrue(myName.equals("Nichola"));

	}


}