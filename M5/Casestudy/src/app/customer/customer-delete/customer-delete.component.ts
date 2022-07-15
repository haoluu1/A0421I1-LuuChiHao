import { Component, OnInit } from '@angular/core';
import {Customer} from "../../model/customer";
import {CustomerType} from "../../model/customer-type";
import {CustomerService} from "../../service/customer.service";
import {ActivatedRoute, ParamMap} from "@angular/router";

@Component({
  selector: 'app-customer-delete',
  templateUrl: './customer-delete.component.html',
  styleUrls: ['./customer-delete.component.css']
})
export class CustomerDeleteComponent implements OnInit {
  id: number;
  customer: Customer = new class implements Customer{
    id: number;
    name: string;
    dateOfBirth: Date;
    gender: string;
    idCard: string;
    phone: number;
    email: string;
    customerType: CustomerType;
    address: string;
  }

  constructor(private customerService: CustomerService,
              private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = parseInt(paramMap.get('id'));
      this.delete(this.id);
    })
  }

  ngOnInit(): void {
  }

  findById(id: number){
    return this.customerService.findById(id).subscribe(customer => {
      this.customer = customer;
    })
  }

  delete(id: number){
    return this.customerService.delete(id).subscribe(i => {
      console.log(i);
    })
  }
}
