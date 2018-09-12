import java.util.*;
public class pat1005 {
	public static void main(String[] args) {
		 String[] s=new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
		 Scanner sc=new Scanner(System.in);
		 while(sc.hasNext()){
			 String str=sc.next();
			 char[] arr=str.toCharArray();
			 int sum=0;
			 for(int i=0;i<arr.length;i++){
				   sum+=arr[i]-48;                                    
			 }	 
			char[] ans=String.valueOf(sum).toCharArray();	
			 for(int i=0;i<ans.length;i++){
				  System.out.print(s[ans[i]-48]);
				  if(i!=ans.length-1)   System.out.print(" ");
				  else   System.out.println();
			 }		
		 }
	}
}
