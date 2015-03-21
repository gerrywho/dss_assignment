<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<html>
<head>
<title>Updating a database using the sql:update tag</title>


<%-- use the setDataSource tag to create an exported 
	datasource variable called conn. 
	This will use the jdbc/conygre datasource --%>

<sql:setDataSource
  var="conn"
  dataSource="jdbc/conygre"
/>

</head>
<body>
<h1>Modify Address List</h1>


<%-- add a sql:update tag that uses the exported conn datasource. Within the body of the tag
     add a parameterized SQL statement, like those used in a java.sql.PreparedStatement.
     It should read
     
    INSERT INTO compact_discs (id, title, artist, tracks, price) VALUES (?, ?, ?, ?, ?)
    
--%>
     

<%-- nested within the update tag, add sql:param elements to set each of the parameters in the SQL
     query. The parameter values should be those from the HTML form. The value can be set using the 
     EL syntax ${param["HTML_PARAM_NAME"]}
--%>
<sql:update dataSource="${conn}" var="addresses">
    INSERT INTO compact_discs (id, title, artist, tracks, price) VALUES (?, ?, ?, ?, ?)

    <sql:param value='${param["id"]}'/>
    <sql:param value='${param["title"]}'/>
    <sql:param value='${param["artist"]}'/>
    <sql:param value='${param["tracks"]}'/>
    <sql:param value='${param["price"]}'/>
</sql:update>

<%-- add a link back to the page you created earlier that lists the values from the table --%>
<a href="jdbc.jsp">View changes</a>

</body>
</html>