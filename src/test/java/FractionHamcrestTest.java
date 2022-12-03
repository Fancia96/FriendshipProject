import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FractionHamcrestTest {

    @Test
    public void fractionHALFTest(){
        double val = Fraction.of(1, 2).doubleValue();
        assertThat(val, equalTo(0.5));
    }

    @Test
    public void fractionFULLTest(){
        assertThat(Fraction.FULL, equalTo(Fraction.of(1,1)));
    }

    @Test
    public void fractionDoubleValueTest(){
        Fraction val = Fraction.of(1, 3);
        assertThat(val.doubleValue(), equalTo(Fraction.ONE_THIRD.doubleValue()));
    }

    @Test
    public void fractionMultiplyCorrectNumbersTest(){
        Fraction fr1 = Fraction.of(1, 4);
        assertThat(fr1.multiplyFractions(1,4), equalTo(0.0625));
    }

    @Test
    public void fractionMultiplyCorrectFractionsTest(){
        Fraction fr1 = Fraction.of(1, 4);
        Fraction fr2 = Fraction.of(1,4);
        assertThat(fr1.multiplyFractions(fr2), equalTo(0.0625));
    }

    @Test
    public void fractionMultiplyCorrectMinusNumbersTest(){
        Fraction fr1 = Fraction.of(1, -4);
        assertThat(fr1.multiplyFractions(1,4), is(-0.0625));
    }

    @Test
    public void fractionMultiplyCorrectMinusFractionsTest(){
        Fraction fr1 = Fraction.of(1, 4);
        Fraction fr2 = Fraction.of(1,-4);
        assertThat(fr1.multiplyFractions(fr2), equalTo(-0.0625));
    }

    @Test
    public void fractionDivideCorrectNumbersTest(){
        Fraction fr1 = Fraction.of(1, 4);
        assertThat(fr1.divideFractions(1,4), equalTo(1.));
    }

    @Test
    public void fractionDivideCorrectFractionsTest(){
        Fraction fr1 = Fraction.of(1, 4);
        Fraction fr2 = Fraction.of(1,4);
        assertThat(fr1.divideFractions(fr2), equalTo(1.));
    }

    @Test
    public void fractionDivideCorrectMinusNumbersTest(){
        Fraction fr1 = Fraction.of(1, -4);
        assertThat(fr1.divideFractions(1,4), equalTo(-1.));
    }

    @Test
    public void fractionDivideCorrectMinusFractionsTest(){
        Fraction fr1 = Fraction.of(1, 4);
        Fraction fr2 = Fraction.of(1,-4);
        assertThat(fr1.divideFractions(fr2), equalTo(-1.));
    }

    @Test
    public void fractiondenomnatorZeroFractionsTest(){
        try {
            Fraction.of(1,0);

        } catch (IllegalArgumentException e) {
            assertThat("Fraction denominator cannot be equal to 0", equalTo(e.getMessage()));
        }
    }

}