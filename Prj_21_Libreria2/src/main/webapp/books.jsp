<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="model.Libro"%>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Libri</title>
</head>
<body>
<h1>Libri</h1>
 <%@ include file="form.jsp" %>
<ul>
<%
ArrayList<Libro> libri=(ArrayList<Libro>) request.getAttribute("libri");
	for(Libro l : libri){%>
<li>
		<%=l.getTitolo()%>
</li><%
	}
%>
</ul>
</body>
</html>