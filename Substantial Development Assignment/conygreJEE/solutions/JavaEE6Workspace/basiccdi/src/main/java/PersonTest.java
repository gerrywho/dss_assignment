import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.conygre.beans.Person;


public class PersonTest {
	
	public static void main(String[] args) {
		 WeldContainer weld = new Weld().initialize();
		 Person p = weld.instance().select(Person.class).get();
		 System.out.println(p.getAddress().getLine1());

		 p.getPet().stroke();
		 
		 p.getVehicle().move();
		 
		 p.crossTheRoad();
		 
		
	}

}
