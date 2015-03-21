
import com.conygre.*;
import javax.ejb.*;
import java.util.*;
import java.rmi.RemoteException;
import javax.rmi.PortableRemoteObject;
import javax.naming.*;

public class HelloWorldBeanTest {

    public static void main(String[] args)
    {
        try
        {
			InitialContext context = new InitialContext();
			Object obj = context.lookup("HelloWorldBean/remote");
			HelloWorld remoteReference = (HelloWorld)
						PortableRemoteObject.narrow(obj, HelloWorld.class);


			System.out.println("The result from the remote bean is " +
													remoteReference.sayHello("Nick"));



       }
       catch (javax.naming.NamingException e) {
         System.out.println("Could not locate MathLocal" + e);
       }

    }



}

//     [java] Exception in thread "main" java.lang.NoClassDefFoundError: org/jb/aspects/asynch/AsynchProvider