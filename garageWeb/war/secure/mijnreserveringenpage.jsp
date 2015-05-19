<%@page import="garageWeb.domein.Klant"%>
<%@page import="garageWeb.domein.Reservering"%>
<%@page import="garageWeb.domein.Parkeerplaats"%>
<%@page import="garageWeb.domein.Garage"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mijn Reserveringen</title>
</head>
<body>
	<%
		Klant k = (Klant) request.getSession().getAttribute("user");
		if (k != null) {
			out.println(k.getNaam());
		}

		Object o = request.getServletContext()
				.getAttribute("Garage_Object");
		Garage garage = (Garage) o;
		Parkeerplaats p = garage.getDeParkeerplaats();
	%>
	<div>
		<%
			if (p != null) {
				for (Reservering r : p.getReserveringen()) {
					if (r.getKlant() == k) {
						out.println(r.getDatum().getDayOfMonth() + "-"
								+ r.getDatum().getMonth() + "-"
								+ r.getDatum().getYear());
					}
				}
			}
		%>

	</div>
	<form action="/garageWeb/secure/klantaccountpage.jsp">
		<input type="submit" name="btn" value="terug" class="btn" />
	</form>

</body>
</html>