using System;
using System.Collections.Generic;
using System.Text;

namespace Calculator
{
    public class CheckNumber2
    {
        public static double GetNumber2()
        {
            double Number2 = 0;

            bool valid2 = false;
            while (valid2 == false)
            {
                Console.WriteLine("Enter another Number.");
                String num2 = Console.ReadLine();

                try
                {
                    Number2 = Convert.ToDouble(num2);
                    valid2 = true;
                }
                catch (FormatException)
                {
                    Console.WriteLine("{0} is not a double", num2);
                }
                catch (OverflowException)
                {
                    Console.WriteLine("{0} is outside the range of Double", num2);
                }


                /* if (Double.TryParse(num2, out Number2))

                 {
                     valid2 = true;
                 }
                 else
                 {
                     Console.WriteLine("Invalid Number");
                 }*/
            }
            return Number2;

        }
    }
}
