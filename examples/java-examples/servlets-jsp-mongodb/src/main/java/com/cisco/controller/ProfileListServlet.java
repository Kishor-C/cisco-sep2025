package com.cisco.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.cisco.beans.Profile;
import com.cisco.dao.ProfileDAOImpl;

/**
 * Servlet implementation class ProfileListServlet
 */
@WebServlet("/ProfileListServlet")
public class ProfileListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProfileDAOImpl dao = new ProfileDAOImpl();
		List<Profile> list = dao.findAll();
		// list can be stored in request scope, session scope, application scope
		request.setAttribute("profiles", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("display-profiles.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
