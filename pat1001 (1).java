import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.*;
public class Test1 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
				long a=sc.nextLong();
				long b=sc.nextLong();
				long sum=a+b;
		   //   NumberFormat num=NumberFormat.getInstance();       //自动设置格式
			    NumberFormat num=new DecimalFormat("###,###");     //手动设置格式
		        System.out.println(num.format(sum));
		}
	
	}
}
