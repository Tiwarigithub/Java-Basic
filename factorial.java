public class factorial{
    public static int calFactorial(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        int fact_n1 = calFactorial(n-1);
        int fact_n2 = n*fact_n1;
        return fact_n2;
    }
    public static void main (String args[])
    {
        int n = 5;
        int ans =  calFactorial(n);
        System.out.println(ans);
    }
}