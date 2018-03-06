
public class jhdfj {
public static void main(String[] args) {
	int[] arr={2,3,1,9,6,8};
	int n=arr.length;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		int highestproduct=arr[n-1]*arr[n-2]*arr[n-3];
		int lowestproduct=arr[0]*arr[1]*arr[2];
		System.out.println("product of highest 3 numbers is "+highestproduct);
		System.out.println("product of lowest 3 numbers is "+lowestproduct);
		break;
	}	
}
}
