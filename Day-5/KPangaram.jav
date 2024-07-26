/* Given a string str and an integer k, return true if the string can be changed into a pangram after at most k operations, else return false.

A single operation consists of swapping an existing alphabetic character with any other alphabetic character.

Note - A pangram is a sentence containing every letter in the english alphabet.

Examples :

Input: str = "the quick brown fox jumps over the lazy dog", k = 0
Output: true
Explanation: the sentence contains all 26 characters and is already a pangram.
Input: str = "aaaaaaaaaaaaaaaaaaaaaaaaaa", k = 25 
Output: true
Explanation: The word contains 26 instances of 'a'. Since only 25 operations are allowed. We can keep 1 instance and change all others to make str a pangram.
Input: str = "a b c d e f g h i j k l m", k = 20
Output: false */
class Solution {
    boolean kPangram(String str, int k) {
        // code here
        
        int a[]=new int[26];
        int count=0,s=0;
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' '){
            int index=str.charAt(i)-'a';
            a[index]++;
            s++;}
        }
        
        for(int ar:a)
        {
            if(ar==0)
            {
                count++;
            }
        }
        
        return count <=k && s>=26;
    }
}