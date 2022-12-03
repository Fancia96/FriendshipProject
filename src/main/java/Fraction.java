import com.google.common.annotations.VisibleForTesting;

import java.io.Serializable;

public final class Fraction implements Serializable {
    public static Fraction of(final int nominator, final int denominator) {
        if(denominator == 0){
            if(nominator == 0)
                return INDETERMINATE;
            throw new IllegalArgumentException("Fraction denominator cannot be equal to 0");
        }
        if(denominator == 1){
            switch(nominator){
                case 1:
                    return FULL;
                case 2:
                    return HALF;
                case 3:
                    return ONE_THIRD;
            }
        }
        return new Fraction(nominator,denominator);
    }
    public int getNominator(){
        return nominator;
    }
    public int getDenominator(){
        return denominator;
    }
    public double doubleValue(){
        return (double) nominator / (double) denominator;
    }

    @Override
    public boolean equals(final Object rightSide) {
        if (!(rightSide instanceof Fraction)) return false;
        final Fraction that = (Fraction) rightSide;
        return (this == that) || (nominator == that.nominator && denominator == that.denominator);
    }

    @Override
    public int hashCode(){
        return nominator + denominator;
    }
    @Override
    public String toString(){
        return new StringBuilder()
                .append(nominator)
                .append('/')
                .append(denominator)
                .toString();
    }


    public double multiplyFractions(Fraction fraction){
        double multiplied = this.doubleValue() * fraction.doubleValue();

        return multiplied;
    }

    public double multiplyFractions(final int nominator, final int denominator){
        return multiplyFractions(Fraction.of(nominator, denominator));
    }

    public double divideFractions(Fraction fraction){
        double divided = this.doubleValue() / fraction.doubleValue();

        return divided;
    }

    public double divideFractions(final int nominator, final int denominator){
        return divideFractions(Fraction.of(nominator, denominator));
    }
    private Fraction(final int nominator, final int denominator){
        this.denominator = denominator;
        this.nominator = nominator;
    }
    public static final Fraction INDETERMINATE = new Fraction(0,0);
    @VisibleForTesting static final Fraction FULL = new Fraction(1,1);
    @VisibleForTesting static final Fraction HALF = new Fraction(1,2);
    @VisibleForTesting static final Fraction ONE_THIRD = new Fraction(1,3);
    private final int nominator;
    private final int denominator;

    public static void main(String[] args) {
        Fraction fr1_1 = Fraction.ONE_THIRD;
        Fraction fr2 = Fraction.of(1,5);

        System.out.println(fr1_1.getNominator());
        System.out.println(fr1_1.getDenominator());


        System.out.println(fr2);
        System.out.println(fr2.doubleValue());

        System.out.println(fr2.equals(Fraction.of(1,5)));

        System.out.println(fr2.hashCode());

        System.out.println(fr2.multiplyFractions(new Fraction(-1,4)));
        //System.out.println(fr2.multiplyFractions(Fraction.of(-1,0)));

        System.out.println(fr2.divideFractions(new Fraction(-1,4)));
        System.out.println(fr2.divideFractions(Fraction.of(-1,4)));

    }
}

