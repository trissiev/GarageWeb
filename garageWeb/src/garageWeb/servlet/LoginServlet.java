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

public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("username");
		String pass = req.getParameter("password");

		Garage garage = (Garage) req.getServletContext().getAttribute("Garage_Object");
		
		boolean loginKlant = false;
		boolean loginMonteur = false;
		boolean loginBedrijfsleider = false;
		boolean loginParkeerBeheer = false;
		
		for(Klant k : garage.getKlanten()){
			if(k.getGebruikersnaam().equals(name) && k.getWachtwoord().equals(pass)){
				loginKlant = true;
				req.getSession().setAttribute("user", k);
			}
		}
		for(Monteur k : garage.getMonteuren()){
			if(k.getGebruikersnaam().equals(name) && k.getWachtwoord().equals(pass)){
				loginMonteur = true;
				req.getSession().setAttribute("monteur", k);
			}
		}
		for(ParkeerBeheer k : garage.getBeheerders()){
			if(k.getGebruikersnaam().equals(name) && k.getWachtwoord().equals(pass)){
				loginParkeerBeheer = true;
				req.getSession().setAttribute("parkeerbeheer", k);
			}
		}
		if(garage.getDeBedrijfsleider().getGebruikersnaam().equals(name) && garage.getDeBedrijfsleider().getWachtwoord().equals(pass)){
			loginBedrijfsleider = true;
			req.getSession().setAttribute("bedrijfsleider", garage.getDeBedrijfsleider());
		}
		
		
		RequestDispatcher rd = null;
		if(name.equals("") || pass.equals("")){
			req.getSession().setAttribute("msgs", "Username and/or password are incorrect!");
			rd = req.getRequestDispatcher("/main/welcomepage.jsp");
		}
		if(loginKlant == false && loginMonteur == false && loginBedrijfsleider == false && loginParkeerBeheer == false){
			req.getSession().setAttribute("msgs", "Gebruikersnaam of wachtwoord niet bekend!");
			rd = req.getRequestDispatcher("/main/welcomepage.jsp");
		}
		if(loginKlant){			
			rd = req.getRequestDispatcher("/secure/KlantAccountServlet.do");
			
		}
		if(loginMonteur){
			rd = req.getRequestDispatcher("/secureMonteur/MonteurAccountServlet.do");
		}
		if(loginParkeerBeheer){
			rd = req.getRequestDispatcher("/secureParkeerBeheer/ParkeerBeheerAccountServlet.do");
		}
		if(loginBedrijfsleider){
			rd = req.getRequestDispatcher("/secureBedrijfsleider/BedrijfsleiderAccountServlet.do");
		}
		rd.forward(req, resp);
	}
}
