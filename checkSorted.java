public class Main
{   
    
    public static void checkSorted(int arr[], int n){
        boolean flag=true;
        for(int i=0;i<n-1;i++)
            if(arr[i]>arr[i+1])
           { flag=false;
            break;
           }
            else
            flag=true;
            
            
        if(flag==true)
		System.out.println("Array is sorted");
		else
		System.out.println("Array is not sorted");
        
    }
    
	public static void main(String[] args) {
		int arr[]={4,6,10,19,20};
		int n=arr.length;
		
		checkSorted(arr, n);
		
		
	}
}
