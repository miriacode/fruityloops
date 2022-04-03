package com.codingdojo.miriam.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.codingdojo.miriam.models.Item;

@Controller
public class ItemController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Model model) {
		ArrayList<Item> fruits = new ArrayList<Item>();
	    fruits.add(new Item("Kiwi", 1.5));
	    fruits.add(new Item("Mango", 2.0));
	    fruits.add(new Item("Bayas de Goji", 4.0));
	    fruits.add(new Item("Guayava", 0.75));
	    fruits.add(new Item("Watermelon",5.0));
	    fruits.add(new Item("Banana",2.0));
	    
	    
	    model.addAttribute("fruits", fruits);
	    
	    return "index.jsp";
	}
	
}
