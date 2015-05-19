package garageWeb.secure;

import garageWeb.domein.Klant;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KlantAccountServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {	
		RequestDispatcher rd = null;
		rd = req.getRequestDispatcher("/secure/klantaccountpage.jsp");
		rd.forward(req, resp);
	}
}
