public class Main
{   
    public static int searchArray(int arr[], int n, int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x)
                return i;
            
        }return -1;
    }
    
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50,60};
		int n=arr.length;
		//element search
		int x=30;
		
		int m=searchArray(arr,n,x);
		
		System.out.println(m);
	}
}