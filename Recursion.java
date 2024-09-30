public class Recursion 
{

    public static void main(String[] args) 
    {
        int sum;
      sum = Recursion(5);
        System.out.println("the sum of 5 is: " + sum);
    }
    public static int Recursion(int n)
    {
        if(n==0)
            return 0;
        else
            return n + Recursion(n-1);
    }
}
