// n=5
//                 *
//             *   * 
//         *   *   *
//     *   *   *   *
// *   *   *   *   *


package Patterns;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n-1-i){
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
