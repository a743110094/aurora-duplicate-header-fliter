package aurora.hand.china.web;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * 自定义HttpServlet响应包装器
 *
 * @author Hand.liruixin
 * @date 2024/02/27
 * @description 应用错误设置了重复的响应头 客制化请求回复类 阻止设置响应头 避免重复
 * @see javax.servlet.ServletResponse
 */
public class CustomHttpServletResponseWrapper extends HttpServletResponseWrapper {

    public static final String TRANSFER_ENCODING = "Transfer-Encoding";

    public CustomHttpServletResponseWrapper(HttpServletResponse response) {
        super(response);
    }

    @Override
    public void setHeader(String name, String value) {
        if (!TRANSFER_ENCODING.equalsIgnoreCase(name)) {
            super.setHeader(name, value);
        }
    }

    @Override
    public void addHeader(String name, String value) {
        if (!TRANSFER_ENCODING.equalsIgnoreCase(name)) {
            super.addHeader(name, value);
        }
    }

    @Override
    public void setIntHeader(String name, int value) {
        if (!TRANSFER_ENCODING.equalsIgnoreCase(name)) {
            super.setIntHeader(name, value);
        }
    }

    @Override
    public void addIntHeader(String name, int value) {
        if (!TRANSFER_ENCODING.equalsIgnoreCase(name)) {
            super.addIntHeader(name, value);
        }
    }

    @Override
    public void setDateHeader(String name, long date) {
        if (!TRANSFER_ENCODING.equalsIgnoreCase(name)) {
            super.setDateHeader(name, date);
        }
    }

    @Override
    public void addDateHeader(String name, long date) {
        if (!TRANSFER_ENCODING.equalsIgnoreCase(name)) {
            super.addDateHeader(name, date);
        }
    }

}