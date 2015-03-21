import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.aviva.cdi.Traveller;
import com.conygre.beans.Person;


public class TestSteerablesWithCDI {
	public static void main(String[] args) {
		WeldContainer weld = new Weld().initialize();
		Traveller t =weld.instance().select(Traveller.class).get();
		
		t.travelSomewhereWithBends();
	}
}
