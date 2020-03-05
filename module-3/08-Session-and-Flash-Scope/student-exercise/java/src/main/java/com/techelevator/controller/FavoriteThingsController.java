package com.techelevator.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/FavoriteThings")
public class FavoriteThingsController {

	@RequestMapping(path = {"/Page1","/page1"}, method = RequestMethod.GET)
	public String getPage1(ModelMap map, HttpSession session) {
		return "page1";
	}
	
	@RequestMapping(path = "/Page1", method = RequestMethod.POST)
	public String submitFavoriteColor(@RequestParam String favoriteColor, HttpSession session) {
		session.setAttribute("favoriteColor", favoriteColor);
		return "redirect:Page2";
	}
	
	@RequestMapping(path = "/Page2", method = RequestMethod.GET)
	public String getPage2(ModelMap map, HttpSession session) {
		return "page2";
	}
	@RequestMapping(path = "/Page2", method = RequestMethod.POST)
	public String submitFavoriteFood(@RequestParam String favoriteFood, HttpSession session) {
		session.setAttribute("favoriteFood", favoriteFood);
		return "redirect:/FavoriteThings/Page3";
	}
	@RequestMapping(path = "/Page3", method = RequestMethod.GET)
	public String getPage3(ModelMap map, HttpSession session) {
		return "page3";
	}
	@RequestMapping(path = "/Page3", method = RequestMethod.POST)
	public String submitFavoriteSeason(@RequestParam String season, HttpSession session) {
		session.setAttribute("season", season);
		return "redirect:/FavoriteThings/Summary";
	}
	@RequestMapping(path = "/Summary", method = RequestMethod.GET)
	public String getSummary(ModelMap map, HttpSession session) {
		String favoriteColor=(String)session.getAttribute("favoriteColor");
		String favoriteFood=(String)session.getAttribute("favoriteFood");
		String season=(String)session.getAttribute("season");
		map.put("favoriteColor", favoriteColor);
		map.put("favoriteFood", favoriteFood);
		map.put("season", season);
		
		return "summary";
	}

}
