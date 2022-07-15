import { Component, OnInit } from '@angular/core';
import {Customer} from "../../model/customer";
import {CustomerType} from "../../model/customer-type";
import {FormControl, FormGroup} from "@angular/forms";
import {CustomerService} from "../../service/customer.service";
import {CustomerTypeService} from "../../service/customer-type.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {
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

  customerTypes: CustomerType[] = [];

  id: number;

  editForm: FormGroup;

  constructor(private customerService: CustomerService,
              private customerTypeService: CustomerTypeService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = parseInt(paramMap.get('id'));
      this.getCustomer(this.id);
    })
  }

  ngOnInit(): void {
    this.getAllCustomerType();
  }

  getCustomer(id: number){
    this.customerService.findById(id).subscribe(customer => {
      this.editForm = new FormGroup({
        id: new FormControl(customer.id),
        name: new FormControl(customer.name),
        email: new FormControl(customer.email),
        dateOfBirth: new FormControl(customer.dateOfBirth),
        gender: new FormControl(customer.gender),
        idCard: new FormControl(customer.idCard),
        phone: new FormControl(customer.phone),
        customerType: new FormControl(customer.customerType),
        address: new FormControl(customer.address)
      })
    });
  }

  getAllCustomerType(){
    this.customerTypeService.getAll().subscribe(customerTypes => {
      this.customerTypes = customerTypes;
    })
  }

  compareFn(customerType1: CustomerType, customerType2: CustomerType){
    return customerType1 && customerType2 ? customerType1.id === customerType2.id : customerType1 === customerType2;
  }

  editCustomer(id: number){
    const customer = this.editForm.value;
    this.customerService.edit(id, customer).subscribe(() => {
      alert('Sửa thành công');
    });
    this.router.navigateByUrl('/employee/list');
  }

  onSubmit(){
    this.editCustomer(this.id);
  }
}
