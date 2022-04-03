public class CheckingAccount extends Account {
    private int amount = 100;
    private String name = "Cheking Account";

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void pay(int costOfGoods) {
        if (costOfGoods <= amount) {
            System.out.println("You payed for the goods: " + costOfGoods + " $");
            amount = amount-costOfGoods;
            System.out.println("Account balance is " + amount);
        } else {
            System.out.println("Error. Transaction is unavailable");
        }
    }

    @Override
    public void transfer(Account account, int balance) {
        if (balance <= amount) {
            System.out.println("You transfer " + balance + " $ to your account " + account);
            amount+=balance;
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
