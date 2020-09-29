package PreviouslyAskedQuestions;

public class Number7th
{
	public static void main(String[] args)
	{
		int[] coin = new int[]{1,0,0,0,1,0};
		Number7thImpl obj = new Number7thImpl();
		int result = obj.solution(coin);
		System.out.println(result);
		
	}
}


class Number7thImpl
{
	public int solution(int[] A)
	{
		int size = A.length;
		int head = 0;
		int tail = 0;
		for(int i = 0; i < size; i++)
		{
			if(A[i] == 0)
				head++;
			if(A[i] == 1)
				tail++;
		}
		if(head < tail)
			return head;
		else return tail;
	}
}