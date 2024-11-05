package com.alg2025;

public class LongestPalindromeSubstring {
    static boolean  isPalindrome(String str){
        if(str == null || str.length() == 0) return false;
        int i = 0;
        int j = str.length() -1;
        while(i < j){
            while(str.charAt(i) == ' '){
                i++;
            }
            while(str.charAt(j) == ' '){
                j--;
            }
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }

        return true;
    }
    public static void main(String[] args) {
         // Test case;

        System.out.println(isPalindrome("aba")); // true
        System.out.println(isPalindrome("abc")); // false
        System.out.println(isPalindrome("a"));   // true
        System.out.println(isPalindrome(""));    // false
        System.out.println(isPalindrome("a b  a")); // true

    }
}
