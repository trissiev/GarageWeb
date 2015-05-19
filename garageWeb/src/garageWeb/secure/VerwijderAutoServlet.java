package garageWeb.secure;

import garageWeb.domein.Auto;
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

public class VerwijderAutoServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		/*System.out.println(kenteken);
		*/Klant nu = (Klant) req.getSession().getAttribute("user");/*
		for(Auto a : nu.getAutos()){
			if(a.getKenteken().equals(kenteken)){
				a = null;
				
			}
		}*/
		RequestDispatcher rd = null;
		rd = req.getRequestDispatcher("/secure/mijnautospage.jsp");
		req.getSession().setAttribute("user", nu);		
		rd.forward(req, resp);
	}
}
