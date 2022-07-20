import java.util.Random;
class BankAccount{
    // Member Variables
    private double checkingBalance = 0;
    private double savingsBalance = 0;
    private static int numAccountsCreated = 0;
    private static double totalMoney = 0.0;
    private static String accountNumber = "";
    


    //Constructors with parameters
    public BankAccount(){
        checkingBalance = 0;
        savingsBalance = 0;
        //increments tha account count 
        numAccountsCreated++;
        accountNumber = newAccountNumber();
        System.out.println("Account Number is: " + accountNumber);
        System.out.println("Total accounts: " + numAccountsCreated);
    }
    //getter checkingBalance
    public double getCheckingBalance(){
        return checkingBalance;
    }

    //getter method savingsBalance
    public double getSavingsBalance(){
        return savingsBalance;
    }

    // setter checkingBalance
    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }
    //setter savingsBalance
    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    //All Methods 
    // Random number for account
    private String newAccountNumber(){
        //list all number to store them later randomly
        String numbersChars = "0123456789";
        //variable to store random number
        String randomNum = "";

        //random instense
        Random random = new Random();
        // for loop to gnerate and store random value
        for(int i = 1; i<= 10; i++){
            char number = numbersChars.charAt(random.nextInt(10));
            randomNum += number;
        }
        accountNumber = randomNum;
        return randomNum;
    }
    // method deposit for either checking or savings balance
    public void depositMoney(String kind ,double depositAmount){
        // add deposit amount to Saving Balance
        if (kind == "save" || kind == "Save" || kind == "saving" || kind == "Saving"){
            // update the value of savingBalance via calling set method and sum old value via get method and new value 
            setSavingsBalance(getSavingsBalance() + depositAmount);
            //update total money
            totalMoney += depositAmount;
        }
        // add deposit amount to Checking Balance
        if (kind == "check" || kind == "Check" || kind == "checking" || kind == "Checking"){
            // update the value of checkingBalance via calling set method and sum old value via get method and new value 
            setCheckingBalance(getCheckingBalance() + depositAmount);
            //update total money
            totalMoney += depositAmount;
        }
        // increment total account money
        totalMoney++;
    }

    // withdraw method
    public void withdrawMoney(String kind,double withdrawAmount){
    	
        if (kind == "save" || kind == "Save" || kind == "saving" || kind == "Saving"){
                //compare saving balance amount with withdraw
                if (getSavingsBalance() < withdrawAmount){
                    System.out.println("You can't complete this process, insufficient funds");
                }else{
                    //decrease total via subtracts withdraw amount 
                    totalMoney -= withdrawAmount;
                    // totalMoney =  totalMoney - withdrawAmount;
                    System.out.println("Successful process withdraw a" + withdrawAmount);
                }
        }

        if (kind == "check" || kind == "Check" || kind == "checking" || kind == "Checking"){
            if (getCheckingBalance() < withdrawAmount){
                System.out.println("You can't complete this process, insufficient funds");
            }else{
                 //decrease total via subtracts withdraw amount 
                // totalMoney =  totalMoney - withdrawAmount;
                totalMoney -= withdrawAmount;
                System.out.println("Successful process withdraw a " + withdrawAmount );
            }
        }
    }

    //print total money balance
    public double totalMoneyBalance(){
       double totalBalance = checkingBalance + savingsBalance;
       System.out.println("Your total balance: "+ totalBalance);
        return totalBalance;
    }
}