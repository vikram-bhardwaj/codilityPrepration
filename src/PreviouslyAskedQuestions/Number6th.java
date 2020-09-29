package PreviouslyAskedQuestions;

public class Number6th
{
	public static void main(String[] args) 
	{
		int num = 13;
		Number6thImpl obj = new Number6thImpl();
		int result = obj.solution(num);
		System.out.println(result);
	}

}

class Number6thImpl
{
	public int solution(int n)
	{
		int result = 0;
		for(int i = 1; i <= n; i++)
		{
			int count = getCount(i);
			result = result + count;
		}
		return result;
	}
	
	
	public int getCount(int num)
	{
		int count = 0;
		while(num > 0)
		{
			if(num % 10 == 1)
				count++;
			num = num / 10;
		}
		return count;
	}
}