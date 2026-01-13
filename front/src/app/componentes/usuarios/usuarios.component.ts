import { Component, inject, OnInit } from '@angular/core';
import { UsuarioService } from '../../servicios/usuario.service';
import { IUsuario } from '../../interfaces/usuario.interfaces';
import { CommonModule } from '@angular/common';
import { FondoService } from '../../servicios/fondo.service.ts.service';
import { IFondo } from '../../interfaces/fondo.interface.ts';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-usuarios',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './usuarios.component.html',
  styleUrl: './usuarios.component.css'
})
export class UsuariosComponent implements OnInit {
  private readonly Usuarioservice = inject(UsuarioService);
  private readonly FondoService = inject(FondoService);
  public usuarios: IUsuario[] = [];
  public fondos: IFondo[] = [];
  public fondoSeleccionado!: number;

  ngOnInit(): void {
    // this.usuarios = [
    //   { id: 1, nombre: 'Juan Perez'}];
    this.getAllUsuarios();
    this.getAllFondos();
  }

  getAllUsuarios(){
    this.Usuarioservice.getAllUusario().subscribe({
      next: (data) => {
        this.usuarios = data;
      },
      error: (error) => {
        console.error('Error fetching users:', error);
      }
    });
  }

  getAllFondos(){
    this.FondoService.getAllFondo().subscribe({
      next: (data) => {
        this.fondos = data;
      },
      error: (error) => {
        console.error('Error fetching users:', error);
      }
    });
  }

}
