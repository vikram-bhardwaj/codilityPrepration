import java.util.Arrays;

public class OddOccurrencesInArray
{
	public static void main(String[] args)
	{
		RetuenTheNumber obj = new RetuenTheNumber();
		int array[] = new int[] {1,3,3,1,5,5,7,9,8,7,8,10,10};
		int a = obj.solution(array);
		System.out.println(a);
	}
}

class RetuenTheNumber
{
	public int solution(int[] A)
	{
		int toReturn = 0;
		Arrays.sort(A);
		int size = A.length;
		for(int i = 0; i < size-1; i += 2)
		{
			if(A[i] != A[i+1])
			{
				toReturn = A[i];
				return toReturn;
			}
		}
		toReturn = A[size-1];
		return toReturn;
	}
}
