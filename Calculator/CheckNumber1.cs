using System;
using System.Collections.Generic;
using System.Text;

namespace Calculator
{
    public class CheckNumber1
    {
        public static Double GetNumber1(string Num1)
        {
            Double Number=0;
            bool valid = true;
            while (valid == true)
            {
                if (Double.TryParse(Num1, out Number))
                {
                    
                    valid = false;
                }
                else
                {
                    Console.WriteLine("Not a valid number, Enter a number Please");
                    Num1 = Console.ReadLine();
                }
               

            }
            return Number;
        }

    }
}
