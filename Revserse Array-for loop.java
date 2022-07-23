public class Main
{   
    public static void reverseArray(int arr[], int n){
    for(int i=0;i<n/2;i++){
		    int temp= arr[i];
		    arr[i]=arr[n-1-i];
		    arr[n-1-i]=temp;
		}
		
		// printing the reversed array
        System.out.println("Reversed array is: \n");
		for(int j=0;j<n;j++){
		    System.out.print(arr[j] + " ");
		}
    
    }
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50,60};
		int n=arr.length;
		
		reverseArray(arr,n);
	    
	}
}
