package Dec.day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Balance is " + balance);
    }

    public void deposit(double amount){
        if (amount<= 0){
            System.out.println("too little");
            return;
        }
        balance+= amount;
    }

    public void withdraw(double amount){
        balance-= amount;
    }



}

/*
BankAccount Task:
	        Attributes:
	                1. accountHolder, 2. accountNumber, 3. balance
	        Actions:
	        	1. setInfo(): sets the accountHolder and accountNumber attributes
	        	2. toString()
	            3. checkBalance():displays the available balance
	            2. deposit(): increases the balance by the given amount
				3. withdraw(): decreases the balance by the given amount
 */