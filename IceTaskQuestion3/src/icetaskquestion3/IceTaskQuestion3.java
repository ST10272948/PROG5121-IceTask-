/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetaskquestion3;


public class IceTaskQuestion3 {
  public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return greatestCommonDivisor(b, a % b);
    }
    
    public static void main(String[] args) {
       System.out.println(greatestCommonDivisor(10, 15)); 
        System.out.println(greatestCommonDivisor(-21, 14)); 
        System.out.println(greatestCommonDivisor(0, 42)); 
    }
    
}
