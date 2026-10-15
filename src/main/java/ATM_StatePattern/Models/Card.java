package ATM_StatePattern.Models;

public class Card {
    private final int cardNumber;
    private final String ownerName;
    private final  String bankName;
    private final int pin;
    private final String cardType;

    Card(int cardNumber,String ownerName,String bankName,int pin,String cardType) {
        this.cardNumber = cardNumber;
        this.ownerName = ownerName;
        this.bankName = bankName;
        this.pin = pin;
        this.cardType = cardType;
    }
    //getter
    public String getOwnerName(){
        return ownerName;
    }
    public String getBankName(){
        return bankName;
    }
    public int getPin(){
        return pin;
    }
    public String getCardType(){
        return cardType;
    }

    @Override
    public String toString(){
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", ownerName='" + ownerName + '\'' +
                ", bankName='" + bankName + '\'' +
                ", pin=" + pin +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}
