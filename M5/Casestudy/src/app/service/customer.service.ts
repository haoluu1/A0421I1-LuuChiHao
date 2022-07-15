import { Injectable } from '@angular/core';
import {environment} from "../../environments/environment";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Customer} from "../model/customer";

const API_URL = `${environment.apiUrl}`;
@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<Customer[]>{
    return this.http.get<Customer[]>(API_URL + '/customer');
  }

  findById(id: number): Observable<Customer>{
    return this.http.get<Customer>(`${API_URL}/customer/${id}`)
  }

  add(customer: Customer): Observable<Customer>{
    return this.http.post<Customer>(API_URL + '/customer', customer)
  }

  delete(id: number): Observable<Customer>{
    return this.http.delete<Customer>(`${API_URL}/customer/${id}`)
  }

  edit(id: number, customer: Customer): Observable<Customer>{
    return this.http.put<Customer>(`${API_URL}/customer/${id}`, customer)
  }

  getByName(name: string, phone: number): Observable<Customer>{
    return this.http.get<Customer>(`${API_URL}/customer?name_like=${name}&phone_like=${phone}`)
  }
}
