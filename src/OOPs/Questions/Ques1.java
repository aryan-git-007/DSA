package OOPs.Questions;

public class Ques1 {
//    Problem:
//    Create a BankAccount class with:
//
//    A private balance field (starting at 0)
//    A deposit(amount) method that adds money (reject if amount ≤ 0)
//    A withdraw(amount) method that deducts money (reject if amount > balance)
//    A getBalance() method to check balance
      private int balance;

      public Ques1(int balance){
          this.balance=balance;
      }
      public int deposit(int amount){
        if(amount>=1)
            this.balance+=amount;
        return balance;
      }
      public int withdraw(int amount){
          if(amount<=balance){
              this.balance-=amount;
          }
    return balance;
      }

      public int GetBalance(){
          return this.balance;
      }
}
