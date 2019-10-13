import { Component } from '@angular/core';
import { AlertController } from '@ionic/angular';
import { Router } from '@angular/router';
import { ApiService, Cookie } from '../api.service';
import { SourceListMap } from 'source-list-map';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  cookie: string = '';
  list: Array<Cookie> = [];
  search: string = '';
  cookieId: number = 0;
  cookiePhrase: string;
  cookieTimes: number;
  cookieObject: Cookie = new Cookie();
  valido: number;
  allCookies: Array<Cookie> = [];

  constructor(public alertController: AlertController,
    private router: Router, private api: ApiService) { }

  goToCookie() {
    this.api.getCookie().subscribe((res: { phrase: string }) => {
      this.cookie = res.phrase;
    });
  }

  goToList() {
    this.api.getList().subscribe((res: Array<Cookie>) => {
      this.list = res;
    });
  }

  goToSearch() {
    this.api.getSearch(this.cookieId).subscribe((res: Cookie) => {
      if (res != null) {
        this.search = `FRASE: ${res.phrase}, VECES QUE TE HA SALIDO: ${res.times}`;
      } else {
        this.search = "No existe la id";
      }
    });
  }

  goToPost() {
    this.valido = 0;
    if (this.cookiePhrase == null) {
      console.log("Debe introducir una frase");
    } else {
      this.valido++;
    }
    if (this.cookieTimes == null) {
      this.cookieTimes = 0;
    }
    if (this.valido == 1) {
      this.cookieObject = { id: this.cookieId, phrase: this.cookiePhrase, times: this.cookieTimes };
      this.api.postCookie(this.cookieObject).subscribe(
        cookie => {
          this.goToList();
        }
      );
    }
  }

  goToPut() {
    this.cookieObject = { id: this.cookieId, phrase: this.cookiePhrase, times: this.cookieTimes };
      this.api.postCookie(this.cookieObject).subscribe(
        cookie => {
          this.goToList();
        }
      );
  }

  goToDelete() {
      this.api.deleteCookie(this.cookieId).subscribe(
        cookie => {
          this.goToList();
        }
      );
  }

  goToClone() {
    this.cookieId = 0;
    this.cookieObject = { id: this.cookieId, phrase: this.cookiePhrase, times: this.cookieTimes };
      this.api.postCookie(this.cookieObject).subscribe(
        cookie => {
          this.goToList();
        }
      );
  }

  copyCookie(c: Cookie) {
    this.cookieId = c.id;
    this.cookiePhrase = c.phrase;
    this.cookieTimes = c.times;
    this.cookieObject = { id: this.cookieId, phrase: this.cookiePhrase, times: this.cookieTimes };
  }

  ngOnInit(): void {
    this.presentAlert();
  }

  async presentAlert() {
    const alert = await this.alertController.create({
      header: 'Alert',
      subHeader: 'Subtitle',
      message: 'This is an alert message.',
      buttons: ['OK']
    });
    await alert.present();
  }

}
