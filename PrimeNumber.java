import java.util.*;
class hello
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int i;
        int flag=0;
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
            }

        }
        if (flag==1)
        {
            System.out.println("NOt prime");
        }
        else 
        {
            System.out.println("prime");

        }

    }
}
