<html>
    <head> <title>Your favourite Colour</title> </head>
    <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
    <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
    <body bgcolor="white">
    <f:view>

    	<h2>Your favourite colour is <h:outputText id="result1"
    			value="#{FavouriteBean.favouriteColour}"/></h2>

    	<h2>Your favourite number is <h:outputText id="result2"
    			value="#{FavouriteBean.favouriteNumber}"/></h2>

    </f:view>
 </HTML>
