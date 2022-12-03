

import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;

public class CustomMatcherHamcrestTest {

    @Test
    public void isProperFractionTest(){
        Fraction fr1 = Fraction.of(1, 2);
        assertThat(fr1.toString(), isProperFractionHamcrest.properFraction());
    }


}
