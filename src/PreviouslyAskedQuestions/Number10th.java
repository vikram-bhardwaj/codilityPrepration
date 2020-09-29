package PreviouslyAskedQuestions;

public class Number10th
{

	public static void main(String[] args) 
	{
		int T = 83643;
		Number10thImpl obj = new Number10thImpl();
		String s = obj.solution(T);
		System.out.println(s);
	}
}

class Number10thImpl
{
	public String solution(int num)
	{
		int hrs = 0, min = 0, sec = 0;
		String s = "";
		if(num >= 3600)
		{
			hrs = num / 3600;
			num = num % 3600;
		}
		if(num >= 60)
		{
			min = num / 60;
			sec = num % 60;
		}
		if(num < 60)
		{
			sec = num;
		}
		s = hrs + "h" + min + "m" + sec + "s";
		return s;
	}
}