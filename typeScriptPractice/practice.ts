

export class Point
{
    constructor(private _x?:number,private _y?:number)
    {

    }

    get x()
        {
            return this._x;
        }
    
    set x(value)
        {
            if (value<0)
            {
                throw new Error('value cannot be negative');
            }
            this._x=value;
        }

        get y()
        {
            return this._y;
        }
    
    set y(value)
        {
            if(value<0)
            {
                throw new Error('value cannot be negative');
            }
            this._y=value;
        }
    draw()
    {
        console.log("X is "+this._x+", Y is "+this._y)
    }
}
