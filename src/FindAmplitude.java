import java.util.*;

public class FindAmplitude 
{

	public static void main(String[] args)
	{
		int arr[] = new int[]{2,9,-10,18,16,32,35,-9,1,2,3,4,1,2,34,-200};
		FindAmplitudeImpl obj = new FindAmplitudeImpl();
		String s = obj.solution(arr);
		System.out.println(s);
	}
}


class FindAmplitudeImpl
{
	public String solution(int array[])
	{
		int size = array.length;
		int value = size/4;
		int counter = 0;
		int winter[] = new int[value];
		int spring[] = new int[value];
		int summer[] = new int[value];
		int autumn[] = new int[value];
		String s = "";
		for(int i = 0; i < value; i++)
		{
			winter[i] = array[i];
		}
		for(int i = value; i < value*2; i++)
		{
			spring[counter] = array[i];
			counter++;
		}
		counter = 0;
		for(int i = value*2; i < value*3; i++)
		{
			summer[counter] = array[i];
			counter++;
		}
		counter = 0;
		for(int i = value*3; i < value*4; i++)
		{
			autumn[counter] = array[i];
			counter++;
		}
		
		int amplitude[] = new int[4];
		amplitude[0] = getAmplitude(winter);
		amplitude[1] = getAmplitude(spring);
		amplitude[2] = getAmplitude(summer);
		amplitude[3] = getAmplitude(autumn);
		
		int max = -1000;
		int index = 0;
		for(int i = 0; i < 4; i++)
		{
			if(max < amplitude[i])
			{
				max = amplitude[i];
				index = i;
			}
		}
		if(index == 0)
			s =  "WINTER";
		if(index == 1)
			s = "SPRING";
		if(index == 2)
			s =  "SUMMER";
		if(index == 3)
			s =  "AUTUMN";
		return s;
	}
	
	public int getAmplitude(int[] array)
	{
		int min = 1000;
		int max = -1000;
		int size = array.length;
		
		for(int i = 0; i < size; i++)
		{
			if(array[i] < min)
				min = array[i];
			if(array[i] > max)
				max = array[i];
		}
		int diff = max - min;
		return diff;
	}
}




