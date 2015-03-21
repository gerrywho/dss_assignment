import com.conygre.ejb.*;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
public class BookClient
{

	public static void main(String[] args)
	{
		try
		{
			InitialContext context = new InitialContext();
			Object obj = context.lookup("BookRetrieverEJB/remote");
			BookRetriever ret = (BookRetriever)PortableRemoteObject.narrow(obj, BookRetriever.class);
			System.out.println("The book is called " + ret.getBookByID(2).getTitle());

		}
		catch (javax.naming.NamingException e)
		{
			System.out.println("Naming exception " + e);
		}



	}




}