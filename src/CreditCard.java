public class CreditCard {
    int accountNumber;
    int amount;

    public CreditCard(int accountNumber, int amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
    public int accrual(int a){
        this.amount +=a;
        return amount;
    }
    public int withdraw(int a){
        this.amount-=a;
        return amount;
    }
    public void inf(){
        System.out.println("Текущая сумма на карте номер "+accountNumber+ " равна: "+ amount);
    }
}
