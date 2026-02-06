public class Fraction {
    
        private long numerator;   //declaring a private numerator variable
        private long denominator; //declaring a private denonminator variable

        /*****************************<getNumerator>****************************
        * Description: Getter for numerator
        *
        * Parameters: none
        *
        * Pre: cannot be a string
        *
        * Post: no changes
        *
        * Returns: the value of the numerator as a long
        *
        * Called by: none
        * Calls: none
        ************************************************************************/
        public long getNumerator() {
            return numerator;

        }
        /*****************************<getDenominator>****************************
        * Description: Getter for denominator
        *
        * Parameters: none
        *
        * Pre: cannot be a string
        *
        * Post: no changes
        *
        * Returns: the value of the denominator as a long
        *
        * Called by: none
        * Calls: none
        ************************************************************************/
        public long getDenomirator() {
            return denominator;

        }

        /*****************************<Fraction>****************************
        * Description: fraction constructor that takes two parameters. To set the fields in my class, so nothing else can modify numerator and denominator
        *
        * Parameters: a(private numerator), b(private denominator)
        *
        * Pre: must be a number
        *
        * Post: goes through the if and else statments to determine the sign and the gcd of the fraction
        *
        * Returns: the value of the denominator as a long
        *
        * Called by: test cases
        * Calls: gcd
        ************************************************************************/
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


        /*****************************<Fraction>****************************
        * Description: fraction constructor that takes one parameter, and sets the denom to 1. To set the field in my class, so nothing else can modify numerator
        *
        * Parameters: a(private numerator)
        *
        * Pre: must be a number
        *
        * Post: sets the numerator to a and denominator to 1
        *
        * Returns: the value of the denominator as a long
        *
        * Called by: test cases
        * Calls: none
        ************************************************************************/
        public Fraction(long a) {
            this.numerator = a;
            this.denominator = 1;
        }


    
    /*****************************<add>****************************
        * Description: adds fractions
        *
        * Parameters: inFraction
        *
        * Pre: doesn't add
        *
        * Post: gets a commong denominator and then add fractions 
        *
        * Returns: the added fractions
        *
        * Called by: test cases only
        * Calls: Fraction
        ************************************************************************/
    public Fraction add(Fraction inFraction) {
        Fraction addFraction;
        
        long commonDenom = this.denominator * inFraction.denominator; //gets common denominator
        long num1 = this.numerator * inFraction.denominator; //multiplies the first numerator by the second denominator 
        long num2 = inFraction.numerator * this.denominator; //multiplies the second numerator by the first denominator
        long addition = (num1 + num2); //adds both numerators 
        addFraction = new Fraction (addition, commonDenom); //puts them together
        return addFraction; //returns the added fraction
        
    }

        /*****************************<subtract>****************************
        * Description: subtracts fractions
        *
        * Parameters: inFraction
        *
        * Pre: doesn't subtract
        *
        * Post: gets a commong denominator and then subtract fractions 
        *
        * Returns: the subtracted fractions
        *
        * Called by: test cases only
        * Calls: Fraction
        ************************************************************************/
    public Fraction subtract(Fraction inFraction) {
        Fraction subFraction;
        
        long commonDenom = this.denominator * inFraction.denominator; //gets common denominator
        long num1 = this.numerator * inFraction.denominator; //multiplies the first numerator by the second denominator
        long num2 = inFraction.numerator * this.denominator; //multiplies the second numerator by the first denominator
        long subtraction = (num1 - num2); //subtracts both numerators
        subFraction = new Fraction (subtraction, commonDenom); //puts them together
        return subFraction; //returns the subtracted fraction

    }

    /*****************************<multiply>****************************
    * Description: multiplies fractions
    *
    * Parameters: inFraction
    *
    * Pre: doesn't multiply
    *
    * Post: multiply fractions
    *
    * Returns: a new fraction after being multiplied 
    *
    * Called by: pow and test cases
    * Calls: Fraction
    ************************************************************************/
    public Fraction multiply(Fraction inFraction) {
        long top = (this.numerator * inFraction.numerator); //multiplies both numerators 
        long bottom = (this.denominator * inFraction.denominator); //multiplies both denominators

        return new Fraction(top, bottom); //returns both num and denom after the multiplication process

    }

    /*****************************<divide>****************************
    * Description: divides fractions. It multiplies the first fraction by the reciprocal of the second fraction
    *
    * Parameters: inFraction
    *
    * Pre: doesn't divide
    *
    * Post: divide fractions
    *
    * Returns: a new fraction after being divided
    *
    * Called by: test cases only
    * Calls: Fraction
    ************************************************************************/
    public Fraction divide(Fraction inFraction) {
        long top = this.numerator * inFraction.denominator; //multiplies the first num by the second denom
        long bottom = this.denominator * inFraction.numerator; //multiplies the first denom by the second num

        return new Fraction(top, bottom); //returns both num and denom after the division process

    }

    /*****************************<pow>****************************
    * Description: returns a new fraction of this fraction raised to the n power
    *
    * Parameters: n
    *
    * Pre: nothing
    *
    * Post: gives a new fraction that is raised to the n power
    *
    * Returns: a new fraction of this fraction raised to the n power
    *
    * Called by: test cases only
    * Calls: multiply, Fraction
    ************************************************************************/
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


    /*****************************<negate>****************************
    * Description: negates the fraction
    *
    * Parameters: none
    *
    * Pre: nothing
    *
    * Post: negate fractions
    *
    * Returns: negates a fraction then returns the new fraction
    *
    * Called by: test cases only
    * Calls: Fraction
    ************************************************************************/
    public Fraction negate() {
        return new Fraction(this.numerator * -1, this.denominator); //returns the num multiplied by -1
        
    }


    /*****************************<toString>****************************
    * Description: converts everything to a string
    *
    * Parameters: none
    *
    * Pre: the fractions are numbers 
    *
    * Post: the fractions are read as strings
    *
    * Returns: a string value of the fractions
    *
    * Called by: none
    * Calls: none
    ************************************************************************/
    @Override
    public String toString() {
        
        // if denom was a negative number and num was positive, it returns the num as negative and denom as positive
        if (numerator > 0 && denominator < 0) {
            return "-" + numerator + "/" + denominator;  
        }
        
        //if dividing a positive number over 0 then it returns "Infinity"
        else if (numerator > 0 && denominator == 0) {
            return "Infinity";
        }
        
        //if dividning a negative number over 0 then it returns "-Infinity"
        else if (numerator < 0 && denominator == 0) {
            return "-Infinity";
        }
        
        //if dividing by 1 then it returns the num
        else if (denominator == 1) {
            return "" + numerator;
        }
        
        //if dividing 0 over 0 then it returns "NaN"
        else if (numerator == 0 && denominator == 0) {
            return "NaN";
        }
        
        //otherwise it returns the fraction as num over denom
        else {
            return "" + numerator + "/" + denominator;
        }
        
        

    }
    
    /*****************************<gcd>****************************
    * Description: to get the greatest common divisor, to reduce the fraction into a normalized form. (Taken from the instructions sheet)
    *
    * Parameters: a, b
    *
    * Pre: nothing
    *
    * Post: reduces the fraction a normalized form
    *
    * Returns: the reduced fraction
    *
    * Called by: Fraction
    * Calls: none
    ************************************************************************/
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
 
    
    


