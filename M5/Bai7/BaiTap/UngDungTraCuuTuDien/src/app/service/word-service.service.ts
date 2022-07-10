import { Injectable } from '@angular/core';
import {Word} from "../model/word";

@Injectable({
  providedIn: 'root'
})
export class WordServiceService {
  words: Word[]=[
    {
      english: 'hello',
      vietnamese: 'Xin Chào'
    },
    {
      english: 'goodbye',
      vietnamese: 'Tạm Biệt'
    }
  ];

  constructor() { }

  getWord(word: string) {
    return this.words.find(w => w.english == word);
  }

  getAll() {
    return this.words;
  }
}
