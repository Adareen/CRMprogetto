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

  authorizedService: boolean;

  checkUserGuard(authorized: boolean) {
    this.authorizedService = authorized;
    return this.authorizedService;
  }
}
