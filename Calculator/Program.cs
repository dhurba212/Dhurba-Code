using System;

namespace Calculator
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");

            bool Quit = false;
            while (Quit == false)
            {

                Double Number1 = 0;
                Double Number2 = 0;
                String MathOperator = "";

                Console.Write("Enter q to quit.\n Enter a num.\n Enter one of the operator +,-,*,/.\n Enter another num.\n");

                String Num1 = Console.ReadLine();
                if (Num1 == "q")
                {
                    Quit = true;
                    break;


                }


                Number1=CheckNumber1.GetNumber1(Num1);

                MathOperator = CheckMathOperator.GetMathOperator();

                Number2 = CheckNumber2.GetNumber2();
                



               

                Double result;
                switch (MathOperator)
                {
                    case "+":

                        result = Number1 + Number2;
                        Console.WriteLine($"The addition of Two number is:{result}");
                        break;
                    case "-":
                        result = Number1 - Number2;
                        Console.WriteLine($"The Substraction of Two number is:{result}");
                        break;
                    case "*":
                        result = Number1 * Number2;
                        Console.WriteLine($"The Multiplication of Two number is:{result}");
                        break;
                    default:
                        result = Number1 / Number2;
                        Console.WriteLine($"The Division of Two number is:{result}");
                        break;



                }
               
            }
            Console.WriteLine("Thank You for using a Calculator");






        }
    }
}
