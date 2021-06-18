<%@ page errorPage="errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Area Riservata</title>
</head>
<body>
	<form action="" method="post">
		<input type="number" name="op1" id="op1">
		<input type="number" name="op2" id="op2">
		<input type="submit" value="Calcola">
	</form>
	<% 
	if((request.getParameter("op1")!=null)&&(request.getParameter("op2")!=null)){
		int op1=Integer.parseInt(request.getParameter("op1"));
		int op2=Integer.parseInt(request.getParameter("op2"));

		out.print("il risultato dell'addizione è: "+(op1+op2));
		out.print("<br>il risultato della sottrazione è: "+(op1-op2));
		out.print("<br>il risultato della moltiplicazione è: "+(op1*op2));
		out.print("<br>il risultato della divisione è: "+(op1/op2));
	}
		
		
	%>
	
	
</body>
</html>