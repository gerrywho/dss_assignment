import  junit.framework.*;
import com.conygre.cd.*;
import javax.ejb.*;
import java.util.*;
import java.rmi.RemoteException;
import javax.naming.*;

public class TestCompactDiscEJB extends TestCase {

    // the fixtures as instance variables
    private CompactDiscHome home;

    // set up the fixtures in this method
    public void setUp()
    {
        try
        {
            InitialContext context = new InitialContext();
            // look up the EJB using its JNDI name
           Object obj = context.lookup("java:comp/env/ejb/CompactDisc");
           // cast the returned remote reference to the home interface type using the narrow() method
           home = (CompactDiscHome) (PortableRemoteObject.narrow(obj, CompactDiscHome.class));
       }
       catch (javax.naming.NamingException e) {
         System.out.println("Could not locate CompactDiscHome" + e);
       }
    }

    // this test should pass
    public void testFindArtist()  {
        Collection discs = null;
        try
        {
            discs = home.findByArtist("Coldplay");
        }
       catch (RemoteException e) {
         System.out.println("Remote Exception " +  e);
       }
       catch (FinderException e) {
         System.out.println("Finder Exception " +  e);
       }
       assertNotNull(discs);
    }


}