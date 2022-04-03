public class CreditAccount extends Account {
    private int amount = 0;
    private String name = "Credit Account";

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void pay(int costOfGoods) {
        if (costOfGoods <= amount) {
            System.out.println("You payed for the goods: " + costOfGoods + "$");
            amount = -costOfGoods;
            System.out.println("Account balance is " + amount);
        }
    }

    @Override
    public void addMoney(int pocketMoney) {
        System.out.println("You paid " + pocketMoney + " for your credit");
        amount += pocketMoney;
        System.out.println("Account balance is " + amount);
    }
}
