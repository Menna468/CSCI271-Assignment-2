/*************************************************************************
* Project 2 for CSCI 271-001 Spring 2026
*
* Author: Menna Ibrahim
* OS: Mac
* Compiler: javac 25.0.1
* Date: Feb 5, 2026
*
* Purpose
* Doing basic arithmetic calculations on fractions but keeping the fractions as they are.
*
*************************************************************************/



/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* Menna Ibrahim
********************************************************************/

public class CSCI271_Assignment2_MennaIbrahim{
    public static void main(String[] args) {
        /*---------------------------Test Case 1---------------------------*/
        //uses add,multiply, and divide
        Fraction a = new Fraction(16);
        Fraction b = new Fraction(3,5).add(new Fraction(7));
        Fraction c = new Fraction(6,7);
        Fraction results = c.multiply(a.divide(b));
        System.out.println(results);


        /*---------------------------Test Cases 3---------------------------*/
        //use negate and divide
        Fraction a1 = new Fraction(8, -6);
        System.out.println(a1);
        Fraction a2 = new Fraction(23, 0);
        System.out.println(a2);
        Fraction a3 = new Fraction(-6, 0);
        System.out.println(a3);
        Fraction a4 = new Fraction(7, 1);
        System.out.println(a4);
        Fraction a5= new Fraction(0, 0);
        System.out.println(a5);
        Fraction a6 = a5.negate();
        System.out.println(a6);

        /*---------------------------Test Case 1---------------------------*/
        //uses multiply and negate
        Fraction d = new Fraction(16);
        Fraction e = new Fraction(2);
        Fraction results2 = d.multiply(e).negate();
        Fraction results2a = d.divide(e).negate();
        System.out.println(results2);
        System.out.println(results2a);

        /*---------------------------Test Case 4---------------------------*/
        //uses subtract
        Fraction f = new Fraction(2,3).subtract(new Fraction(4,5));
        System.out.println(f);

        /*---------------------------Test Case 5---------------------------*/
        //uses divide and negate
        Fraction g = new Fraction(2,3).divide(new Fraction(0)).negate();
        System.out.println(g);

        Fraction h = g.negate();
        System.out.println(h);


        /*---------------------------Test Case 6---------------------------*/
        //uses pow
        Fraction i = new Fraction(2).pow(3);
        System.out.println(i);


        /*---------------------------Test Case 7---------------------------*/
        //uses add
        Fraction j = new Fraction(6,15).add(new Fraction(9,15));
        System.out.println(j);

        
        /*---------------------------Test Case 8---------------------------*/
        //uses pow
        Fraction k = new Fraction(1,2).pow(-2);
        System.out.println(k);

        /*---------------------------Test Case 8---------------------------*/
        //uses pow
        Fraction l = new Fraction(50).pow(0);
        System.out.println(l);
    }
}
