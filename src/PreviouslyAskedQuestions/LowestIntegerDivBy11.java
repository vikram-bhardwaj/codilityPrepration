package PreviouslyAskedQuestions;

public class LowestIntegerDivBy11 {

	public static void main(String[] args) {
		int a[] = new int[] {-6, -91, 1011, -100, 84, -22, 0 , 1, 473,22,-44};
		LowestIntegerDivBy11Impl obj = new LowestIntegerDivBy11Impl();
		int result = obj.solution(a);
		System.out.println(result);
		
	}

}

class LowestIntegerDivBy11Impl
{
	public int solution(int[] a)
	{
		int size = a.length;
		int result = 0;
		Boolean flag = false;
		for(int i = 0; i < size; i++)
		{
			if(a[i] % 11 == 0)
			{
				if(flag == false)
				{
					result = a[i];
					flag = true;
				}
				else
				{
					if(result > a[i])
						result = a[i];
				}
			}
		}
		return result;
	}
}