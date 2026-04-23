package cat.inspla.ra3;

public class UserValidator {

    public boolean isValidUsername(String username) {
        return username != null && username.trim().length() >= 3;
    }

    public boolean isAdult(int age) {
        return age >= 18;
    }

    public void validateRequiredText(String text) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Text obligatori");
        }
    }
}
