package aurora.hand.china.web.filter;

import aurora.hand.china.web.CustomHttpServletResponseWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 重复标头过滤器
 *
 * @author Hand.liruixin
 * @date 2024/02/27
 */
public class DuplicateHeaderFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        chain.doFilter(request, new CustomHttpServletResponseWrapper(httpResponse));
    }
    @Override
    public void destroy() {
    }
}