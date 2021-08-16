// Java_1d_Array
import java.util.Scanner;
class Java1dArray{

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int array1[] = new int[length];
		for(int i=0; i<=array1.length-1;i++)
			{
				int x = scan.nextInt();
				array1[i] =x;
				
			}
		for(int i=0; i<=array1.length-1;i++)
			{
				System.out.println(array1[i]);	
			}

	}
















}