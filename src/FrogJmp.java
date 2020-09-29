
public class FrogJmp {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		FrogJmpImpl obj = new FrogJmpImpl();
		int x = 10;
		int y = 85;
		int d = 30;
		int result = obj.solution(x, y, d);
		System.out.println(result);
		
	}

}


class FrogJmpImpl
{
	public int solution(int X, int Y, int D)
	{
		int diff = Y - X;
		int result;
		if(diff == 0)
			return 0;
		
		result = diff/D;
		if((diff%D) > 0)
			result++;
		return result;
	}
}