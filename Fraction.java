public class Fraction {
    
        private long numerator;
        private long denominator;

        public long getNumerator() {
            return numerator;

        }

        public long getDenomirator() {
            return denominator;

        }


        public Fraction(long a, long b) {
            this.numerator = a;
            this.denominator = b;
            if (b == 0) {
                numerator = Long.signum(a);
            }

            else if (a == 0) {
                denominator = 1;
            }

            else {
                long sign = (Long.signum(a)) * (Long.signum(b));
                numerator = Math.abs(numerator);
                denominator = Math.abs(denominator);
                long g = gcd(numerator, denominator);
                this.numerator = (numerator / g) * sign;
                this.denominator = denominator / g;
            }
        }

        public Fraction(long a) {
            this.numerator = a;
            this.denominator = 1;
        }


    

    public Fraction add(Fraction inFraction) {
        Fraction addFraction;
        
        long commonDenom = this.denominator * inFraction.denominator;
        long num1 = this.numerator * inFraction.denominator;
        long num2 = inFraction.numerator * this.denominator;
        long addition = (num1 + num2);
        addFraction = new Fraction (addition, commonDenom);
        return addFraction;
        
    }

    public Fraction subtract(Fraction inFraction) {
        Fraction subFraction;
        
        long commonDenom = this.denominator * inFraction.denominator;
        long num1 = this.numerator * inFraction.denominator;
        long num2 = inFraction.numerator * this.denominator;
        long subtraction = (num1 - num2);
        subFraction = new Fraction (subtraction, commonDenom);
        return subFraction;

    }

    public Fraction multiply(Fraction inFraction) {
        long top = (this.numerator * inFraction.numerator);
        long bottom = (this.denominator * inFraction.denominator);

        return new Fraction(top, bottom);

    }

    public Fraction divide(Fraction inFraction) {
        long top = this.numerator * inFraction.denominator;
        long bottom = this.denominator * inFraction.numerator;

        return new Fraction(top, bottom);

    }

   public Fraction pow(int n) {
        Fraction base = new Fraction(numerator, denominator);

        if (n == 0) {
            return new Fraction(1);
        }

        else if (n < 0) {
            base = new Fraction(this.denominator, this.numerator);
            n = -n;
        }

        Fraction result = new Fraction(1);

        for (int i = 0; i < n; ++i) {
            result = result.multiply(base);
        }

        return result;

    }

    public Fraction negate() {
        return new Fraction(this.numerator * -1, this.denominator);
        
    }

    @Override
    public String toString() {
        
        if (numerator > 0 && denominator < 0) {
            return "-" + numerator + "/" + denominator;
        }
        
        else if (numerator > 0 && denominator == 0) {
            return "Infinity";
        }
        
        else if (numerator < 0 && denominator == 0) {
            return "-Infinity";
        }
        
        else if (denominator == 1) {
            return "" + numerator;
        }
        
        else if (numerator == 0 && denominator == 0) {
            return "Nan";
        }
        
        else {
            return "" + numerator + "/" + denominator;
        }
        
        

    }
    
    public static long gcd(long a, long b) {
        if (a < 0) {
            a = -1;
        }
        
        while (b != 0) {
            long remainder = a % b;
            a = b;
            b = remainder;
        }
        
        if (a == 0) {
            a = 1;
        }
        
        return a;
    }
}
 
    
    


