<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head><title>People!</title></head>
	<body>
		<c:import url="/xml/people.xml" var="peopleXML"/>
		<c:import url="/xslt/people.xsl" var="peopleXSL"/>
		<x:parse xml="${peopleXML}" varDom="doc" />
		
		<x:transform xml="${peopleXML}" xslt="${peopleXSL}"/>
		<x:transform xml="${peopleXML}" xslt="${peopleXSL}">
			<x:param name="colour" value="green"/>
			<x:param name="who" value="Rachel"/>
		</x:transform>
		<x:transform xml="${peopleXML}" xslt="${peopleXSL}">
					<x:param name="colour" value="blue"/>
					<x:param name="who" value="Simon"/>
		</x:transform>
	</body>
</html>