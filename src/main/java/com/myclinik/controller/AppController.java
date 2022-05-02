package com.myclinik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
	@GetMapping("/home")
	public String goToHomePage(Model model) {
		return "redirect:/calendar";
    }
}
