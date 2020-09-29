import java.util.Arrays;

public class MissingInteger
{

	public static void main(String[] args)
	{
		MissingIntegerImpl obj = new MissingIntegerImpl();
		int array[] = new int[] {3,5,7,1,2,4,6,8,10,11,12,14,13};
		int result = obj.solution(array);
		System.out.println(result);
	}
}

class MissingIntegerImpl
{
	public int solution(int[] A)
	{
		int size = A.length;
		int result = 1;
		
		Arrays.sort(A);
		
		for(int i = 0; i < size; i++)
		{
			if(A[i] == result)
				result++;
		}
		return result;
	}
}
