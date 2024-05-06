import { Component, EventEmitter, OnInit, Output } from "@angular/core";
import { AuthorizationService } from "../authorization.service";
import { Utente } from "../models/utente.model";
import { HttpClient } from "@angular/common/http";

@Component({
  selector: "app-home",
  templateUrl: "./home.component.html",
  styleUrl: "./home.component.css",
})
export class HomeComponent implements OnInit {
  constructor(
    private authServ: AuthorizationService,
    private http: HttpClient
  ) {}

  listaUtenti: Utente[];

  nomeUtente: string;
  password: string;

  // login() {
  //   console.log(this.listaUtenti);
  //   return true;
  // }
  urlUtenti: string = "http://localhost:9029/api/utenti";

  ngOnInit(): void {
    this.http.get<Utente[]>(this.urlUtenti).subscribe((utenti) => {
      this.listaUtenti = utenti;
    });
  }

  authorized: boolean;

  checkUser() {
    this.listaUtenti.forEach((utente) => {
      if (
        this.listaUtenti.length > 0 &&
        utente.nomeUtente == this.nomeUtente &&
        utente.password == this.password &&
        this.nomeUtente != "" &&
        this.password != ""
      ) {
        this.authorized = true;
      } else {
        this.authorized = false;
      }
      this.authServ.checkUserGuard(this.authorized);
    });
  }
}
