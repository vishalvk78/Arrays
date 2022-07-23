public class Main
{   
    public static void reverseArray(int arr[], int n){
        int low=0;
        int high=n-1;
        
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
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