import { Injectable } from '@angular/core';
import {Song} from "../model/song";

@Injectable({
  providedIn: 'root'
})
export class SongService {
  playlist: Song[] = [
    {
      id: 'TfDHpsZQYeE',
      name: 'Dưới Những Cơn Mưa'
    },
    {
      id: 'OVDg8CQlBBA',
      name: 'Day Dứt Nỗi Đau'
    }
  ];

  constructor() { }

  findSongById(id: string) {
    return this.playlist.find(item => item.id === id);
  }
}
