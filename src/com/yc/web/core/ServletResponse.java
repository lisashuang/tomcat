package com.yc.web.core;

import java.io.IOException;
import java.io.PrintWriter;

public interface ServletResponse {
	/**
	 * 重定向
	 */
	public void sendRedirect(String url);
	
	public PrintWriter getWriter() throws IOException;

}
