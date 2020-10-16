public class Fraction {
    private int numerator;
    private int denumerator;

    Fraction(int num, int denum)
    {
        numerator = num;
        denumerator = denum;
    }

    @Override
    public String toString() {
        return numerator + "/" + denumerator;
    }
}
