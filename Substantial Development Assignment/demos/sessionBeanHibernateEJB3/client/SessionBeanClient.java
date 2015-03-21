import com.conygre.cd.*;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import java.util.List;
public class SessionBeanClient
{

	public static void main(String[] args)
	{
		try
		{
			 // create the initial context

			  // look up the EJB using its JNDI name (use the JNDI tree to identify the name)


			  // cast the returned  reference to the home interface type using the narrow() method


			  // add a new CD using any data you like



			  // now list the CDs and check that your new one is in the list








		}
		catch (javax.naming.NamingException e)
		{
			System.out.println("Naming exception " + e);
		}



	}




}