<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/garageWeb/main/mainStyle.css">
<link rel="stylesheet" type="text/css" href="/garageWeb/main/welkomStyle.css">
<title>Welkom bij ATD!</title>
</head>
<body>
	<div class="header"></div>
	<div class="wrapper">
		<div class="content">
		<form action="/garageWeb/servlet/RegistreerServlet.do" method="post">
			Naam: <input type="text" name="naam" />
			Gebruikersnaam: <input type="text" name="username" />
			Wachtwoord: <input type="password" name="password" />
			Adres:    <input type="text" name="adres" />
			Email: <input type="text" name="email" />
			<div id="knop">
					<input type="submit" name="btn" value="registreer" class="btn" />
				</form>
				<form action="/garageWeb/main/welcomepage.jsp">
					<input type="submit" name="btn" value="terug" class="btn" />
				</form>
			</div>
		</div>
	</div>
</body>
</html>