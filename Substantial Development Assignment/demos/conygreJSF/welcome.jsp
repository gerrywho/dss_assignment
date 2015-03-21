<html>
    <head> <title>Conygre JSF Example</title> </head>
    <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
    <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
		<f:loadBundle basename="conygre.messages" var="messages"/>
    <body>

    <h1>Welcome to this JSF Example</h1>

    <f:view>
			<h:form id="helloForm" >

				<h:outputText id="label1" value="#{messages.colourLabelText}"/>
				<h:inputText id="colour" value="#{FavouriteBean.favouriteColour}"
												required="true"/>

				<br/>
				<h:outputText id="label2" value="#{messages.numberLabelText}"/>
				<h:inputText id="number" value="#{FavouriteBean.favouriteNumber}" required="true">
					<f:validateLongRange minimum="0" maximum="100"/>
				</h:inputText>

				<h:commandButton id="submit" action="success" value="Submit" />

				<%-- display errors if there are any --%>
				<h:message style="color: red"
									 id="errorColour"
									 for="colour"/>
				<h:message style="color: red"
									 id="errorNumber"
									 for="number"/>
			</h:form>
    </f:view>

   	</body>
</html>
