import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args)  {
       TestMain test = new TestMain();
       test.main(null);
    }
    
    /**
     * 
     * Using ONLY Stacks of Character (you can use more than one), write a program to recognize a palindrome i.e. words the same backwards and forwards.
     *   Use no String methods except charAt()
     *
     *   isPalindrome("abba")  true
     *   isPalindrome("abc")  false
     *   isPalindrome("amanaplanacanalpanama")  true
     *   isPalindrome("neveroddoreven")  true
     *   isPalindrome("hello")  false
     *   isPalindrome("yobananaboy")  true
     *
     *   Remember:  char is a primitive type so you compare them using ==
     */
     static public boolean isPalindrome(String str)
     {
        Stack<Character> chars = new Stack<Character>();
        Stack<Character> chars2 = new Stack<Character>();
        for(int i = 0;i<str.length();i++){
          chars.push(str.charAt(i));
        }
        for(int i = str.length()-1;i>=0;i--){
          chars2.push(str.charAt(i));
        }
        while(!chars.isEmpty()){
          if(chars.pop()!=chars2.pop()){
            return false;
          }
        }
        return true;
        
     }

}
