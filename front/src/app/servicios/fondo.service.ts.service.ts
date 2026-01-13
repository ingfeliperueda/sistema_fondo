import { HttpClient } from "@angular/common/http";
import { inject, Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { IFondo } from "../interfaces/fondo.interface.ts";

@Injectable({
  providedIn: 'root',
})
export class FondoService {
    private readonly http = inject(HttpClient);
    ruta = 'http://localhost:8080/v1/fondos';

  getAllFondo(): Observable<IFondo[]> {
    return this.http.get<IFondo[]>(this.ruta);
  }
}