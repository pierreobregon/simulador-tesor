package com.pss.simulador.web.controller.generic;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;

/**
 * @author pierre.obregon
 * @version 21/1/2016
 */
public class GenericController {
	FacesContext facesContext;
	public ApplicationContext ctx = FacesContextUtils
			.getWebApplicationContext(this.getFacesContext());
	HttpServletRequest request = (HttpServletRequest) this.getFacesContext()
			.getExternalContext().getRequest();
	HttpServletResponse response = (HttpServletResponse)this.getFacesContext()
			.getExternalContext().getResponse();

	public FacesContext getFacesContext() {
		return facesContext == null ? FacesContext.getCurrentInstance()
				: facesContext;
	}
	
	public HttpServletRequest getRequest() {
		return request;
	}
	
	public HttpServletResponse getResponse() {
		return response;
	}
	
	public HttpSession getSession() {
		return this.getRequest().getSession();
	}
	

}
