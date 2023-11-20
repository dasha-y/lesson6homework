public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1: (кредитные карточки)");
        CreditCard cd1 = new CreditCard(1, 50);
        CreditCard cd2 = new CreditCard(2, 100);
        CreditCard cd3 = new CreditCard(3, 90);

        cd1.accrual(30);
        cd2.accrual(20);
        cd3.withdraw(40);

        cd1.inf();
        cd2.inf();
        cd3.inf();

        System.out.println("Задание *: (банкомат)");
        ATM atm = new ATM(2,0, 0);
        atm.add(1,3,1);
        atm.withdraw(190);

    }
}