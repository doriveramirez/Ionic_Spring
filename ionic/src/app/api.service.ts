import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { SourceListMap } from 'source-list-map';

export class Cookie {
  id: number;
  phrase: string;
  times: number;
}

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http: HttpClient) { }

  getCookie() {
    return this.http.get("http://192.168.103.81:8080/api/cookie");
  }

  getList() {
    return this.http.get("http://192.168.103.81:8080/api/cookies");
  }

  getSearch(id: number) {
    return this.http.get(`http://192.168.103.81:8080/api/searchCookie/${id}`);
  }

  postCookie(cookie) {
    return this.http.post("http://192.168.103.81:8080/api/postCookie", null, {
      params: cookie
    });
  }

  modifyCookie(cookie){
    return this.http.put("http://192.168.103.81:8080/api/modifyCookie", null, {
      params: cookie
    });
  }

  deleteCookie(id: number){
    return this.http.delete(`http://192.168.103.81:8080/api/deleteCookie/${id}`);
  }

  duplicateCookie(cookie){
    return this.http.post("http://192.168.103.81:8080/api/duplicateCookie", null, {
      params: cookie
    });
  }
}
