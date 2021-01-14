import { CourseService } from './course.service';
import { CourseComponent } from './course.component';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ServerComponent } from './server/server.component';

@NgModule({
  declarations: [
    AppComponent,
    ServerComponent,
    CourseComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [CourseService],
  bootstrap: [AppComponent]
})
export class AppModule { }
