
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Libreria home</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<%@include file="menu.jsp" %>		
	<%
	
	String pagina="home";
	if(request.getParameter("page")!=null){
		pagina=request.getParameter("page");
	}
		
	switch(pagina){
	case "addLibro":
		%>
		<%@include file="addLibro.jsp" %>
		<%		
		break;
	case "listLibro":
		%>
		<%@include file="list.jsp" %>
		<%		
		break;
	case "cart":
		%>
		<%@include file="cart.jsp" %>
		<%		
		break;
	case "home":
		%>
		<%@include file="home.jsp" %>
		<%		
		break;
	
	}
	
	
	%>
	
	
	
	<%@include file="footer.jsp" %>
</body>
</html>