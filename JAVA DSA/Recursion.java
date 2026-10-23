public class Recursion {
    int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }else if(n==1)
        {
            return 1;
        }else{
            return factorial(n-1)*n;
        }
    }

    int fib(int n)
    {
        if(n==1)
        {
            return 0;
        }else if(n==2)
        {
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
}
