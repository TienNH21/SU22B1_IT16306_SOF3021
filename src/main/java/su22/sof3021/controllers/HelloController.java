package su22.sof3021.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@GetMapping("hello")
	public String hello(
		Model model,
		@RequestParam(
			name="ho_ten",
			defaultValue="IT16306"
		) String hoTen
	) {
		model.addAttribute("message", hoTen);
		return "hello";
	}
}
