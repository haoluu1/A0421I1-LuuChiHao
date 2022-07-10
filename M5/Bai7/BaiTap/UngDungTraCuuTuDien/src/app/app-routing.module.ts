import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {WordListComponent} from "./word-list/word-list.component";
import {WordDetailComponent} from "./word-detail/word-detail.component";


const routes: Routes = [
  {path: '', component: WordListComponent},
  {path: 'detail/:word', component: WordDetailComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
