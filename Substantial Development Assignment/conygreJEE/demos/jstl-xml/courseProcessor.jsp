<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head><title>Course Outline</title></head>
	<body>
		<c:import url="xml/courseNoNamespace.xml" var="courseXML"/>
		
		<x:parse xml="${courseXML}" var="doc" />
				
		<x:forEach select="$doc//chapter" var="current">
		<p>
			Chapter Name: <x:out select="./title"/><br>
			<ul>
				<x:forEach select="$current/objective">
					<li><x:out select="."/></li>	
				</x:forEach>
			</ul>
		</x:forEach>		
		
		
	</body>
</html>