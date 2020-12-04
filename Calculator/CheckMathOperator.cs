using System;
using System.Collections.Generic;
using System.Text;

namespace Calculator
{
    public class CheckMathOperator
    {
        public static string GetMathOperator()
        {
            string MathOperator = "";
            bool valid1 = false;
            while (valid1 == false)
            {
                Console.WriteLine("Select an Operator: +, -, *, /");
                String Operator = Console.ReadLine();
                if (Operator == "+" || Operator == "-" || Operator == "*" || Operator == "/")
                {
                    MathOperator = Operator;
                    valid1 = true;
                }
                else
                {
                    Console.WriteLine("Invalid Operator, Please choose between  +, -, *, /");
                }
            }

            return MathOperator;
        }
    }
}
