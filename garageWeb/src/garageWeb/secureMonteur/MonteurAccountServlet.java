package garageWeb.secureMonteur;

import garageWeb.domein.Klant;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MonteurAccountServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {	
		System.out.println("monteurservlet");
		RequestDispatcher rd = null;
		rd = req.getRequestDispatcher("monteuraccountpage.jsp");
		rd.forward(req, resp);
	}
}
