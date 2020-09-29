import java.util.Arrays;

public class CyclicRotation {

	public static void main(String[] args)
	{
		MySolution obj = new MySolution();
		int array[] = new int[] {1,2,3,4,5,6,7};
		obj.solution(array, 3);
	}

}


class MySolution
{
	public int[] solution(int[] A, int K)
	{
		int temp;
		int size = A.length;
		if(A.length == 0)
		{
			return A;
		}
		
		for(int rotate = 0; rotate < K; rotate++)
		{
			temp = A[size-1];
			for(int i = (size-1); i > 0; i--)
				A[i] = A[i-1];
			A[0] = temp;
		}
		System.out.println(Arrays.toString(A));
		return A;
	}
}