<%@page import="garageWeb.domein.Klant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Wijzig uw gegevens</title>
</head>
<body>
	<%
		Klant k = (Klant) request.getSession().getAttribute("user");
		if (k != null) {
			out.println(k.getNaam());
		}
	%>
	<%
			Object msgs = request.getSession().getAttribute("msg");
			if (msgs != null) {
				out.println(msgs);
			}
			%>
	<form action="/garageWeb/secure/WijzigGegevensServlet.do" method="post">
		Naam: <input type="text" name="naam" /> 
		Gebruikersnaam: <input type="text" name="username" /> 
		Wachtwoord: <input type="password" name="password" /> 
		Adres: <input type="text" name="adres" /> 
		Email: <input type="text" name="email" /> 
		<input type="submit" name="btn" value="wijzig" class="btn" />
	</form>
	<form action="/garageWeb/secure/klantaccountpage.jsp">
		<input type="submit" name="btn" value="terug" class="btn" />
	</form>


</body>
</html>