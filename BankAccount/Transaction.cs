using System;
using System.Collections.Generic;
using System.Text;

namespace BankAccount.ConsoleApp
{
    public class Transaction
    {
        public Decimal Amount { get; }
        public DateTime Date;
        public string Note { get; }

        public Transaction(Decimal amount, string note)
        {
            Amount = amount;
            Date =DateTime.Now;
            Note = note;
        }
    }
}
