<%@page import="garageWeb.domein.Klant"%>
<%@page import="garageWeb.domein.Auto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mijn Auto's</title>
</head>
<body>
<%
		Klant k = (Klant) request.getSession().getAttribute("user");
		if (k != null) {
			out.println(k.getNaam());
		}%>
	<div>
	<%
		for(Auto a : k.getAutos()){
			out.println(a.getMerk());
			out.println(a.getKenteken());
			String s = a.getKenteken();
			 %>
			 <form action="/garageWeb/secure/VerwijderAutoServlet.do" method="post">
				<input type="submit"  name="<%=s%>" value="verwijder" class="btn" id="custom"/>
			</form>
			 <br><%
		}
	%>
	
	</div>
	<form action="/garageWeb/secure/klantaccountpage.jsp">
		<input type="submit" name="btn" value="terug" class="btn" />
	</form>

</body>
</html>