import { HttpClient } from "@angular/common/http";
import { inject, Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { IUsuario } from "../interfaces/usuario.interfaces";

@Injectable({
  providedIn: 'root',
})
export class UsuarioService {
    private readonly http = inject(HttpClient);
    ruta = 'http://localhost:8080/v1/usuarios';

  getAllUusario(): Observable<IUsuario[]> {
    return this.http.get<IUsuario[]>(this.ruta);
  }
}