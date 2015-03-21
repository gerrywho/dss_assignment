<html>
<head>
<title>Expression Language Exercise</title>
<%
		// here is a page scoped attribute called pageColor
    pageContext.setAttribute("pageColor", "blue");

    // a basic array of Strings
    String[] myArray = {"Rod", "Jane", "Freddie"};

    pageContext.setAttribute("array", myArray);

    // here is a HashMap object
    java.util.Map map = new java.util.HashMap();
    map.put("Captain", "Picard");
    map.put("1st Officer", "Ryker");
    map.put("Head of Security", "Worf");
    map.put("Counsellor", "Troy");

    pageContext.setAttribute("hashMap", map);

%>

</head>

<!-- set the pageColor attribute as the background colour for the Web page -->
<body bgcolor="${pageScope.pageColor  }">

<h1>Using the EL</h1>

Here are the three elements from myArray
<ul>
	<li>${array[0]}</li>
	<li>${array[1]}</li>
	<li>${array[2]}</li>
</ul>


Here are the four map values
<ul>
	<li>${hashMap["Captain"]}</li>
	<li>${hashMap["1st Officer"]}</li>
	<li>${hashMap["Head of Security"]}</li>
	<li>${hashMap["Counsellor"]}</li>
</ul>

<hr>You appear to be using the following browser:

<!-- using the header map implicit variable, display the user-agent key value -->
${header["user-agent"]}

</body>
</html>