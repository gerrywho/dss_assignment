
import com.conygre.cd.*;
import javax.ejb.*;
import java.util.*;
import java.rmi.RemoteException;
import javax.rmi.PortableRemoteObject;
import javax.naming.*;

public class TestMathBean {

    public static void main(String[] args)
    {
        try
        {
			InitialContext context = new InitialContext();
			Object obj = context.lookup("jboss/maths/MyMathBean");
			MathInterface remote = (MathInterface) (PortableRemoteObject.narrow(obj, MathInterface.class));
			System.out.println("two plus two is " + remote.add(2,2));

       }
       catch (javax.naming.NamingException e) {
         System.out.println("Could not locate MathLocal" + e);
       }

    }



}

//     [java] Exception in thread "main" java.lang.NoClassDefFoundError: org/jb/aspects/asynch/AsynchProvider