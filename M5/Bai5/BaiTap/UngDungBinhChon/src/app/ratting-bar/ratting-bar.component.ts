import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Rate} from "../rate";

@Component({
  selector: 'app-ratting-bar',
  templateUrl: './ratting-bar.component.html',
  styleUrls: ['./ratting-bar.component.css']
})
export class RattingBarComponent implements OnInit {
  value=0;
  @Output()
  getPoint :EventEmitter<number> = new EventEmitter<number>();

  rate: Rate={
    value :0,
    active: true
  };
  constructor() { }

  ngOnInit(): void {
  }

  Point(value: any) {
    this.value=value;
    this.getPoint.emit(this.value);
    for(let i=value;i<=10;i++){
      this.rate.active=false;
    }
  }
}
