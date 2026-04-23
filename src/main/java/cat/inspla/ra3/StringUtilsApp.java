package cat.inspla.ra3;

public class StringUtilsApp {

    public String normalizeSpaces(String input) {
        if (input == null) {
            return null;
        }
        return input.trim().replaceAll("\\s+", " ");
    }
}
