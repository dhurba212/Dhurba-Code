﻿using BankAccount.ConsoleApp;
using System;

namespace BankAccount.ConsoleApp
{
    public class Program
    {
        static void Main()
        {
            //initial deposit while opening a bank account. Since opening a bank account needs initial 
            //transaction, i wrote this before opening a bank account
            // so i can use this transaction to open a bank account.
            //Transaction takes 2 parameters amount-decimal and note-string. Date is automatically added as DateTime.Now
            Transaction initialTransaction = new Transaction(500.7m, "initial deposit");
            //opening a bank account which needs two parameter, name-string and initialTransaction-Transaction
            OpenAccount dhurbaAccount = new OpenAccount("Dhurba", initialTransaction);
            //Once the account is created, making a deposit which takes 1 parameter-transaction
            try
            {
                dhurbaAccount.Deposit(new Transaction(500.50m, "salary"));
            }
            catch(ArgumentOutOfRangeException e)
            {
               Console.WriteLine( e.Message);
            }
            Console.WriteLine($"\n");
            //Making a withdrawl which takes one parameter-Transaction
            try
            {
                dhurbaAccount.Withdrawl(new Transaction(-5000.50m, "Rent"));
            }
            catch(ArgumentOutOfRangeException e)
            {
                Console.WriteLine(e.Message);
                

            }
            catch(InvalidOperationException e)
            {
                Console.WriteLine(e.Message);
            }
            


            //Creating another account for Sangita and making deposit as well.
            Transaction initialDepositSangita = new Transaction(500.5m, "initial Deposit");
            OpenAccount sangitaAccount=new OpenAccount("sangita",initialDepositSangita);

            try
            {
                sangitaAccount.Deposit(new Transaction(500.1m, "salary"));
            }
            catch(ArgumentOutOfRangeException e)
            {
                Console.WriteLine(e.Message);
            }

            Console.WriteLine(sangitaAccount.GetTotalBalance());



        }
    }
}
