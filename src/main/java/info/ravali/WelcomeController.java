package info.ravali;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@GetMapping("/hello")
	public String welcome(Model model) {
		model.addAttribute("message", "Hello World");
		return "hello";
	}
}
