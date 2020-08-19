import java.util.*;
class hello
{
    public static void main(String args[])
    {

        Scanner s=new Scanner (System.in);
        System.out.println("Enter the range from :");
        int a=s.nextInt();
        System.out.println("Enter the range  to :");
        int b=s.nextInt();
        for(int i=a;i<=b;i++)
        {
            int flag=0;
            for(int j=2;j<=i/2;j++)
        {
            if((i%j)==0)
            {
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println(i);
        }

        }
        
    }
}
