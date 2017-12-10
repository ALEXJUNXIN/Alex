package web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.Msg;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(Model model){
		Msg msg =  new Msg("Testing","Message","Only show to the admin");
		model.addAttribute("msg", msg);
		return "home";
	}

}
