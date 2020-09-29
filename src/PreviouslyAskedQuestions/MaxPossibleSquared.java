package PreviouslyAskedQuestions;

public class MaxPossibleSquared {

	public static void main(String[] args) 
	{
		MaxPossibleSquaredImpl obj = new MaxPossibleSquaredImpl();
		//obj.coinReversal()
	}

}


class MaxPossibleSquaredImpl
{
	public static int coinReversal(int a[])
	{
	    int cost1 = 1, cost2 = 0;
	    int b[] = a.clone();
	    b[0] = 0;
	    if(b[0] == 0){
	        for(int i = 0 ; i < b.length-1 ; i++ ){
	            if(b[i] == b[i+1] ){
	                cost1+=1;
	                if(b[i+1] == 1){
	                    b[i+1] = 0;
	                }else{
	                    b[i+1] = 1;
	                }
	            }
	        }
	    }
	    if(a[0] == 1){
	        for(int i = 0 ; i < a.length-1 ; i++ ){
	            if(a[i] == a[i+1] ){
	                cost2+=1;
	                if(a[i+1] == 1){
	                    a[i+1] = 0;
	                }else{
	                    a[i+1] = 1;
	                }
	            }
	        }
	    }
	
	    return  cost2 > cost1 ? cost1 : cost2;
	}
}