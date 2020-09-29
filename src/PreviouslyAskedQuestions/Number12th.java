package PreviouslyAskedQuestions;

import java.util.LinkedList;
import java.util.List;

public class Number12th
{
	public static void main(String[] args) 
	{
		int[] a = new int[]{1,4,-1,3,2};
		Number12thImpl obj = new Number12thImpl();
		int result = obj.solution(a);
		System.out.println(result);
	}
}


class Number12thImpl
{
	public int solution(int[] A)
	{
		LinkedList<Integer> myList = new LinkedList<Integer>();
		myList.addFirst(A[0]);
		int size = A.length;
		int temp = 0;
		for(int i = 0; i < size; i++)
		{
			if(A[i] == -1)
				temp = i;
			else
				myList.add(A[i]);
		}
		myList.addLast(A[temp]);
		System.out.println(myList);
		return myList.size();
	}

}