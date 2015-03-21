<html>
<head><title>Results Page</title></head>
<body>
<jsp:useBean id="myBean" class="com.conygreResultsBean" scope="session" />

<%
	String[] answers = new String[8];
	for (int i=0; i<answers.length; i++) {
		answers[i] = request.getParameter("q" + i);
	}
	myBean.setDelegateAnswers(answers);
%>

<h1>Your Score: </h1>
<p><%= myBean.getDelegateTotal() %>

</body>
</html>
