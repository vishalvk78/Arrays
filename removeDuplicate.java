class Main {
    public static void removeDuplicate(int arr[], int n)
    {
        arr[0]=10;
		System.out.print(arr[0] + " ");
		for(int i=1;i<n;i++)
		{
		    if(arr[i-1]!=arr[i])
		    {
		        System.out.print(arr[i] + " ");
		    }
		}
    }
    
    public static void main(String[] args) {
        int arr[]={10,10,20,30,30,30,30};
		int n=arr.length;
		
		removeDuplicate(arr, n);
    }
}