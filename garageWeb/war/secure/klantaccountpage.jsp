<%@page import="garageWeb.domein.Klant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account</title>
<link rel="stylesheet" type="text/css" href="/garageWeb/main/mainStyle.css">
</head>
<body>
	<div class="header">
		<form action="/garageWeb/servlet/LogoutServlet.do" method="get">
			<input type="submit" name="knop" value="uitloggen" id="uitloggen"/>			
		</form>
		<p id="nameInHeader">
		<%
		Klant k = (Klant) request.getSession().getAttribute("user");
		if (k != null) {
			out.println(k.getNaam());
		}%>
		</p>
	</div>
	<div class="wrapper">
	Naam: <%if (k != null) {out.println(k.getNaam()); }%> <br>
	Gebruikersnaam: <%if (k != null) {out.println(k.getGebruikersnaam()); }%> <br>
	Adres: <%if (k != null) {out.println(k.getAdres()); }%> <br>
	Email: <%if (k != null) {out.println(k.getEmail()); }%> <br>
	
	<form action="/garageWeb/secure/wijziggegevenspage.jsp">
			<input type="submit" name="knop" value="Gegevens wijzigen" id="uitloggen"/>			
		</form>
		<form action="/garageWeb/secure/mijnautospage.jsp">
			<input type="submit" name="knop" value="Mijn Auto's" id="uitloggen"/>			
		</form>
		<form action="/garageWeb/secure/mijnafsprakenpage.jsp">
			<input type="submit" name="knop" value="Afspraaken garage" id="uitloggen"/>			
		</form>
		<form action="/garageWeb/secure/mijnreserveringenpage.jsp">
			<input type="submit" name="knop" value="Reserveringen parkeerplaats" id="uitloggen"/>			
		</form>
	</div>
	
	
</body>
</html>