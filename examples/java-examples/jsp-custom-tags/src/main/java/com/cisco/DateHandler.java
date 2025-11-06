package com.cisco;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class DateHandler extends SimpleTagSupport {
	
	private String pattern;
	//<customDate pattern="some format" />
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}


	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		LocalDate date = LocalDate.now();
		out.print(date.format(DateTimeFormatter.ofPattern(pattern)));
	}
}
