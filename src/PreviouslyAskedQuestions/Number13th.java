package PreviouslyAskedQuestions;

import java.util.*;
public class Number13th
{
	public static void main(String[] args)
	{
		Number13thImpl obj = new Number13thImpl();
		int result = obj.solution(3, 7);
		System.out.println(result);
	}
}

class Number13thImpl
{
	public int solution(int a, int b)
	{
		List<Integer> arrayList = new ArrayList<Integer>();
		int result = a*b;
		String binary = Integer.toBinaryString(result);
		char array[] = binary.toCharArray();
		int size = array.length;
		int counter = 0;
		for(int i = 0; i < size; i++)
		{
			if(array[i] == '1')
				counter++;
		}
		return counter;
	}
}