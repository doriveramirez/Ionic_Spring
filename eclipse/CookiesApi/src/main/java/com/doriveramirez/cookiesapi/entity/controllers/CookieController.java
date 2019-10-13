package com.doriveramirez.cookiesapi.entity.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doriveramirez.cookiesapi.entity.models.Cookie;
import com.doriveramirez.cookiesapi.entity.services.ICookieService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CookieController {
	
	@Autowired
	private ICookieService cookieService;
	
	@GetMapping("/api/cookies")
	private List<Cookie> getCookies(){
		return cookieService.getAllCookies();
	}
	
	@PostMapping("/api/postCookie")
	private void addCookie(Cookie cookie) {
		cookieService.addCookie(cookie);
	}
	
	@GetMapping("/api/cookie")
	private Cookie getCookie(){
		return cookieService.getCookie();
	}
	
	@GetMapping("/api/searchCookie/{id}")
	private Optional<Cookie> searchCookie(@PathVariable (value = "id") long id) {
		return cookieService.searchCookie(id);
	}
	
	@PutMapping("/api/modifyCookie")
	private void modifyCookie(Cookie cookie) {
		cookieService.modifyCookie(cookie);
	}
	
	@DeleteMapping("/api/deleteCookie/{id}")
	private void deleteCookie(@PathVariable (value = "id") long id) {
		cookieService.deleteCookie(id);
	}
	
	@PostMapping("/api/duplicateCookie")
	private void duplicateCookie() {
		cookieService.duplicateCookie();
	}
}
