/*Given a number N. Find the minimum number of operations required to reach N starting from 0. You have 2 operations available:

Double the number
Add one to the number
Example 1:

Input:
N = 8
Output: 4
Explanation: 
0 + 1 = 1 --> 1 + 1 = 2 --> 2 * 2 = 4 --> 4 * 2 = 8.*/
class Solution
{
    public int minOperation(int n)
    {
       int ans = 0, i = n;
        while(i>0){
            if(i%2==0){
                i = i/2;
                ans++;
            }else{
                i--;
                ans++;
            }
        }
        return ans;
    }
}