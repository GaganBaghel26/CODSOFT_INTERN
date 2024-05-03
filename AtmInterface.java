import java.util.Scanner;

class Atm 
{
    private double balance;

    public Atm(double initBalance) 
	{
        balance = initBalance;
    }

    public double getBalance() 
	{
        return balance;
    }

    public void deposit(double amount) 
	{
        balance += amount;
    }

    public boolean withdraw(double amount) 
	{
        if (balance >= amount) 
		{
            balance -= amount;
            return true;
        }
        return false;
    }
}

class Bank 
{
    private Atm bankAccount;
    private Scanner s;

    public Bank(Atm account) 
	{
        bankAccount = account;
        s = new Scanner(System.in);
    }

    public void Menu() 
	{
        System.out.println("ATM Menu :");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Amount");
        System.out.println("3. Withdraw Amount");
        System.out.println("4. Exit");
    }

    public void run() 
	{
        while (true) 
		{
            Menu();
            int choice = s.nextInt();
            switch (choice) 
			{
				case 1:
                    System.out.println("Your balance: " + bankAccount.getBalance());
                    break;
                
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = s.nextDouble();
                    bankAccount.deposit(depositAmount);
                    System.out.println("Deposit successful.");
                    break;
					
				case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawall = s.nextDouble();
                    if (bankAccount.withdraw(withdrawall)) 
					{
                        System.out.println("Withdrawal Successfully.");
                    } 
					else 
					{
                        System.out.println("Insufficient balance.");
                    }
                    break;	
                
                case 4:
                    System.out.println("Exiting ATM. Thank you for using!");
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

public class AtmInterface 
{
    public static void main(String[] args) 
	{
        Atm userAccount = new Atm(10000.0);
        Bank atm = new Bank(userAccount);
        atm.run();
    }
}



