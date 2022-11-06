package implementation;

import exceptions.NoAbilityException;

import static data.ConstantData.MIN_LOAN_TERM;

public class LoanPeriodChecker {
    public void checkLoanPeriod(int maxLoanPeriod) throws NoAbilityException {
        if (maxLoanPeriod < MIN_LOAN_TERM) {
            throw new NoAbilityException("Sorry, we have no offer for you, you have no available credit capacity");
        }
    }
}
