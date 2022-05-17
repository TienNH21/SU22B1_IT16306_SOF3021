package su22.sof3021.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import su22.sof3021.beans.User;

@Controller
@RequestMapping("/admin/users")
public class UserController {
	@GetMapping("create")
	public String create(@ModelAttribute("user") User user)
	{
//		System.out.println(user.getHoTen());
		return "admin/users/create";
	}

	@PostMapping("store")
	public String store(@ModelAttribute("user") User user)
	{
		return "admin/users/create";
	}
}
