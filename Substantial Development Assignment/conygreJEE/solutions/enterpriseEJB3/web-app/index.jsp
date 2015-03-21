<html>
<head>
<title>List of all Compact Discs</title>
</head>
<body>
<h1>All Available CDs</h1>
<%@ page import="com.conygre.cd.*, javax.naming.*,java.util.*" %>
<%
  // create the context
  Context context = new InitialContext();
  
  Object obj = context.lookup("compactdiscs/CompactDiscFacade/local");
  
  CompactDiscFacadeLocal local = (CompactDiscFacadeLocal) obj;

  List cds = local.getCompactDiscs();
  Iterator iter = cds.iterator();
  
  while (iter.hasNext())
  {
     CompactDiscProduct cd = (CompactDiscProduct) iter.next();
     out.println("CD " + cd.getId() + " is called " + cd.getTitle() + " and is by " + cd.getArtist() + ".<br>");
 
  }
%>
</body>
</html>