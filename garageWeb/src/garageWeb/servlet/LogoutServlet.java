package garageWeb.servlet;

import garageWeb.domein.Klant;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getSession().setAttribute("msgs", "U bent uitgelogd");
		Klant naam = (Klant) req.getSession().getAttribute("user");
		req.getSession().removeAttribute("user");
		req.getSession().removeAttribute("monteur");
		req.getSession().removeAttribute("bedrijfsleider");
		req.getSession().removeAttribute("parkeerbeheer");
		
		RequestDispatcher rd = null;
		rd = req.getRequestDispatcher("/main/welcomepage.jsp");
		rd.forward(req, resp);
	}
}
