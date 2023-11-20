public class ATM {
    int twenty;
    int fifty;
    int oneHundred;

    public ATM(int twenty, int fifty, int oneHundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.oneHundred = oneHundred;
    }

    public void add(int oneHundred, int fifty, int twenty) {
        this.oneHundred += oneHundred;
        this.fifty += fifty;
        this.twenty += twenty;

    }
    public boolean withdraw(int a) {
        int amount100 = a/100;
        int amount50 = (a-amount100*100)/50;
        int amount20 = (a-amount100*100-amount50*50)/20;

        if (a > (oneHundred * 100 + fifty * 50 + twenty * 20) || a<20) {
            System.out.println("Невозможно выдать сумму");
            return false;
        } else if (a != (amount100 * 100 + amount50 * 50 + amount20 * 20)) {
            System.out.println("Банкомат выдает только купюры 100, 50 и 20");
            return false;
        } else  {
            System.out.println("Количество 100: "+amount100+" Количество 50: "+amount50+" Количество 20: "+amount20);
            return true;

        }

    }
}
