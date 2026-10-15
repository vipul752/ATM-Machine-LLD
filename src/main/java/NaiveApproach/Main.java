package NaiveApproach;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM("ATM-001");
        atm.startTransaction();
        atm.readCard("Visa", 1234567890123456L, 1234);
        atm.enterAmount(500.0);
        atm.cancelTransaction();
        //atm.dispenseCash(500.0);
        //atm.ejectCard();
    }
}
