import java.util.*;
public class PermMissingElem {

	public static void main(String[] args)
	{
		findMissingElements obj = new findMissingElements();
		int array[] = new int[] {3,5,7,1,2,4,6,8,10,11,12,14,13};
		int result = obj.solution(array);
		System.out.println(result);
	}

}

class findMissingElements
{
	public int solution(int[] A)
	{
		Arrays.sort(A);
		int size = A.length;
		if(size == 0)
			return 1;
		if(size > 1 && A[0] != 1)
			return 1;
		int start = 1;
		int end = A[size-1];
		
		for(int i = 0; i < size; i++)
		{
			if(A[i] == start)
				start++;
			else
				return start;
		}
		return start;
		
	}
}
