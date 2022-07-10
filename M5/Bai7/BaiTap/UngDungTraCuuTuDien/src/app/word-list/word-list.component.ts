import { Component, OnInit } from '@angular/core';
import {Word} from "../model/word";
import {WordServiceService} from "../service/word-service.service";

@Component({
  selector: 'app-word-list',
  templateUrl: './word-list.component.html',
  styleUrls: ['./word-list.component.css']
})
export class WordListComponent implements OnInit {
  words: Word[] = [];

  constructor(private wordServiceService: WordServiceService) { }

  ngOnInit(): void {
    this.getAll();
  }
  getAll(){
    this.words = this.wordServiceService.getAll();
  }
}
