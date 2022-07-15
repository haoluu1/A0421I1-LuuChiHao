import {CustomerType} from "./customer-type";

export interface Customer {
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
