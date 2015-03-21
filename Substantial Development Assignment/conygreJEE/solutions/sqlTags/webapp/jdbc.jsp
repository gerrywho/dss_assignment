<%-- add a taglib directive for the SQL tags and the core tags --%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Using a Preconfigured DataSource</title>
</head>
<body>
<h1>A List of Available Discs</h1>


<%-- add a sql:query element to select all compact discs from the database 
     output the results using the var attribute with the name discs --%>
<sql:query dataSource="jdbc/conygre" var="discs">
    SELECT * FROM compact_discs
</sql:query>


<table width="90%" border="1">
<tr>
<%-- using the core forEach and out tags, add the table column headings, each in its own cell  --%>

<c:forEach var="columnName" items="${discs.columnNames}">
  <th> <c:out value="${columnName}"/> </th>
</c:forEach>
</tr>



<%-- add the table rows from the result set
     Use the results variable discs in a nested forEach loop. 
     The outer loop goes through the rows, 
     and the nested loop goes through the columns in each row --%>
<c:forEach var="row" items="${discs.rowsByIndex}">
  <tr>
    <c:forEach var="column" items="${row}">
      <td><c:out value="${column}"/></td>
    </c:forEach>
  </tr>
</c:forEach>


</table>
</body>
</html>