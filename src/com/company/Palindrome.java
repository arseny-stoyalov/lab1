package com.company;

public class Palindrome {

    public static void main(String[] args) {

        for (String arg : args) {
            if (!isPalindrome(arg)) {
                System.out.println("Not all args are palindromes");
                return;
            }
        }
        System.out.println("All args are palindromes");
    }

    /**
     * Reverses given string
     */
    public static String reverse(String s){

        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1; i > -1; i--)
            ans.append(s.charAt(i));
        return ans.toString();
    }

    /**
     * Checks if word is the same when reversed
     */
    public static boolean isPalindrome(String s){
        return s.equals(reverse(s));
    }

}
