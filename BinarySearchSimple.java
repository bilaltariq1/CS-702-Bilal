class BinarySearchSimple
{
	public static void main(String [] args)
	{
		int[] a = {2, 6, 7 ,9,10, 13, 15, 16, 18,19,22, 25};

		int key = 19;
		int li = 0;
		int hi = a.length-1;
		int mi = (li+hi)/2;

		while(li <= hi)
		{
			if(a[mi] == key)
			{
				System.out.println("element found at index :" + mi);
				break;
			}
			else if(a[mi]<key)
			{
				li = mi +1;
			}
			else
			{
				hi = mi -1;
			}
			mi = (li+hi)/2;
		}
		if(li>hi)
		{
			System.out.println("element not found");
		}
	}
}
