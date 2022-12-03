import org.assertj.core.api.AbstractAssert;

public class isDoubleFractionAssertj extends AbstractAssert<isDoubleFractionAssertj, Object> {

    public isDoubleFractionAssertj(Object actual) {
        super(actual, isDoubleFractionAssertj.class);
    }

    public static isDoubleFractionAssertj assertThat(Object actual) {
        return new isDoubleFractionAssertj(actual);
    }

    protected boolean isDoubleFraction() {
        Object obj = actual;

        try{
            double db = (double)obj;
            return true;
        }
        catch (Exception exc){
            return false;
        }
    }
}