package com.doriveramirez.cookiesapi.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.doriveramirez.cookiesapi.entity.models.Cookie;

public interface ICookieDao extends CrudRepository<Cookie, Long>{
	
}
