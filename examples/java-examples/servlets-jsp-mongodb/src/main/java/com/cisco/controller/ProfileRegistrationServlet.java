package com.cisco.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.cisco.beans.Profile;
import com.cisco.dao.ProfileDAOImpl;

/**
 * Servlet implementation class ProfileRegistrationServlet
 */
@WebServlet("/ProfileRegistrationServlet")
public class ProfileRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		long phone = Integer.parseInt(request.getParameter("phone"));
		String gender = request.getParameter("gender");
		Profile profile = new Profile(name, phone, gender);
		ProfileDAOImpl dao = new ProfileDAOImpl();
		Profile savedProfile = dao.save(profile);
		
		request.setAttribute("profile", savedProfile);
		RequestDispatcher dispatcher = request.getRequestDispatcher("registration-success.jsp");
		dispatcher.forward(request, response);
	}

}
