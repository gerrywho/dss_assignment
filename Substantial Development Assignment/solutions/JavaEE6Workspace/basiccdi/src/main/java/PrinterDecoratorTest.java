import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.conygre.beans.BasicPrinter;
import com.conygre.beans.Printable;


public class PrinterDecoratorTest {

	public static void main(String[] args) {
		 WeldContainer weld = new Weld().initialize();
		 Printable p = weld.instance().select(BasicPrinter.class).get();
		 p.printText("hello world");
	}
	
}
