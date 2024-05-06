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
  // ruolo: string;
  // email: string;
  password: string;
  // dataRegistrazione: string;
  // idutente: number;

  login() {
    // this.listaUtenti = this.authServ.listaUtenti;
    // console.log(this.listaUtenti[0]);
    // if (this.authServ.checkUser(this.nomeUtente, this.password) == true) {
    //   console.log("utente giusto");
    // }
    console.log(this.listaUtenti);
    return true;
  }
  urlUtenti: string = "http://localhost:9029/api/utenti";

  ngOnInit(): void {
    this.http.get<Utente[]>(this.urlUtenti).subscribe((utenti) => {
      this.listaUtenti = utenti;
    });
    console.log(this.listaUtenti);
  }
}
