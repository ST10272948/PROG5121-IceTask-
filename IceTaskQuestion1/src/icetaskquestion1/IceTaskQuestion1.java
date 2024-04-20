/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetaskquestion1;

/**
 *
 * @author 27784
 */
public class IceTaskQuestion1 {

   public static boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return false; 
        }

        StringBuilder stack = new StringBuilder(); 
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.append(c); 
            } else if (c == ')' && stack.length() > 0 && stack.charAt(stack.length() - 1) == '(') {
                stack.deleteCharAt(stack.length() - 1); 
            } else if (c == '}' && stack.length() > 0 && stack.charAt(stack.length() - 1) == '{') {
                stack.deleteCharAt(stack.length() - 1); 
            } else if (c == ']' && stack.length() > 0 && stack.charAt(stack.length() - 1) == '[') {
                stack.deleteCharAt(stack.length() - 1); 
            } else {
                return false; 
            }
        }

        return stack.length() == 0; 
    }
    public static void main(String[] args) {
        
    System.out.println(isValid("{}{)}")); 
        System.out.println(isValid("")); 
        System.out.println(isValid("{[}]")); 
        System.out.println(isValid("()")); 
        System.out.println(isValid("({[]})")); 
    }
}

