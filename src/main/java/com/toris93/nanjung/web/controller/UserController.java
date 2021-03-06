package com.toris93.nanjung.web.controller;

import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.toris93.nanjung.web.domain.UserVO;
import com.toris93.nanjung.web.service.UserService;

@Controller
public class UserController {
	
	@Resource(name="userservice")
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		
		return "login/login";
	}
	
	@RequestMapping(value = "/loginProc", method = RequestMethod.POST)
	public String loginProc(HttpServletRequest request) {
		String returnURL="login/login";
		UserVO user = new UserVO();
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		user = userService.getUser(user);
		if(user != null) {
			returnURL = "contents/list";
		}
		return returnURL;
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(Locale locale, Model model) {
		return "login/signup";
	}
	
	@RequestMapping(value = "/signupProc", method = RequestMethod.POST)
	public String signupProc(HttpServletRequest request) {
		UserVO user = new UserVO();
		int result;
		
		user.setEmail(request.getParameter("email"));
		user.setName(request.getParameter("name"));
		user.setPassword(request.getParameter("password"));
		result = userService.insertUser(user);
		
		return "login/login";
	}
	
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String profile(Locale locale, Model model) {
		return "login/profile";
	}
	
	@RequestMapping(value="/loginform", method=RequestMethod.GET)
    public ModelAndView loginForm(UserVO loginCommand,
                    @CookieValue(value="REMEMBER", required=false) Cookie rememberCookie) throws Exception {
        
        if(rememberCookie!=null) {
            loginCommand.setEmail(rememberCookie.getValue());
            loginCommand.setRememberId(true);
        }
        
        ModelAndView mv = new ModelAndView("login/loginForm");
        return mv;
    }




}
