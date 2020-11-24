using System;
using System.Collections.Generic;
using System.Text;

namespace BankAccount.ConsoleApp
{
    public class OpenAccount
    {
        //List of Initial Deposit which is done during AccountOpening, and all the withdrawl and deposits
        private List<Transaction> TransactionList = new List<Transaction>();
        //Generate account number, Increase by 1 number for every new customer. Static will keep the change
        //if it wasnt static, everytime i would open a new bank account it would go back to same string "123456".
        private static string accountNumberGenerator = "123456";
        //total amount, which we calculate directly with each deposit and withdrawl.
        private Decimal TotalBalance;
        
        private string AccountNumber { get; }
        private string Name { get; }
        private Transaction InitialDeposit { get; }

        public OpenAccount(string name,Transaction initialDeposit)
        {
            //got the account number directly from accountNumberGenerator
            //so dont need to initialize it while creating new account, its directly added from accountNumberGenerator
            AccountNumber = accountNumberGenerator;
            //Converting String accountNumberGenerator to Integer to add 1, so the next new account will have
            //different account number
            int accountNumberGeneratorInt = Convert.ToInt32(AccountNumber);
                accountNumberGeneratorInt++;
            //converting back to string because accountNumber is set to be a string not integer
            accountNumberGenerator = accountNumberGeneratorInt.ToString();
            //Initializing name and initial deposit. Initial Deposit is a Transaction, so we need to create
            //a transaction before initializing a new account.
            Name = name;
            InitialDeposit = initialDeposit;
            //the initial deposit is added to the list of transaction directly during initialization
            TransactionList.Add(InitialDeposit);
            //total Balance of Customer is also updated.
            TotalBalance += InitialDeposit.Amount;
           
                
        }

        public void Deposit(Transaction deposit)
        {
            //each transaction is added to the list of transaction
            TransactionList.Add(deposit);
            //Display Previous Balance before adding the deposited amount to the total balance
            //so customer can see the balance amount before and after
            Console.WriteLine($"Previous Balance: {TotalBalance}");
            TotalBalance += deposit.Amount;
            //Displaying all the data after a deposit is made
            Console.WriteLine($"Account Number:{AccountNumber}\n Deposited Amount: {deposit.Amount}\nTotal Balance: {TotalBalance:c} \n Date:{deposit.Date}\n Note: {deposit.Note}\n");
        }
        public void Withdrawl(Transaction withdrawl)
        {
            //Making sure the withdrawl amount is less than the total balance with if-else statement
            if (withdrawl.Amount < TotalBalance)
            {
                TransactionList.Add(withdrawl);
                Console.WriteLine($"Previous Balance:{TotalBalance}");
                TotalBalance -= withdrawl.Amount;
                Console.WriteLine($"Account Number:{AccountNumber}\nWithdrawn Amount:{withdrawl.Amount}\nTotal Balance: {TotalBalance:c}\n Date:{withdrawl.Date}\n Note:{withdrawl.Note}\n");
                    
            }
            else
            {
                Console.WriteLine($"Your Total balance is {TotalBalance}, So u cannot withdraw {withdrawl.Amount}");
            }
            
        }
        //Since the method is private, it cannot be accessed from outside this class. 
        //So creating a method here if someone wants to see Total Balance from Main Method.
        public Decimal GetTotalBalance()
        {
            return TotalBalance;
        }

    }
    

}
