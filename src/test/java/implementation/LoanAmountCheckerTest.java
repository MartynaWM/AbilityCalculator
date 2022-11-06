package implementation;

import exceptions.NoAbilityException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanAmountCheckerTest {
    LoanAmountChecker loanAmountChecker;

    @Test
    void shouldThrowExceptionWhenMaxLoanAmountIsLessThen5000() {
        //GIVEN
        double maxLoanAmount = 3000;
        loanAmountChecker = new LoanAmountChecker();

        //WHEN
        //THEN
        assertThrows(NoAbilityException.class, () -> {
            loanAmountChecker.checkMaxLoanAmount(maxLoanAmount);
        });
    }
}