import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {CustomerType} from "../model/customer-type";
import {environment} from "../../environments/environment";
import {Observable, Observer} from "rxjs";
import {Customer} from "../model/customer";

const API_URL = `${environment.apiUrl}`;
@Injectable({
  providedIn: 'root'
})
export class CustomerTypeService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<CustomerType[]>{
    return this.http.get<CustomerType[]>(API_URL + '/customerType');
  }
}
