class FractionSum 
{
    public static void main(final String args[]) 
 {
        double sum=0;
        for(int i=1;i<=9;i++)
        {
	//Sum of series untile  9  as mentioned in question 
            sum = sum + (double)i / (i+1);

        }
       //Printing the sum
        System.out.println( " Here is the sum of series 1/2 + 2/3.....+9/10 :" + sum);       
    }   
}
