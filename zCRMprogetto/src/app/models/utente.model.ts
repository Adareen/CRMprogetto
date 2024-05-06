export class Utente {
  constructor(
    public nomeUtente: string,
    public ruolo: string,
    public email: string,
    public password: string,
    public dataRegistrazione: string,
    public idutente: number
  ) {}

  // "nomeUtente": "admin",
  //   "ruolo": "Amministratore",
  //   "email": "admin@example.com",
  //   "password": "password",
  //   "dataRegistrazione": "2024-04-01",
  //   "idutente": 1
}
