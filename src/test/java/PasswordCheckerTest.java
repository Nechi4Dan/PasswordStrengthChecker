import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PasswordCheckerTest {

    // Tests for calculateScore()

    @Test
    void emptyPasswordScoresZero() {
        PasswordChecker checker = new PasswordChecker();

        assertEquals(0, checker.calculateScore(""));
    }

    @Test
    void shortLowercasePasswordScoresOne() {
        PasswordChecker checker = new PasswordChecker();

        assertEquals(1, checker.calculateScore("abc"));
    }

    @Test
    void passwordWithOnlyLowercaseScoresTwo() {
        PasswordChecker checker = new PasswordChecker();

        assertEquals(2, checker.calculateScore("abcdefghijkl"));
    }

    @Test
    void passwordWithoutUppercaseScoresFour() {
        PasswordChecker checker = new PasswordChecker();

        assertEquals(4, checker.calculateScore("abcdef12345!"));
    }

    @Test
    void passwordWithoutDigitsScoresFour() {
        PasswordChecker checker = new PasswordChecker();

        assertEquals(4, checker.calculateScore("Abcdefghijk!"));
    }

    @Test
    void passwordWithAllCriteriaScoresFive() {
        PasswordChecker checker = new PasswordChecker();

        assertEquals(5, checker.calculateScore("Abcdef12345!"));
    }

    // Tests for getStrength()

    @Test
    void scoreZeroIsWeak() {
        PasswordChecker checker = new PasswordChecker();

        assertEquals("Weak", checker.getStrength(0));
    }

    @Test
    void scoreOneIsWeak() {
        PasswordChecker checker = new PasswordChecker();

        assertEquals("Weak", checker.getStrength(1));
    }

    @Test
    void scoreTwoIsMedium() {
        PasswordChecker checker = new PasswordChecker();

        assertEquals("Medium", checker.getStrength(2));
    }

    @Test
    void scoreThreeIsMedium() {
        PasswordChecker checker = new PasswordChecker();

        assertEquals("Medium", checker.getStrength(3));
    }

    @Test
    void scoreFourIsStrong() {
        PasswordChecker checker = new PasswordChecker();

        assertEquals("Strong", checker.getStrength(4));
    }

    @Test
    void scoreFiveIsStrong() {
        PasswordChecker checker = new PasswordChecker();

        assertEquals("Strong", checker.getStrength(5));
    }

    // Tests for invalid input

    @Test
    void nullPasswordThrowsIllegalArgumentException() {
        PasswordChecker checker = new PasswordChecker();

        assertThrows(
                IllegalArgumentException.class,
                () -> checker.calculateScore(null)
        );
    }

    @Test
    void negativeScoreThrowsException() {
        PasswordChecker checker = new PasswordChecker();

        assertThrows(
                IllegalArgumentException.class,
                () -> checker.getStrength(-1)
        );
    }

    @Test
    void scoreAboveFiveThrowsException() {
        PasswordChecker checker = new PasswordChecker();

        assertThrows(
                IllegalArgumentException.class,
                () -> checker.getStrength(6)
        );
    }

    @Test
    void blankPasswordIsInvalid() {
        PasswordChecker checker = new PasswordChecker();

        assertFalse(checker.isValidPassword("   "));
    }
}