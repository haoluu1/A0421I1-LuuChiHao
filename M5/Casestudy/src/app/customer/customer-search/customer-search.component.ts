import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {CustomerService} from "../../service/customer.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-customer-search',
  templateUrl: './customer-search.component.html',
  styleUrls: ['./customer-search.component.css']
})
export class CustomerSearchComponent implements OnInit {
  searchForm: FormGroup;

  constructor(private customerService: CustomerService,
              private router: Router) {
    this.searchForm = new FormGroup({
      name: new FormControl(''),
      phone: new FormControl('')
    })
  }

  ngOnInit(): void {
  }

  search(){
    this.customerService.getByName(this.searchForm.value.name, this.searchForm.value.phone).subscribe(customers => {
      console.log(customers);
      // this.router.navigateByUrl('customer/list');
    })
  }

  onSubmit(){
    this.search();
  }
}
