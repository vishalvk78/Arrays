public class Main
{   
    public static void largestElement(int arr[], int n){
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1])
                {
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        System.out.println("Largest element is : " + arr[n-1]);
    }
    
	public static void main(String[] args) {
		int arr[]={10,5,15,3,9,4,1};
		int n=arr.length;
		
		largestElement(arr, n);
		
	}
}
