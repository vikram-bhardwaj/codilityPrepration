import java.util.*;

public class FrogRiverOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrogRiverOneImpl obj = new FrogRiverOneImpl();
		int x = 5;
		int array[] = new int[] {1,3,1,4,2,3,5,4};
		int result = obj.solution(x, array);
		System.out.println(result);

	}

}

class FrogRiverOneImpl
{
	/*public int solution(int X, int[] A)
	{
		List myList = new ArrayList();
		int size = A.length;
		if(size == 0)
			return -1;
		int myListSize = 0;
		//myList = Arrays.asList(A);
		for(int i = 0; i < size; i++)
		{
			if(!myList.contains(A[i]))
				myList.add(A[i]);
			myListSize = myList.size();
			if(myListSize == X)
				return i;
		}
		return -1;

	}*/
	public int solution(int X, int[] A)
	{
		Set myList = new HashSet();
		int size = A.length;
		if(size == 0)
			return -1;
		int myListSize = 0;
		//myList = Arrays.asList(A);
		for(int i = 0; i < size; i++)
		{
			myList.add(A[i]);
			myListSize = myList.size();
			if(myListSize == X)
				return i;
		}
		return -1;

	}
}
