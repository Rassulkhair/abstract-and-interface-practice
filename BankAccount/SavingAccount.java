public class SavingAccount extends Account {
    private int amount = 800;
    private String name = "Saving Account";

    @Override
    public void transfer(Account account, int balance) {
        if (balance <= amount) {
            System.out.println("You transfer " + balance + "$ to your account " + account);
            System.out.println("Account balance is " + amount);
        } else {
            System.out.println("Error. Transaction is unavailable");
        }
    }

    @Override
    public void addMoney(int pocketMoney) {
        if (pocketMoney <= amount) {
            System.out.println("You take " + pocketMoney + "$ from your pocket and transfer to account");
            amount += pocketMoney;
            System.out.println("Account balance is " + amount);
        } else {
            System.out.println("Error. Transaction is unavailable");
        }
    }
}
