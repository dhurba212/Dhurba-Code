import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'AngularProjectBeginner';
  date= new Date();
  name='Dhurba Ghimire';

   constructor()
  {
    console.log("c called");
  }

  doSomething(val:string):string
  {
   return val;
  }

}

