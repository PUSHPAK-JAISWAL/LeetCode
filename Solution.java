// this is the program to solve the leetcode problem 1
class Solution
{
    public int[] twoSum(int nums[] , int target)
    {
        int a;
        for(int i = 0; i < nums.length ;i++)
        {
            for(int j = i+1; j< nums.length;j++)
            {
                a = nums[i] + nums[j];
                if ( target == a)
                {
                   return new int[]{i,j};
                }
            }
    }
    return new int[]{};
    }
}