public class SortingValues
{
	public static void main( String[] args )
	{
		int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

		// Display the original (unsorted values)
		System.out.print("before: ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
		int temp = 0;

		// Swap the values around to put them ascending order.
		
		for ( int i=0; i<arr.length-1; i++ )
		{
			for (int n=0; n<arr.length-2; n++ )
			{
				if ( arr[n] > arr[n+1])
				{
					temp = arr[n]; 
					arr[n]=arr[n+1];
					arr[n+1] = temp;
				
				}
			}
		}
		

		// Display the values again, now (hopefully) sorted.
		System.out.print("after : ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}
