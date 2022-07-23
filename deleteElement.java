public class Main
{   
    public static int deleteElement(int arr[], int n, int x){
        //find the index of element
        int i;
        for(i=0;i<n;i++)
            if(arr[i]==x)
                break;
                
        //if element not found, print original array
        if(i==n)
        return n;
        
        //if element found, print modified array
        for(int j=i;j<n-1;j++)
            arr[j]=arr[j+1];
            return n-1;
    }
    
	public static void main(String[] args) {
		//define array
		int arr[]={10,20,30,40,50};
		int n=arr.length;
		
		//element need to delete
		int x=30;
		
		
		n=deleteElement(arr, n , x);
		  
        //print array element
        for(int j=0;j<n;j++)
        System.out.print(arr[j] + " ");
	}
}
