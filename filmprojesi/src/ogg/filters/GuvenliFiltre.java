package ogg.filters;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class GuvenliFiltre
 */
@WebFilter(dispatcherTypes = { DispatcherType.REQUEST, DispatcherType.FORWARD,
		DispatcherType.INCLUDE }, urlPatterns = { "/guvenli/*" })
public class GuvenliFiltre implements Filter {

	/**
	 * Default constructor.
	 */
	public GuvenliFiltre() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest servletRequest = (HttpServletRequest) request;
		HttpServletResponse servletResponse = (HttpServletResponse) response;

		Object kullaniciObject = servletRequest.getSession().getAttribute(
				"kullanici");
		if (kullaniciObject == null) {
			String path = servletRequest.getContextPath();
			servletResponse.sendRedirect(path+"/uyegiris.jsp");
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
