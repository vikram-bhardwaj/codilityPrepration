package PreviouslyAskedQuestions;

public class Number5th
{
	public static void main(String[] args)
	{
		int a[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		Number5thImpl obj = new Number5thImpl();
		obj.solution(a);
	}
}

class Number5thImpl
{
	public void solution(int[] a)
	{
		int size = a.length;
		Boolean b = false;
		for(int i = 0; i < size; i++)
		{
			if(a[i] % 3 == 0)
			{
				System.out.print("Fizz");
				b = true;
			}
			if(a[i] % 5 == 0)
			{
				System.out.print("Buzz");
				b = true;
			}
			if(a[i] % 7 == 0)
			{
				System.out.print("Woof");
				b = true;
			}
			if(b == false)
				System.out.print(a[i]);
			
			b = false;
			System.out.println();
		}
	}
}