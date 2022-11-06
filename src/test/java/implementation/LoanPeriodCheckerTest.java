package implementation;

import exceptions.NoAbilityException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanPeriodCheckerTest {
    LoanPeriodChecker loanPeriodChecker;

    @Test
    void shouldThrowExceptionWhenMaxLoanPeriodIsLessThen6() {
        //GIVEN
        int maxLoanPeriod = 5;

        loanPeriodChecker = new LoanPeriodChecker();

        //WHEN
        //THEN
        assertThrows(NoAbilityException.class, () -> {
            loanPeriodChecker.checkLoanPeriod(maxLoanPeriod);
        });
    }
}