<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head><title>People!</title></head>
	<body>
		<c:import url="/xml/people.xml" var="peopleXML"/>
		<x:parse xml="${peopleXML}" varDom="doc" />
		
		<x:forEach select="$doc//person" var="current">
			<p>
			Name: <x:out select="@name"/><br>
			Age: <x:out select="@age"/>
			<ul>
			<x:forEach select="$current//hobby">
				<li><x:out select="."/></li>	
			</x:forEach>
			</ul>
		</x:forEach>
	</body>
</html>