public class Main
{
	public static void main(String[] args) {
		int arr[]={10,5,15,3,9,4,1};
		int n=arr.length;
		int max=0;
		
		for(int i=0;i<n-1;i++){
		    if(arr[i]>max)
		    max=arr[i];
		}
		
		System.out.println("Largest element is " + max);
	}
}