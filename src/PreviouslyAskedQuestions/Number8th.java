package PreviouslyAskedQuestions;

public class Number8th {

	public static void main(String[] args)
	{
		String G = "RSPRS";
		Number8thImpl obj = new Number8thImpl();
		int result = obj.solution(G);
		System.out.println(result);
	}

}

class Number8thImpl
{
	public int solution(String G)
	{
		char[] c = G.toCharArray();
		int size = c.length;
		int result = 0;
		for(int i = 0 ; i < size; i++)
		{
			if(c[i] == 'R')
			{
				result++;
			}
			if(c[i] == 'S')
			{
				result += 2;
			}
		}
		return result;
	}
}