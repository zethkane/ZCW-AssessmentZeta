package com.zipcodewilmington.assessment1.part4;

public class Jumper
{

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j)
    {
        int count = 0;
        int n = k / j;
        if(n >= 1)
        {
            count += n;
        for (int i = 1; i <= k - (n * j); i++)
            {
                count++;
            }}
        else
        {
            for (int i = 0; i < k; i++)
            {
                count++;
            }
        }

    return count;
    }
}//take the remainder of the difference and continue counting.
