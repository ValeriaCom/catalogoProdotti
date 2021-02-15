import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Prodotto } from './prodotto';
import { RichiestaAServerDto } from './richiesta-a-server-dto';
import { RispostaDaServerDto } from './richiesta-da-server-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  prodotto = new Prodotto();
  prodotti: Prodotto[] = [];
  url = "http://localhost:8080/";

  constructor(private http: HttpClient) {
    // carica i dati della rubrica all'avvio
    this.aggiorna();
  }

  aggiungi() {
    // metto il contatto da inserire nel DTO
    let req = new RichiestaAServerDto();
    req.prodotto = this.prodotto;

    // preparo la richiesta POST verso il server
    let ox: Observable<RispostaDaServerDto> = this.http
      .post<RispostaDaServerDto>(this.url + "inserisci", req);
    // invio la richiesta, avendole dato la callback
    ox.subscribe(r => {
      this.prodotti = r.listaProdotti;
    });
    // resetto l'oggetto associato al campo di input
    this.prodotto = new Prodotto();
  }

  aggiorna() {
    // preparo la richiesta GET verso il server
    let ox: Observable<RispostaDaServerDto> = this.http
      .get<RispostaDaServerDto>(this.url + "leggi-rubrica");
    // invio la richiesta, avendole dato la callback
    ox.subscribe(r => {
      this.prodotti = r.listaProdotti;
    });
  }

  svuota() {
    // preparo la richiesta GET verso il server
    let ox: Observable<RispostaDaServerDto> = this.http
      .get<RispostaDaServerDto>(this.url + "svuota");
    // invio la richiesta, avendole dato la callback
    ox.subscribe(r => {
      this.prodotti = r.listaProdotti;
    });
   }

  cancella(c: Prodotto) {
    // metto il contatto da cancellare nel DTO
    let req = new RichiestaAServerDto();
    req.prodotto = c;

    // preparo la richiesta POST verso il server
    let ox: Observable<RispostaDaServerDto> = this.http
      .post<RispostaDaServerDto>(this.url + "cancella", req);
    // invio la richiesta, avendole dato la callback
    ox.subscribe(r => {
      this.prodotti = r.listaProdotti;
    });
   }
}
