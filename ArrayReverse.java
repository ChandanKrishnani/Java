import java.util.*;
 class ArrayReverse 
{
	 public static void main(String args[])
	 { 
		Scanner s = new Scanner(System.in);
 		int n;
                       //Taking n input as a number from user  of total number of elements 
 		System.out.print("Enter the Number of elements : ");
 		n=s.nextInt();
 		int arr[]=new int[n]; 
		for(int i=0;i<n;i++) 
		{ 
                                 //Inserting values in array 

			System.out.print("Enter the Number : ");
 			arr[i]=s.nextInt();
 		}
 		int j=n-1;
 		int l;
 		for(int i=0;i<=(n/2)-1;i++) 
		{
			//Swaping Values of array
 			l=arr[i];
 			arr[i]=arr[j];
 			arr[j]=l;
 			j--; 
		}
		 for(int i=0;i<n;i++)
 		{
			//Printing values of array 
 			System.out.println("Elements are : " + arr[i]);
 		}
 	}
 }
