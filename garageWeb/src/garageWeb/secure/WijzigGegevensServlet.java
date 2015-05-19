package garageWeb.secure;

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

public class WijzigGegevensServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String naam = req.getParameter("naam");
		String username = req.getParameter("username");
		String pass = req.getParameter("password");
		String adres = req.getParameter("adres");
		String email = req.getParameter("email");
		req.setAttribute("naam", naam);

		Klant nu = (Klant) req.getSession().getAttribute("user");
		
		Garage garage = (Garage) req.getServletContext().getAttribute("Garage_Object");
		boolean taken = false;
		RequestDispatcher rd = null;
		if (naam.equals("") || pass.equals("") || username.equals("") || adres.equals("") || email.equals("")) {
			req.setAttribute("msg", "Niet alle velden ingevuld");
			rd = req.getRequestDispatcher("/secure/wijziggegevenspage.jsp");
		} else {
			for (Klant k : garage.getKlanten()) {
				if (k.getGebruikersnaam().equals(username)) {
					if(!k.getGebruikersnaam().equals(nu.getGebruikersnaam())){
						taken = true;
					}
					
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
				rd = req.getRequestDispatcher("/secure/wijziggegevenspage.jsp");
			}
			if (!taken) {
				nu.setNaam(naam);
				nu.setAdres(adres);
				nu.setEmail(email);
				nu.setGebruikersnaam(username);
				nu.setWachtwoord(pass);
				rd = req.getRequestDispatcher("/secure/klantaccountpage.jsp");
				req.getSession().setAttribute("user", nu);
			}
		}
		rd.forward(req, resp);
	}
}
