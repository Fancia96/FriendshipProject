import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class isProperFractionHamcrest extends TypeSafeMatcher<String> {
    @Override
    protected boolean matchesSafely(String s) {

        if(s.contains("/")){
            String checkDigits = s.replace("/","");
            return checkDigits.matches("[0-9]+");
        }
        else return false;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("is fraction");
    }

    public static Matcher<String> properFraction() {
        return new isProperFractionHamcrest();
    }


}
