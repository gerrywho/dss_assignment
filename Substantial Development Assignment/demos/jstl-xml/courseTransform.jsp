<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head><title>Course Outline</title></head>
	<body>
		<c:import url="/xml/course.xml" var="courseXML"/>
		
		<c:import url="/xslt/course.xslt" var="courseXSL"/>
		
		<x:transform xml="${courseXML}" xslt="${courseXSL}"/>
		
	</body>
</html>