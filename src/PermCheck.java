import java.util.Arrays;

public class PermCheck {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PermCheckImpl obj = new PermCheckImpl();
		int array[] = new int[] {1,5,2,4,3,9,6,7};
		int result = obj.solution(array);
		System.out.println(result);
	}

}


class PermCheckImpl
{
	public int solution(int[] A)
	{
		int size = A.length;
		if(size == 0)
			return 0;
		Arrays.sort(A);
		for(int i = 0; i < size; i++)
		{
			if((i+1) != A[i])
				return 0;
		}
		return 1;
	}
}