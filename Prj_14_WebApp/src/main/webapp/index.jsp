
<!DOCTYPE html>
<%@page import="entities.Libro"%>
<html>
<head>
<meta charset="UTF-8">
<title>Titolone </title>
</head>
<body>
<h1>Hello web</h1>
<%
String s="ciaone";//questo è uno scriplet
out.print("<h2>"+s+"</h2>");
String si = "Ciao"; //questo è uno scriptlet(piccolo script)
for (int i=1;i<=6;i++){
	out.print("<h"+i+">"+si+"</h"+i+">");
}

Libro l= new Libro(s);
%>
<p><%=l %></p>
<form action="" action="post">
	<input type="text" name="cognome">
	<input type="submit" name="invia" value="invia">
</form>
<h1> Benvenuto, <%=request.getParameter("cognome") %></h1>
</body>
</html>