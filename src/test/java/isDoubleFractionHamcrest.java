import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class isDoubleFractionHamcrest extends TypeSafeMatcher<Object> {
    @Override
    protected boolean matchesSafely(Object s) {
        Object obj = s;

        try{
            double db = (double)obj;
            return true;
        }
        catch (Exception exc){
            return false;
        }
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("is double fraction");
    }

    public static Matcher<Object> isDouble() {
        return new isDoubleFractionHamcrest();
    }


}

