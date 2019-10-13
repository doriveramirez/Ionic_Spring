package com.doriveramirez.cookiesapi.entity.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doriveramirez.cookiesapi.entity.dao.ICookieDao;
import com.doriveramirez.cookiesapi.entity.models.Cookie;

@Service
public class CookieServiceImpl implements ICookieService{
	@Autowired
	private ICookieDao cookieDao;
	private Cookie cookieClone;

	@Override
	public List<Cookie> getAllCookies() {
		List<Cookie> allCookies = (List<Cookie>) cookieDao.findAll();
		ArrayList<Cookie> allCookiesFiltered = new ArrayList<Cookie>();
		for(Cookie c: allCookies) {
			if(c.getTimes() > 0) allCookiesFiltered.add(c);
		}
		return allCookiesFiltered;
	}
	
	@Override
	public void addCookie(Cookie cookie) {
		cookieDao.save(cookie);
	}
	
	@Override
	public Cookie getCookie() {
		List<Cookie> allCookies = (List<Cookie>) cookieDao.findAll();
		Cookie cookieAux = new Cookie();
		int random = (int)(Math.random() * 14 + 1);
		for(Cookie c: allCookies) {
			if(c.getId() == random) {
				c.setTimes(c.getTimes() + 1);
				cookieDao.save(c);
				cookieAux = c;
			}
		}
		cookieClone = cookieAux;
		return cookieAux;
	}
	
	public Optional<Cookie> searchCookie(long idAux) {
		return cookieDao.findById(idAux);
	}
	
	public void modifyCookie(Cookie cookie) {
	List<Cookie> allCookies = (List<Cookie>) cookieDao.findAll();
		for(Cookie c: allCookies) {
			if(cookie.getId() == c.getId()) {
				c.setPhrase(cookie.getPhrase());
				c.setTimes(cookie.getTimes());
				cookieDao.save(c);
			}
		}
	}
	
	public void deleteCookie(long idAux) {
		cookieDao.deleteById(idAux);
	}
	
	public void duplicateCookie() {
		List<Cookie> allCookies = (List<Cookie>) cookieDao.findAll();
		long idAux = 1;
		String phraseAux = "";
		int timesAux = 0;
		for(Cookie c: allCookies) {
			if (c.getId() == idAux) {
				idAux++;
			}
			if (cookieClone.getId() == c.getId()) {
				phraseAux = c.getPhrase();
				timesAux = c.getTimes();
			}
		}
		cookieDao.save(new Cookie(idAux,phraseAux,timesAux));
	}
	
}
