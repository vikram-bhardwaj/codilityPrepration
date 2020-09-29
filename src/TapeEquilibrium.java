
public class TapeEquilibrium {

	public static void main(String[] args)
	{
		TapeEquilibriumImpl obj = new TapeEquilibriumImpl();
		int array[] = new int[] {3,1,2,4,3};
		int result = obj.solution(array);
		System.out.println(result);

	}

}


class TapeEquilibriumImpl
{
	public int solution(int[] A)
	{
		int size = A.length;
		int sum1 = A[0];
		int sum2 = 0;
		int diff = 0;
		int result = 0;
		if(size == 0 || size == 1)
			return 0;
		for(int i = 1; i < size; i++)
			sum2 += A[i];
		diff = sum1 - sum2;
		if(diff < 0)
			diff = diff * (-1);
			result = diff;
		for(int i = 1; i < size-1; i++)
		{
			sum1 = sum1 + A[i];
			sum2 = sum2 - A[i];
			diff = sum1 - sum2;
			if(diff < 0)
				diff = diff * (-1);
			if(result > diff)
				result = diff;
		}
		return result;
	}
}