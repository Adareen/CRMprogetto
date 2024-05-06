import { CanActivateFn, Router } from "@angular/router";
import { AuthorizationService } from "./authorization.service";
import { inject } from "@angular/core";

export const authGuardGuard: CanActivateFn = (route, state) => {
  console.log("Chiamando guardia");

  const authService = inject(AuthorizationService);
  const router = inject(Router);

  if (authService.authorizedService) {
    console.log("Autorizzato");
    return true;
  } else {
    console.log("No autorizzato");
    return false;
  }
};
