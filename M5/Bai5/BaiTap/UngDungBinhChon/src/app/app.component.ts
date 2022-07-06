import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'UngDungBinhChon';
  point=0;
  showPoint(event: number) {
    this.point=event;
  }
}
