// Pythagorean Triplets
// Question Statement: 
// 1. You are required to check if a given set of numbers is a valid pythagorean triplet.
// 2. Take as input three numbers a, b and c.
// 3. Print true if they can form a pythagorean triplet and false otherwise.

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        // if((a*a==(b*b+c*c)) || (b*b==(a*a+c*c)) || (c*c==(b*b+a*a))){
        //     System.out.println(true);
        // }else{
        //     System.out.println(false);
        // }
        if(a>b){
            if(a>c){
                if(a*a==(b*b+c*c)) {
                    System.out.println(true);
                }else{
                    System.out.println(false);
                }
            }else{
                if(c*c==(b*b+a*a)) {
                    System.out.println(true);
                }else{
                    System.out.println(false);
                }
            }
        }else{
            if(b>c){
                if(b*b==(a*a+c*c)) {
                    System.out.println(true);
                }else{
                    System.out.println(false);
                }
            }else{
                if(c*c==(b*b+a*a)) {
                    System.out.println(true);
                }else{
                    System.out.println(false);
                }
            }
        }
    }
}
