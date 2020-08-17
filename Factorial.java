import java.util.*;
class Factorial
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int sum=1;
        int i;
        for(i=1;i<=n;i++)
        {
            sum=sum*i;
        }
        System.out.println("Using For loop " + sum);
        i=1;
        sum=1;
        while(i<=n)
        {
            sum=sum*i;
            i++;
        }
        System.out.println("Using while loop "+ sum);

    }
}
