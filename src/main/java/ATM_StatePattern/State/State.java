package ATM_StatePattern.State;

import ATM_StatePattern.Enums.ATMState;

public interface State {
    int initTransaction();
    int dispenseCash();
    void ejectCard();
    boolean readCardDetailsAndPIN();
    boolean readCashWithdrawDetails();

    ATMState getState();
}
