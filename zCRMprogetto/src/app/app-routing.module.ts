import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { DashboardComponent } from "./dashboard/dashboard.component";
import { HomeComponent } from "./home/home.component";
import { authGuardGuard } from "./auth-guard.guard";

const routes: Routes = [
  {
    path: "dashboard",
    component: DashboardComponent,
    canActivate: [authGuardGuard],
  },
  { path: "", component: HomeComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
