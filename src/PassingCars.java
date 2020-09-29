
public class PassingCars 
{

	public static void main(String[] args) 
	{
		PassingCarsImpl obj = new PassingCarsImpl();
		int array[] = new int[]{0,1,0,1,1};
		int result = obj.solution(array);
		System.out.println(result);
	}

}

class PassingCarsImpl 
{
    public int solution(int[] A)
    {
        int sum = 0;
        int occurence = 0;

        for ( int i =0 ; i < A.length; i ++ )
        {
            if ( A[i] == 0 )
                occurence++;
            else
            {
                sum+=occurence;
                if ( sum > 1000000000 )
                    return -1;
            }
        }
        
        return sum;
    }
}
    
