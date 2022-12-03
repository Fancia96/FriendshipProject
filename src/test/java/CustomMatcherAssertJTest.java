import org.junit.jupiter.api.Test;

public class CustomMatcherAssertJTest {

    @Test
    public void isProperFractionTest() {
        Fraction val = Fraction.of(1, 2);
        isProperFractionAssertJ.assertThat(val.toString()).isProperFraction();
    }

    @Test
    public void isDoubleFractionTest() {
        Fraction val = Fraction.of(1, 2);
        isDoubleFractionAssertj.assertThat(val.doubleValue()).isDoubleFraction();
    }

}