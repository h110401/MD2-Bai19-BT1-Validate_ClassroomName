import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassroomName {

    private static final String REGEX = "^[CAP]\\d{4}[GHIKLM]$";

    public static void main(String[] args) {

        String[] name = {"C0318G", "M0318G", "P0323A"};

        Pattern pattern = Pattern.compile(REGEX);

        for (String n : name) {
            System.out.println("name: " + n + ", " + (pattern.matcher(n).matches() ? "Match" : "NotMatch"));
        }


    }
}
