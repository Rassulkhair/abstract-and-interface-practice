public class Test {
    public static void main(String[] args) {
        Account credit=new CreditAccount();
        Account saveAccount=new SavingAccount();
        Account checkAccount=new CheckingAccount();

        System.out.println("Test credit account: ");
        credit.pay(-39);
        System.out.println();
        credit.addMoney(50);
        System.out.println();

        System.out.println("Test save account");
        saveAccount.transfer(new CheckingAccount(), 200);
        System.out.println();
        saveAccount.addMoney(56);
        System.out.println();

        System.out.println("Test check account ");
        checkAccount.pay(23);
        System.out.println();
        checkAccount.transfer(new SavingAccount(), 45);
        System.out.println();
        checkAccount.addMoney(26);
    }
}
