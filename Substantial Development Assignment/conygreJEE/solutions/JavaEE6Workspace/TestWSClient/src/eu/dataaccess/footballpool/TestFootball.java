package eu.dataaccess.footballpool;

public class TestFootball {
	
	
	public static void main(String[] args) {
		
		Info info = new Info();
		InfoSoapType service = info.getInfoSoap();
		
		System.out.println(service.redCardsTotal());
		
		
	}

}
