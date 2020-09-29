package PreviouslyAskedQuestions;

public class Number11th
{
	public static void main(String[] args)
	{
		int array[] = new int[]{1,3,3,3,2,3,2,1,0};
		Number11thImpl obj = new Number11thImpl();
		int result = obj.solution(array);
		System.out.println(result);
	}
}


class Number11thImpl
{
	public int solution(int[] A)
	{
		int size = A.length;
		
		int result = 0;
		int count = 0;
		int diff = 0;
		
		for(int i = 0; i < size-1; i++)
		{
			diff = A[i] - A[i+1];
			for(int j = i; j < size-1; j++)
			{
				
				if((A[j]) - A[j+1] == diff)
				{
					count++;
					if(count > 1)
					{
						result++;
						//System.out.println(":::" +A[j] + "::" + A[j+1]);
					}
				}
				else 
				{
					count = 0;
					break;
				}
			}
		}
		return result;
	}
}