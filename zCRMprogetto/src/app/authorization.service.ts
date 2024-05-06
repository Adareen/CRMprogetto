import { HttpClient } from "@angular/common/http";
import { Injectable, OnInit } from "@angular/core";
import { Utente } from "./models/utente.model";
import { HomeComponent } from "./home/home.component";

@Injectable({
  providedIn: "root",
})
export class AuthorizationService {
  constructor(private http: HttpClient) {}

  urlUtenti: string = "http://localhost:9029/api/utenti";

  listaUtenti: Utente[];

  getUtenti() {
    this.http.get<Utente[]>(this.urlUtenti).subscribe((utenti) => {
      this.listaUtenti = utenti;
    });
    
  }

  checkUser(nomeUser?: string, passUser?: string) {
    if (
      this.listaUtenti.length > 0 &&
      this.listaUtenti[0].nomeUtente == nomeUser &&
      this.listaUtenti[0].password == passUser &&
      nomeUser != "" &&
      passUser != ""
    ) {
      return true;
    } else {
      return false;
    }
  }
}
