import java.util.*;
class hello
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a<b)
        {
            double c= Math.sqrt(b);
            System.out.println("b squareRoot =" + c);
            System.out.println("a square =" +(a*a));

        }
        else 
        {
            double c= Math.sqrt(a);
            System.out.println("a squareRoot =" + c);
            System.out.println("b square =" +(b*b));


        }
        

      

               
    }
}
