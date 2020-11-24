using System;

namespace practice_coding
{
    class Program
    {
        static void Main(string[] args)
        {
            decimal total=500.70m;
           //Console.WriteLine(getPow(2,5));
           DateTime now =DateTime.Now;
           Console.WriteLine(now);

            total-=700.5m;
            Console.WriteLine(total);

        }
       /* static int getPow(int a,int b)
        {
            int i=1;
            while(i<b)
            {
                a*=a;
                i++;
            }
            return a;
        }*/
    }
}
