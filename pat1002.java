import java.util.*;
import java.text.*;
public class pat1002 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			double[] arr=new double[1043];
			int  sum=sc.nextInt();	
			for(int i=0;i<sum;i++){
				int a=sc.nextInt();
				double b=sc.nextDouble();
				arr[a]+=b;
			}	
		    sum=sc.nextInt();
			for(int i=0;i<sum;i++){
				int a=sc.nextInt();
				double b=sc.nextDouble();
				arr[a]+=b;
			}
		//	DecimalFormat df=new DecimalFormat("#.#");
			int s=0;
	    	for(int i=0;i<1043;i++){
				if(arr[i]!=0.0)  s++;
			}     
			System.out.print(s);
			for(int i=1040;i>=0;i--){    
				if(arr[i]!=0.0)  {
				//	System.out.print(" "+i+" "+df.format(arr[i]));         //wa
					System.out.printf(" %d %.1f",i,arr[i]);
					
					}			
			}
			System.out.println();
		}    
	}
}
