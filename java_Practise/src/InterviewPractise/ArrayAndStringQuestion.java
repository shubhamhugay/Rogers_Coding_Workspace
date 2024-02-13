package InterviewPractise;

import java.util.Arrays;

//array sorting
//remove duplicates
//count occurence 
//shifting of the number 
//rotating the array and string 
//merge two sorted array

public class ArrayAndStringQuestion {

    //sorting the array
	public static void sortTheArray(int a[]) {

		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int k = 0; k < a.length; k++) {
				if (a[i] < a[k]) {
					temp = a[k];
					a[k] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println("the sorted array is ");
		for (int i = 0; i < a.length; i++) {
			System.err.print(a[i] + " , ");
		}
	}

	/*------------------------------------------------------------------------------*/
	
	//remove duplicates from the array
	public static void removeDuplictes(int a[]) 
	{
		Arrays.sort(a);
		int j=0;
		int temp[]=new int[a.length];
		for(int i = 0 ;i<a.length-1;i++) {
				if(a[i]!=a[i+1]) 
				{
					temp[j++]=a[i];
				}

		}
		
		temp[j++]=a[a.length-1];
		for(int i = 0;i <temp.length;i++) 
		{
			a[i]=temp[i];
		}
		for(int i = 0;i<temp.length;i++) {
			System.err.print(temp[i]+" | ");
		}
		
	}
	
	
	
	//rotate array to the right
	public static void rotateRight(int arr[],int position) 
	{
		int n=arr.length;
		position=position%n;
		for(int i =0;i<position;i++) 
		{
			int temp=arr[n-1];//last number
			for(int j =n-1;j>0;j--) 
			{
				arr[j]=arr[j-1];
			}
			
		arr[0]=temp;	
		}
      for(int i =0;i<n;i++) 
      {
    	  System.out.print( arr[i]+",");
      }		
	}
	
	
	//rotate left 
	public static void rotateLeft(int arr[],int position) {
		int n =arr.length;
		position=position%n;
		for(int i =0;i<position;i++) {
			int temp=arr[0];
			for(int j=0;j<n-1;j++) 
			{
				arr[j]=arr[j+1];
				
			}
			arr[n-1]=temp;
		}
		  for(int i =0;i<n;i++) 
	      {
	    	  System.out.print( arr[i]+",");
	      }	
		
	}

	public static void main(String[] args) {

//		int a[] = { 10, 25, 36, 554, 85, 96, 74, 56, 63, 69, 58, 4, 796, 52 };
//		sortTheArray(a);
		
//		System.err.println();
		int b[]= {10,35,25,36,54};
//		removeDuplictes(b);
		rotateLeft(b, 3);
		System.out.println();
		rotateRight(b, 3);
		
	}

}
