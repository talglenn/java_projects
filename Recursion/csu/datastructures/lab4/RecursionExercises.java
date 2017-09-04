package csu.datastructures.lab4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tally tal
 */
public class RecursionExercises 
{
    //Problem 1
    public static int multiply(int a, int b)
    {
        if(a==0 || b==0)
	{
            return 0;
        }
	if(a==1)
	{
            return b;
        }
	if(b==1)
	{
            return a;
        }
        return a + multiply(a,b-1);
    }
    
    //Problem 2
    public static int findMin(int array[])
    {
        if(array.length== 1)
        {
            return array[0];
        }
        
        int z;
        if(array.length % 2 == 0)
        {
            z = 0;
        }
        else
        {
            z = 1;
        }
        
        int[] t = new int[array.length/2 + z];
        for(int i = 0; i<array.length/2 + z;i++)
        {
            if(array[i] <= array[array.length-i-1])
            {
                t[i] = array[i];
            }
            else
            {
                t[i] = array[array.length-i-1];
            }
        }
        return(findMin(t));
                
    }
    
    //Problem 3
    public static int reverse(int number)
    {
        if(number == 0)
        {
            return 0;
        }
        int t = number;
        int i = 1;
        
        while(t >= 10)
        {
            t /= 10;
            i *= 10;
        }
        
        return t + reverse(number - t*i)* 10;
       
    }
    
    //Problem 4
    public static int countPaths(int n, int m)
    {
        if (m == 0)
        {
            return 1;
        }
        if(n == 0)
        { 
            return 1;
        }
        return countPaths(n-1,m) + countPaths(n,m-1);
    }
    
    //Problem 5
    public static String ordString(int number)
    {
        String k;
        if(number == 0)
        {
            return "{}";
        }
        else
        {
            k = "";
            for(int t = 0; t < number; t++)
            {
                k = (t == 0) ? k + ordString(t): k+"," + ordString(t);
                
            }
            return "{" + k + "}";
        }       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        //Problem 1
        System.out.println("(Problem 1) \nThis is the result of two numbers recursively multiplied to each other: "
                + multiply(10,8));
        
        //Problem 2
        int[] numbers = {5, 23, 24, 0, 15, 97, 103};
        System.out.println("(Problem 2) \nThis is the smallest number in the array: " + findMin(numbers));
        
        //Problem 3   
        System.out.println("(Problem 3) \nThis is the number in reverse order: " + reverse(12345));
        
        //Problem 4  
        System.out.println("(Problem 4) \nThe number of different paths from point (n,m) to the origin is: "
                + countPaths(3,16));
        
        //Problem 5  
        System.out.println("(Problem 5) \nBased on the number you have selected, this is your string: "
                + ordString(0));
    }   
}
