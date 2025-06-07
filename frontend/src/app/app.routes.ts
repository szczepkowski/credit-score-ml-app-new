import {RouterModule, Routes} from '@angular/router';
import {ScoringComponent} from "./scoring/scoring.component";
import {NgModule} from "@angular/core";

export const routes: Routes = [
  { path: '', redirectTo: 'form', pathMatch: 'full' },
  { path: 'form', component: ScoringComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
