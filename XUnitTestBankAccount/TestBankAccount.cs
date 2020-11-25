using System;
using Xunit;
using XUnitTestBankAccount;
using BankAccount.ConsoleApp;

namespace XUnitTestBankAccount
{
    public class TestBankAccount
    {
        [Fact]
        public void TrialTest()
        {
            //checks if it is true
            Assert.True(true);
        }
        [Fact]
        public void TrialTest2()
        {
            //checks if the operation is true
            Assert.True(5 > 3);
        }
        [Fact]
        public void DepositNegativeAmountException()
        {
            OpenAccount dhurbaAccount = new OpenAccount("Dhurba", new Transaction(500.7m, "initial deposit"));

            //Assert.Throws check if the included Exception is thrown by the following Action.
            Assert.Throws<ArgumentOutOfRangeException>(
                () => dhurbaAccount.Deposit(new Transaction(-500.6m, "negative deposit"))
                ); 
        }

        [Fact]
        public void WithdrawMoreThanTotalBalanceException()
        {
            OpenAccount dhurbaAccount = new OpenAccount("Dhurba", new Transaction(500.7m, "initial deposit"));

            //Assert.Throws checks if the included exception is thrown by the call back function(action)
            Assert.Throws<InvalidOperationException>(

                () => dhurbaAccount.Withdrawl(new Transaction(600, "withdrawing more than i have"))
                ); 
        }

        [Fact]
        public void EqualNotEmptyContainsTest()
        {
            OpenAccount dhurbaAccount = new OpenAccount("Dhurba", new Transaction(500.7m, "initial deposit salary"));
            dhurbaAccount.Deposit(new Transaction(1500.5m, "salary"));

            //Equal checks for expected outcome vs actual outcome
            Assert.Equal( 2001.2m,dhurbaAccount.GetTotalBalance());

            //NotEmpty checks if the collection is Empty or Not. Assert.Empty checks if it is empty.
            Assert.NotEmpty(dhurbaAccount.TransactionList);
            foreach(Transaction transaction in dhurbaAccount.TransactionList)
            {
                //Contains check for expected sunstring vs actual string
                Assert.Contains("salary",transaction.Note);
            }
            
        }
    }

    
}
