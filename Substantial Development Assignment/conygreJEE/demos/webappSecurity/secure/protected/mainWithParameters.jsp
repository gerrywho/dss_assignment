<html>
<head>
<title>Protected Page</title>
</head>
<body>
<h1>Welcome to our protected area</h1>

<% if (request.isUserInRole("visitor")) { %>
  <jsp:include page="fragmentForGuests.html"/>

<%
    }
    else if (request.isUserInRole("registeredUser"))  { %>
     <jsp:include page="fragmentForCustomers.html"/>
<% } %>


Your user name is <%=request.getRemoteUser()%> <br>
<hr>
<% if (request.isSecure()) { %>
    This page is being accessed over a secure connection.
<% } %>

</body>
</html>