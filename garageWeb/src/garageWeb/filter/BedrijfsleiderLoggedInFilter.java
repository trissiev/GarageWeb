package garageWeb.filter;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

public class BedrijfsleiderLoggedInFilter implements Filter {
	public void init(FilterConfig arg0) throws ServletException {
		/* Filter is being placed into service, do nothing. */
	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest r2 = (HttpServletRequest) req;
		if (r2.getSession().getAttribute("bedrijfsleider") == null) {
			r2.getSession().setAttribute("msgs", "Monteur komt niet door filter");
			r2.getRequestDispatcher("/main/welcomepage.jsp").forward(req, resp);
		} else {
			chain.doFilter(req, resp);
		}
	}

	public void destroy() {
		/* Filter is being taken out of service, do nothing. */
	}
}