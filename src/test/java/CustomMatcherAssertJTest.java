import org.junit.jupiter.api.Test;

public class CustomMatcherAssertJTest {

    @Test
    public void fractionHALFTest() {
        Fraction val = Fraction.of(1, 2);
        isProperFractionAssertJ.assertThat(val.toString()).isProperFraction();
    }
}