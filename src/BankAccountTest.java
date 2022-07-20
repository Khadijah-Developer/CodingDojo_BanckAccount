public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        BankAccount user2 = new BankAccount();
        BankAccount user3 = new BankAccount();
        BankAccount user4 = new BankAccount();
       
        user1.depositMoney("check", 550.0);
        user1.depositMoney("save", 50.0);
        user2.depositMoney("saving", 10.0);
        user2.depositMoney("checking", 12.0);
        user3.depositMoney("Checking", 200.0);
        user4.depositMoney("Saving", 100.0);

        System.out.println("-------Withdraw--------");
        user1.withdrawMoney("checking", 200);
        user2.withdrawMoney("Saving", 200);


        System.out.println("-------Total balance--------");
        user1.totalMoneyBalance();
        user2.totalMoneyBalance();
        user3.totalMoneyBalance();
        user4.totalMoneyBalance();
    }
}
