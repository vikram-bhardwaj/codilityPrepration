import java.util.Arrays;

public class SelectionSort
{
	public static void main(String[] args)
	{
		SelectionSortImpl obj = new SelectionSortImpl();
		int array[] = new int[] {3,6,9,1,2,0,4};
		int sortedArray[] = obj.selectionSort(array);
		System.out.println(Arrays.toString(sortedArray));
	}
}


class SelectionSortImpl
{
	public int[] selectionSort(int array[])
	{
		int size = array.length;

		for(int i = 0; i < size -1; i++)
		{	
			int minValue = array[i];
			int jValue = i+1;
			for(int j = i+1; j < size; j++)
			{
				if(minValue > array[j])
				{
					minValue = array[j];
					jValue = j;
				}
			}
			if(array[i] > minValue)
			{
				int temp = array[i];
				array[i] = minValue;
				array[jValue] = temp;
			}
		}
		return array;
	}
}