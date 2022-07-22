public class Main
{
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50,60};
		int n=arr.length;
		//element search
		int x=50;
		int flag=0;
		
		//traverse for loop for search element from ith index to (n-1)th index
	    for(int i=0;i<n;i++){
	        if(arr[i]==x){
	        flag=1;
	        break;
	        }
	    }
	    
	    
    if(flag == 1)
        System.out.println("Search Found\n");
    else
        System.out.println("Search Not Found\n");
	}
}