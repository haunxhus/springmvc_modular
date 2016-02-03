package com.vsii.softwarefacotry.user;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

	private static final Logger _logger = Logger.getLogger(UserController.class);

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public ModelAndView login() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Custom Login Form & Remember Me");
		model.addObject("message", "This is default page!");

		model.setViewName("login");
		// logs debug message
		if (_logger.isDebugEnabled()) {
			_logger.debug("Login is executed!");
		}
		_logger.info("views/login");
		return model;

	}
}
