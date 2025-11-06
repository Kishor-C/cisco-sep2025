package com.cisco;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class DemoTag extends SimpleTagSupport {

	// executed when you use the custom tag in your JSP file
	@Override
	public void doTag() throws JspException, IOException {
		// getJspContext has getOut() method to create a writer
		// this writer writes the content in the browser
		JspWriter out =  getJspContext().getOut();
		out.print("<h3>Hello Demo Tag</h3>");
	}	
}
