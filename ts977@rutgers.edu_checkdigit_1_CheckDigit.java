/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {

        // WRITE YOUR CODE HERE
        long code = Long.parseLong(args[0]);
        int total1 =0;
        int total2= 0;
        int total3 =0;

        while (code > 0){
           total1+= code % 10;
           code = code/10;
           total2 += code % 10;
           code = code/10;
        }
        total2*=3;
        total2 = total2 % 10;
        total1 = total1 % 10;
        total3 = total1 + total2;
        total3 = total3 % 10;
        System.out.println(total3);
    }
}