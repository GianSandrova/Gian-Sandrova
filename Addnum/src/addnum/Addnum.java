package addnum;
import java.io.*;

/**
*<h1>Add Two Number!</h1>
*The AddNum program implements an application that
*simply adds two given integer numbers and Prints
*the output on the screen.
* <p>
*<b>Note:</b> Giving proper comments in your program makes it more
*user friendly and it is assumed as a high quality code.

* author Gian Sandrova
* versi 1.0
* Tanggal 10-02-2022
*/

public class Addnum {

/**
 * This method is used to add two integers. This is
 * a the simplest form of a class method, just to
 * show the usage of various javadoc Tags.
 * @param numA This is the first paramter to addNum method
 * @param numB This is the second parameter to addNum method
 * @return int This returns sum of numA and numB.
 */
 public int addNum(int numA, int numB) {
 return numA + numB;
 }
 
 /**
 * This is the main method which makes use of addNum method.
 * @param args Unused.
 * @exception IOException On input error.
 * @see IOException
 */

public static void main(String args[]) throws IOException {
 Addnum obj = new Addnum();
 int sum = obj.addNum(35,15);
 System.out.println("Sum of 35 and 15 is :" + sum);
 }
 
}