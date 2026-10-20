public class PasswordChecker {

    public boolean isValidPassword(String password) {
        return password != null && !password.isBlank();
    }

    public int calculateScore(String password) {
        if (password == null) {
            throw new IllegalArgumentException(
                    "Password cannot be null."
            );
        }

        int score = 0;

        if (password.length() >= 12) {
            score++;
        }

        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        if (password.matches(".*[a-z].*")) {
            score++;
        }

        if (password.matches(".*[0-9].*")) {
            score++;
        }

        if (password.matches(".*[^a-zA-Z0-9].*")) {
            score++;
        }

        return score;
    }

    public String getStrength(int score) {
        if (score < 0 || score > 5) {
            throw new IllegalArgumentException(
                    "Score must be between 0 and 5."
            );
        }

        if (score <= 1) {
            return "Weak";
        } else if (score <= 3) {
            return "Medium";
        } else {
            return "Strong";
        }
    }
}