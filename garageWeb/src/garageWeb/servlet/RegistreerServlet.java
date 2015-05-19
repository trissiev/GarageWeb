package garageWeb.servlet;

import garageWeb.domein.Garage;
import garageWeb.domein.Klant;
import garageWeb.domein.Monteur;
import garageWeb.domein.ParkeerBeheer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistreerServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String naam = req.getParameter("naam");
		String username = req.getParameter("username");
		String pass = req.getParameter("password");
		String adres = req.getParameter("adres");
		String email = req.getParameter("email");
		req.setAttribute("naam", naam);

		Garage garage = (Garage) req.getServletContext().getAttribute("Garage_Object");
		System.out.println(garage.getNaam());
		boolean taken = false;
		RequestDispatcher rd = null;
		if (naam.equals("") || pass.equals("") || username.equals("") || adres.equals("") || email.equals("")) {
			req.setAttribute("msg", "Niet alle velden ingevuld");
			rd = req.getRequestDispatcher("main/registreerpage.jsp");
		} else {
			for (Klant k : garage.getKlanten()) {
				if (k.getGebruikersnaam().equals(username)) {
					taken = true;
				}
			}
			for (Monteur k : garage.getMonteuren()) {
				if (k.getGebruikersnaam().equals(username)) {
					taken = true;
				}
			}
			for (ParkeerBeheer k : garage.getBeheerders()) {
				if (k.getGebruikersnaam().equals(username)) {
					taken = true;
				}
			}
			if(garage.getDeBedrijfsleider().getGebruikersnaam().equals(username)){
				taken = true;
			}
			if(taken){
				req.setAttribute("msg", "Username already taken");
				rd = req.getRequestDispatcher("main/registreerpage.jsp");
			}
			if (!taken) {
				Klant nieuweKlant = new Klant(naam, adres, email, username, pass);
				garage.setKlant(nieuweKlant);
				rd = req.getRequestDispatcher("main/welcomepage.jsp");
			}
		}
		rd.forward(req, resp);
	}
}
