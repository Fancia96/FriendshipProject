import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FractionGradleTest {

    @Test
    public void fractionHALFTest(){
        double val = Fraction.of(1, 2).doubleValue();
        Assertions.assertNotEquals(val, equals(0.5));
    }

    @Test
    public void fractionFULLTest(){
        Assertions.assertEquals(Fraction.FULL, Fraction.of(1,1));
    }

    @Test
    public void fractionDoubleValueTest(){
        Fraction val = Fraction.of(1, 3);
        Assertions.assertEquals(val.doubleValue(), Fraction.ONE_THIRD.doubleValue());
    }

    @Test
    public void fractionMultiplyCorrectNumbersTest(){
        Fraction fr1 = Fraction.of(1, 4);
        Assertions.assertEquals(fr1.multiplyFractions(1,4), 0.0625);
    }

    @Test
    public void fractionMultiplyCorrectFractionsTest(){
        Fraction fr1 = Fraction.of(1, 4);
        Fraction fr2 = Fraction.of(1,4);
        Assertions.assertEquals(fr1.multiplyFractions(fr2), 0.0625);
    }

    @Test
    public void fractionMultiplyCorrectMinusNumbersTest(){
        Fraction fr1 = Fraction.of(1, -4);
        Assertions.assertEquals(fr1.multiplyFractions(1,4), -0.0625);
    }

    @Test
    public void fractionMultiplyCorrectMinusFractionsTest(){
        Fraction fr1 = Fraction.of(1, 4);
        Fraction fr2 = Fraction.of(1,-4);
        Assertions.assertEquals(fr1.multiplyFractions(fr2), -0.0625);
    }

    @Test
    public void fractionDivideCorrectNumbersTest(){
        Fraction fr1 = Fraction.of(1, 4);
        Assertions.assertEquals(fr1.divideFractions(1,4), 1.);
    }

    @Test
    public void fractionDivideCorrectFractionsTest(){
        Fraction fr1 = Fraction.of(1, 4);
        Fraction fr2 = Fraction.of(1,4);
        Assertions.assertEquals(fr1.divideFractions(fr2), 1.);
    }

    @Test
    public void fractionDivideCorrectMinusNumbersTest(){
        Fraction fr1 = Fraction.of(1, -4);
        Assertions.assertEquals(fr1.divideFractions(1,4), -1.);
    }

    @Test
    public void fractionDivideCorrectMinusFractionsTest(){
        Fraction fr1 = Fraction.of(1, 4);
        Fraction fr2 = Fraction.of(1,-4);
        Assertions.assertEquals(fr1.divideFractions(fr2), -1.);
    }

    @Test
    public void fractiondenomnatorZeroFractionsTest(){
        try {
            Fraction.of(1,0);

        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Fraction denominator cannot be equal to 0", e.getMessage());
        }
    }

}