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
			 InitialContext context = new InitialContext();
			  // look up the EJB using its JNDI name (use the JNDI tree to identify the name)
			  Object obj = context.lookup("/CompactDiscFacadeBean/remote");

			  // cast the returned  reference to the interface type using the narrow() method
			  CompactDiscFacade ejb = (CompactDiscFacade) PortableRemoteObject.narrow(obj, CompactDiscFacade.class);

			  // add a new CD using any data you like
			  CompactDiscProduct product = new CompactDiscProduct("Spice World", 4.99, "Spice Girls", 8, 0);
			  ejb.addCompactDisc(product);

			  // now list the CDs and check that your new one is in the list
			  List<CompactDiscProduct> cds = ejb.getCompactDiscs();
			 for (CompactDiscProduct cd : cds)
			  {
				 System.out.println("CD " + cd.getId() + " is called " + cd.getTitle() + " and is by " + cd.getArtist());

			  }


		}
		catch (javax.naming.NamingException e)
		{
			System.out.println("Naming exception " + e);
		}



	}




}