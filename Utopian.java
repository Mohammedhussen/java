import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Utopian {

/*

The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

Hawra plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after NN growth cycles?

Input Format

The first line contains an integer, TT, the number of test cases.
TT subsequent lines each contain an integer, NN, denoting the number of cycles for that test case.

Constraints
1≤T≤101≤T≤10
0≤N≤600≤N≤60

Output Format

For each test case, print the height of the Utopian Tree after NN cycles. Each height must be printed on a new line.
*/



    public static void main(String[] args) {
	System.Out.println("Enter number of your test case");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
               int h=1;          
           if (n%2==0){
                  h=(n/2)*2+1;
                 }
               else if(n%2!=0){
               h=(n/2)*2+2; 
            }
              System.out.print(h+"\n");
             }
              

    }}