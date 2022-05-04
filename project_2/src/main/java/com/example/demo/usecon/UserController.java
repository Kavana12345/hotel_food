package com.example.demo.usecon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Food;
import com.example.demo.userservice.ServiceClass;

@Controller
public class UserController {
	
	@Autowired
	ServiceClass ser;
	
	@RequestMapping("/")
	public String fun1(Model mo) {
		List<Food> li=ser.getAll();
		mo.addAttribute("food",li);
		return "home"; 
	}
	
	@RequestMapping("/add")
	public String fun2() {
		return "add_form";
	}
	@RequestMapping("/adding")
	public String fun4(Food food) {
		ser.add(food);
		return "redirect:/";
	}
	
	@RequestMapping("/update/{id}")
	public String fun3(@PathVariable("id") int id,Model m) {
		m.addAttribute("food", ser.update(id));
		return "update_form";
	}
	@RequestMapping("/delete/{id}")
	public String fun5(@PathVariable("id") int id) {
		ser.del(id);
		return "redirect:/";
	}
	

}
