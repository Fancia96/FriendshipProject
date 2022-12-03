import org.assertj.core.api.AbstractAssert;

public class isProperFractionAssertJ extends AbstractAssert<isProperFractionAssertJ, String> {

    public isProperFractionAssertJ(String actual) {
        super(actual, isProperFractionAssertJ.class);
    }

    public static isProperFractionAssertJ assertThat(String actual) {
        return new isProperFractionAssertJ(actual);
    }

    protected boolean isProperFraction() {
        String s = actual;
        if(s.contains("/")){
            String checkDigits = s.replace("/","");
            return checkDigits.matches("[0-9]+");
        }
        else return false;
    }
}