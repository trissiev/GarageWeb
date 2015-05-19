<%@page import="garageWeb.domein.ParkeerBeheer"%>
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
		ParkeerBeheer k = (ParkeerBeheer) request.getSession().getAttribute("parkeerbeheer");
		if (k != null) {
			out.println(k.getNaam());
		}%>
		</p>
	</div>
	<div class="wrapper">
		parkeerbeheer
	</div>
	
</body>
</html>