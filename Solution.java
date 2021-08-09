import java.util.Scanner;
public class Solution{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int arrSize = in.nextInt();
		int arr[] = new int[arrSize];
		for(int i=0;i<arr.length;i++){
			arr[i] = in.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		int max = -1, count = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] >= max){
				max = arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i] == max){
				count++;
			}
		}
		
		
		System.out.println(count);
	}
}