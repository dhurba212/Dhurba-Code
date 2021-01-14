import { CourseService } from './course.service';
import {Component} from '@angular/core';

@Component({
    selector:'course',
    template:`
    <h2>{{heading}}</h2>
    <ul>
        <li *ngFor='let course of courses'>
            {{course}}
        </li>
    </ul>
    `

})
    

export class CourseComponent
{
    heading ="List of Courses";
    courses;

    constructor(service:CourseService)
    {
       // let service= new CourseService();
        this.courses=service.getCourse();
    }

}