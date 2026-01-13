import { Routes } from '@angular/router';
import { UsuariosComponent } from './componentes/usuarios/usuarios.component';

export const routes: Routes = [
    { path: '', redirectTo: 'usuario', pathMatch: 'full' },
    { path: 'usuario', component: UsuariosComponent },
];