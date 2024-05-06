import { HttpClient } from "@angular/common/http";
import { Component, OnInit } from "@angular/core";
import { Cliente } from "../models/cliente.model";
import { Appuntamento } from "../models/appuntamento.model";

@Component({
  selector: "app-infos",
  templateUrl: "./infos.component.html",
  styleUrl: "./infos.component.css",
})
export class InfosComponent implements OnInit {
  constructor(private http: HttpClient) {}

  listaClienti: Cliente[];
  listaAppuntamenti: Appuntamento[];

  ngOnInit(): void {
    this.http.get<Cliente[]>(this.URLclienti).subscribe((clienti) => {
      this.listaClienti = clienti;
    });

    this.http
      .get<Appuntamento[]>(this.URLappuntamenti)
      .subscribe((appuntamenti) => {
        this.listaAppuntamenti = appuntamenti;
      });
  }

  URLclienti: string = "http://localhost:9029/api/clienti";
  URLappuntamenti: string = "http://localhost:9029/api/appuntamenti";
}
