import java.util.*;

public class Distinct
{
	public static void main(String[] args)
	{
		DistinctImpl obj = new DistinctImpl();
		int array[] = new int[] {2,1,1,2,3,1};
		int result = obj.solution(array);
		System.out.println(result);
	}
}

class DistinctImpl
{
	public int solution(int[] A)
	{
		int size = A.length;
		Set mySet = new HashSet();
		for(int i = 0; i < size; i++)
		{
			mySet.add(A[i]);
		}
		return mySet.size();
	}
}