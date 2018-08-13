package odd_even;
import java.util.*;
//import java.io.*;
//import java.lang.*;


public class GFG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
		    int N = sc.nextInt();
		    int sume = 0, sumo = 0;
		    for(int i=1;i<=N;i++)
		    {
		        if(i%2==0)
		            sume += i;
		        else
		            sumo += i;
		        
		    }
		    System.out.println(sume+" "+sumo);
		    t--;
		}
  sc.close();
	}

}


//code
