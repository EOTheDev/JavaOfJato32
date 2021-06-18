<%
	if((request.getParameter("username")!=null)&&(request.getParameter("password")!=null)){
		String un=request.getParameter("username");
		String pw=request.getParameter("password");
		if((un.equals("Pippo"))&&(pw.equals("1234"))){
			out.print("login has been succesful");
			response.sendRedirect("areaRis.jsp");
		} else {
			out.print("Username or password is wrong");
		}
		
	}














%>