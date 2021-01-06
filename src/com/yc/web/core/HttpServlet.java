package com.yc.web.core;

import com.yc.tomcat.core.ConstantInfo;

public class HttpServlet implements Servlet{
	public void init(){
		
	}
	
	public void service(ServletRequest request,ServletResponse response){
		switch(request.getMethod()){
		case ConstantInfo.REQUEST_METHOD_GET: doGet(request,response);break;
		case ConstantInfo.REQUEST_METHOD_POST: doPost(request,response);break;
		
		}
	}

	public void doPost(ServletRequest request, ServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	public void doGet(ServletRequest request, ServletResponse response) {
		// TODO Auto-generated method stub
		
	}

}
