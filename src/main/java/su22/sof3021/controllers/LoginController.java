package su22.sof3021.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import su22.sof3021.beans.Login;

@Controller
public class LoginController {
	@GetMapping("login")
	public String getLoginForm()
	{
		return "login";
	}
	
	@PostMapping("login")
	public String login(Login login)
	{
		System.out.println(login.getEmail());
		System.out.println(login.getPassword());
		return "login";
	}
}
