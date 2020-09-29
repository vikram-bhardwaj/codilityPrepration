import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryGap
{
	public static void main(String[] args)
	{
		Solution obj = new Solution();
		int temp = obj.solution(101);
		System.out.println(temp);
	}
}

class Solution 
{
	public int solution(int n)
	{
		List<Integer> list = new ArrayList<Integer>();
		while(n > 0)
		{
			list.add(n%2);
			n = n/2;
		}
		Collections.reverse(list);

		int result = checkBinaryGap(list);
		return result;
	}
	
	public int checkBinaryGap(List<Integer> list)
	{
		int result = 0;
		int counter = 0;
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i) == 1)
			{
				//isStartOne = true; 
				if(result < counter)
					result = counter;
				counter = 0;
			}
			else
			{
				counter++;
				//isStartOne = false;
			}
		}
		return result;
	}
}
