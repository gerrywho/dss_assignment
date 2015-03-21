<html>
<head><title>My First JSP</title></head>
<body>

<h1>My JSP</h1>

<%
for (int i=0; i<10;i++)
{
	out.println("i is " + i);
	out.println("<br>");
}
%>
</body>
</html>