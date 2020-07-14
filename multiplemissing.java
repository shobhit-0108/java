import java.util.*;
class multiplemissing
{
	public static void main(String[] args)
	{
		//int[] ar = new int[11];
		int[] ar = {6,7,8,9,11,12,15,16,17,18,19};
		int diff = ar[0];
		System.out.print("The missing elements in array are :\t");
		for(int i=0;i<ar.length;i++)
		{
			if((ar[i]-i)!= diff)
			{
				while(diff<(ar[i]-i))
				{

					System.out.print((diff+i) + " ");
					diff++;
				}
			}
			else 
			{
				continue;
			}
			System.out.println();
		}
	}
}