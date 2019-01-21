import {Component, OnInit} from '@angular/core';
import { LeaseService } from './lease.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Renting and Dressing System';

  constructor(private leaseService: LeaseService) { }
  ngOnInit() {
  }
}
