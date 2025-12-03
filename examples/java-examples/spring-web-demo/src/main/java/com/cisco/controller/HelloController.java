package com.cisco.controller;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cisco.beans.Profile;
import com.cisco.dao.ProfileDAO;

@Controller
@RequestMapping("/webapi")
public class HelloController {
	
	@Autowired
	private ProfileDAO dao;
	
	@RequestMapping(method = RequestMethod.GET, path = "/profiles")
	public ModelAndView getProfiles() {
		List<Profile> list = dao.findAll();
		ModelAndView mav = new ModelAndView("display", "profileList", list);
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/time")
	public ModelAndView getTime() {
		LocalTime time = LocalTime.now();
		/*
		 * ModelAndView(viewName, modelName, model)
		 */
		ModelAndView mav = new ModelAndView("display", "obj", time);
		/*
		 * View Resolver -> prefix = WEB-INF/pages/  suffix = .jsp
		 * WEB-INF/pages/display.jsp
		 */
		return mav;
	}
}
