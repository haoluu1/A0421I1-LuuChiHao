import { Component, OnInit } from '@angular/core';
import {Word} from "../model/word";
import {WordServiceService} from "../service/word-service.service";
import {ActivatedRoute, convertToParamMap, ParamMap} from "@angular/router";

@Component({
  selector: 'app-word-detail',
  templateUrl: './word-detail.component.html',
  styleUrls: ['./word-detail.component.css']
})
export class WordDetailComponent implements OnInit {
  word: Word;

  constructor(private wordServiceService: WordServiceService,
              private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap)=> {
      const english = paramMap.get('word');
      this.word = this.wordServiceService.getWord(english);
    })
  }

  ngOnInit(): void {
  }

}
