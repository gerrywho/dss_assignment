import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.rmi.PortableRemoteObject;

import com.conygre.jee.ejb.timer.TimerExample;



public class TimerClient {
	public final static String JNDI_FACTORY = "org.jboss.naming.remote.client.InitialContextFactory";
	public final static String JMS_FACTORY = "jms/RemoteConnectionFactory";

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Properties env = new Properties();
		//env.put(Context.INITIAL_CONTEXT_FACTORY, JNDI_FACTORY);
		//env.put(Context.PROVIDER_URL, "remote://localhost:4447");
		//env.put(Context.SECURITY_PRINCIPAL, "sarah");
		//env.put(Context.SECURITY_CREDENTIALS, "sarahsarah");
		//env.put("remote.connection.default.username", "sarah");
		//env.put("remote.connection.default.password", "sarahsarah");
		InitialContext remoteContext = null;
		try {
			remoteContext = new InitialContext();
		} catch (NamingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String jndi = "TimerServiceExample/TimerExampleEJB!com.conygre.jee.ejb.timer.TimerExample";
		try {
			//Object lookupResult = PortableRemoteObject.narrow(remoteContext.lookup(jndi), TimerExample.class);
			Object lookupResult = remoteContext.lookup(jndi);
			TimerExample timer = (TimerExample) lookupResult;;
			timer.scheduleTimer(1000L);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
