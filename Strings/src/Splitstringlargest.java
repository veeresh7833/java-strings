import java.util.*;
public class Splitstringlargest {
	public static  int larstr(String input1)
	{
	String[] arr=input1.split(" ");
	int k=arr.length;
	String s="";
	int max=arr[0].length();
	for(String q:arr)
	{
		if(max<q.length())
		{
			max=q.length();
			s=q;
		}
	}
	System.out.println("max string:"+s);
	return max;
}
	

 public static void main(String [] args)
 {
	 int len=larstr("i am veresh and i am very very good nbshdfghjjdk");
	 System.out.println(len);	 
 }
}
