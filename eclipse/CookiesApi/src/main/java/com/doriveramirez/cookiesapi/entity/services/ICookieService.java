package com.doriveramirez.cookiesapi.entity.services;

import java.util.List;
import java.util.Optional;

import com.doriveramirez.cookiesapi.entity.models.Cookie;

public interface ICookieService {
	public List<Cookie> getAllCookies();
	public void addCookie(Cookie cookie);
	public Cookie getCookie();
	public Optional<Cookie> searchCookie(long id);
	public void modifyCookie(Cookie cookie);
	public void deleteCookie(long id);
	public void duplicateCookie();
}
