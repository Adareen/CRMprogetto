import { HttpClient } from "@angular/common/http";
import { Component, OnInit } from "@angular/core";
import { Opportunita } from "../models/opportunita.model";

@Component({
  selector: "app-dashboard",
  templateUrl: "./dashboard.component.html",
  styleUrl: "./dashboard.component.css",
})
export class DashboardComponent implements OnInit {
  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.http
      .get<Opportunita[]>(this.URLopportunita)
      .subscribe((opportunita) => {
        this.listaOpportunita = opportunita;
      });
  }

  listaOpportunita: Opportunita[];

  URLopportunita: string = "http://localhost:9029/api/opportunita";
}
