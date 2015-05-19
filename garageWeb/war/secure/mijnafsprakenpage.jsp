<%@page import="garageWeb.domein.Klant"%>
<%@page import="garageWeb.domein.Auto"%>
<%@page import="garageWeb.domein.ReserveerKlus"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mijn afspraken</title>
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
			for(ReserveerKlus rk : a.getReserveerKlussen()){
				out.println(rk.getDatum().getDayOfMonth()+"-"+rk.getDatum().getMonth()+"-"+rk.getDatum().getYear());
				out.println(rk.getOmschrijving()+"<html><br></html>");
			}
			
		}
	%>
	
	</div>
	<form action="/garageWeb/secure/klantaccountpage.jsp">
		<input type="submit" name="btn" value="terug" class="btn" />
	</form>

</body>
</html>