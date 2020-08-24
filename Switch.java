import java.util.*;
class Switch
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the range fr :");
        char a=s.next().charAt(0);
        switch(a)
        {
            case 65:
            {
                System.out.println("hello");
                break;
            }
            default :
            {
                System.out.println("World");

            }
        }
    }   
}
