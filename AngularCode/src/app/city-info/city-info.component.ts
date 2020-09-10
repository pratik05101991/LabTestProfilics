import { Component, OnInit } from '@angular/core';
import {SelectItem} from 'primeng/api';

@Component({
  selector: 'app-city-info',
  templateUrl: './city-info.component.html',
  styleUrls: ['./city-info.component.css']
})
export class CityInfoComponent implements OnInit {
  states: any[];
  selectedState:any;
  districts:any[];
  selectedDistricts:any;
  constructor() {

    this.states = [
      {name: 'Maharashtra', code: 'MH'},
      {name: 'Karnataka', code: 'KR'},
      {name: 'Goa', code: 'G'},
      {name: 'Punjab', code: 'PJ'},
      {name: 'Gujarat', code: 'GJ'}
     ];
     this.districts = [
    {name: 'Buldana', code: 'MH'},
    {name: 'Akola', code: 'KR'},
    {name: 'Pune', code: 'G'},
    {name: 'Mumbai', code: 'PJ'},
    {name: 'Auragabad', code: 'GJ'}
   ];
   }
   
  ngOnInit() {

    
  }

  reset(){
    this.selectedState=null;
    this.selectedDistricts=null;

  }

  search(){
    console.log("Districts",this.selectedDistricts);
    console.log("state",this.selectedState);

  }

}


