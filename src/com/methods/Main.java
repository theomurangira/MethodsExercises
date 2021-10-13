package com.methods;

public class Main {

    public static void main(String[] args) {
	System.out.println(addDigits(4321));
    System.out.println(reverse(4321));
    System.out.println(reverse("Hello"));
    }
    /*This method takes a positive integers
    and returns the sum of its digits
     */
    public static int addDigits(int a)
    {
        int sum=0;
        while(a>0)
        {
           sum +=a%10;
           a=a/10;
        }
        return sum;
    }
    /*  This method takes a positive integer and returns
    *  the integer with the same digits , but in reverse order
    *   */
    public static int reverse(int a)
    {
        int result=0;
        while(a>0)
        {
            result=result*10 + a%10;
            a=a/10;
        }
        return result;
    }
  /*This method takes a string and returns its reverse*/
    public static String reverse(String s)
    {
        String res="";
        for(int i=s.length()-1;i>=0;--i)
            res=res+s.charAt(i);
        return res;
    }
    /*This mthod checks if a passed String is a palindrome*/
    public static boolean isPalindrome(String s)
    {
        String rev=reverse(s);
        if(rev.equalsIgnoreCase(s))
            return true;
        else
            return false;
    }

}
