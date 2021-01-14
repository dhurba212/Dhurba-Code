import {Point} from './practice'; //from textscript point of view practice.ts is a module, 
                                  //so we only write practice for its location
 
let point = new Point(4,3);
point.x=10; // we set the value of x to 10 from 4 using set x property of x.
point.y=5;  // we set value from 3 to 5 using property set for y.
point.draw();


console.log(point.draw);