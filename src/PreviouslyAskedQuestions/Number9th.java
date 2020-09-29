package PreviouslyAskedQuestions;

public class Number9th 
{

	public static void main(String[] args)
	{
		int a[] = new int[]{1,1000,80,-91};
		Number9thImpl obj = new Number9thImpl();
		int result = obj.solution(a);
		System.out.println(result);
	}
}


class Number9thImpl
{
	public int solution(int[] A)
	{
		int size = A.length;
		int result = 0;
		for(int i = 0; i < size; i++)
		{
			if((A[i] > 9 && A[i] < 100) ||(A[i] < -9 && A[i] > -100))
			{
				result = result + A[i];
			}
		}
		return result;
	}
}