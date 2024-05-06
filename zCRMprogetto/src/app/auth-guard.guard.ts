import { CanActivateFn, Router } from "@angular/router";
import { AuthorizationService } from "./authorization.service";
import { inject } from "@angular/core";
import { HomeComponent } from "./home/home.component";

export const authGuardGuard: CanActivateFn = (route, state) => {
  console.log("Chiamando guardia");

  const authService = inject(AuthorizationService);
  const router = inject(Router);

  const home = inject(HomeComponent);

  if (home.login()) {
    return true;
  } else {
    console.log("No autorizzato");
  }
};
