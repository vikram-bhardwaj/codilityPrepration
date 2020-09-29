import java.util.Arrays;

public class MaxCounters
{

	public static void main(String[] args)
	{
		MaxCountersImpl obj = new MaxCountersImpl();
		int array[] = new int[] {3, 4, 4, 6, 1, 4, 4};
		obj.solution(5, array);
	}

}


//this is copied



class MaxCountersImpl
{
	public int[] solution(int N, int[] A)
	{
		  int max = 0;
		    int[] counter = new int[N];
		    int upgrade = 0;

		    for ( int i = 0; i < A.length; i++ )
		    {
		        if ( A[i] <= N )
		        {
		            if ( upgrade > 0 && upgrade > counter[A[i] - 1 ] )
		            {
		                counter[A[i] - 1] = upgrade; 
		            }

		            counter[A[i] - 1 ]++;

		            if ( counter[A[i] - 1 ] > max )
		                {
		                    max = counter[A[i] - 1 ];
		                }
		        }
		        else
		        {
		            upgrade = max;
		        }
		    }
		    for ( int i = 0; i < N; i++ )
		    {
		        if ( counter[i] < upgrade)
		        {
		            counter[i] = upgrade;
		        }
		    }
		    return counter;
	}
}
