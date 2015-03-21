<html>
<head>
<title>Expression Language Exercise</title>
<%
		// here is a page scoped attribute called pageColor
    pageContext.setAttribute("pageColor", "blue");

    // a basic array of Strings
    String[] myArray = {"Rod", "Jane", "Freddie"};

    // add the myArray to the pageContext with the name 'array'


    // here is a HashMap object
    java.util.Map map = new java.util.HashMap();
    map.put("Captain", "Picard");
    map.put("1st Officer", "Ryker");
    map.put("Head of Security", "Worf");
    map.put("Counsellor", "Troy");

    // add the map to the pageContext with the name 'hashMap'


%>

</head>

<!-- set the pageColor attribute as the background colour for the Web page -->
<body bgcolor="white">

<h1>Using the EL</h1>

Here are the three elements from myArray
<!-- display the array elements here -->



Here are the four map values
<!-- display the map values here -->



<hr>You appear to be using the following browser:
<!-- using the header map implicit variable, display the user-agent key value -->


</body>
</html>