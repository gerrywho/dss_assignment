import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;


import com.conygre.beans.Plane;


public class PlaneInterceptorTest {
	
	public static void main(String[] args) {
		 WeldContainer weld = new Weld().initialize();
		 Plane p = weld.instance().select(Plane.class).get();
		 p.takeOff();
		 p.takeOffAgain();
	}

}
