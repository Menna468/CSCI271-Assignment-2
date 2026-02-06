/*************************************************************************
* Project 2 for CSCI 271-001 Spring 2026
*
* Author: Menna Ibrahim
* OS: Mac
* Compiler: javac 25.0.1
* Date: Feb 5, 2026
*
* Purpose
* This program reads a list of scores from an input file, counts how many
* scores there are in the list, and computes their sum and average.
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

public class CSCI271_Assignment2_MennaIbrahim {
    public static void main(String[] args) {
        /*---------------------------Test Case 1---------------------------*/
        //uses add,multiply, and divide
        Fraction a = new Fraction(16);
        Fraction b = new Fraction(3,5).add(new Fraction(7));
        Fraction c = new Fraction(6,7);
        Fraction results = c.multiply(a.divide(b));
        System.out.println(results);

        /*---------------------------Test Case 1---------------------------*/
        //uses multiply and negate
        Fraction d = new Fraction(16);
        Fraction e = new Fraction(2);
        Fraction results2 = d.multiply(e).negate();
        Fraction results2a = d.divide(e).negate();
        System.out.println(results2);
        System.out.println(results2a);


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

        /*---------------------------Test Case 4---------------------------*/
        //uses subtract
        Fraction b1 = new Fraction(2,3);
        Fraction b2 = new Fraction(4,5);
        Fraction result3 = b1.subtract(b2);
        System.out.println(result3);

        /*---------------------------Test Case 5---------------------------*/
        //uses divide and negate
        Fraction b3 = new Fraction(2,3);
        Fraction b4 = new Fraction(0);
        Fraction result4 = b3.divide(b4);
        Fraction result5 = result4.negate();
        System.out.println(result4);
        System.out.println(result5);

        Fraction result6 = result5.negate();
        System.out.println(result6);


        /*---------------------------Test Case 6---------------------------*/
        //uses pow
        Fraction c1 = new Fraction(2);
        Fraction result7 = c1.pow(3);
        System.out.println(result7);

        
    }
}
