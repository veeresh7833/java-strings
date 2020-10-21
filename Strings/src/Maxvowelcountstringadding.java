	import java.util.*;
	public class Maxvowelcountstringadding {
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	StringBuffer sb=new StringBuffer();
	String s=sc.nextLine();
	String [] str=s.split(" ");
	int[] sm=new int[100];
	int k=0,max=0,z=-1;
	for(String st:str)
	{
		z++;
	int c=0;
	for(int i=0;i<st.length();i++)
	{
	if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u')
	{
	c++;
	}
	if(c>max)
	{
	max=c;
	sm[z]=c;
	}
	}
	}
	int f=0;
	String lf="";
	for(int i=0;i<str.length;i++)
	{
	if(sm[i]==max)
	{
	if(f==0)
	{
	 lf=sb.substring(0,(str[i].length()/2)-1);
	f=1;
	}
	else
	{
	 lf=sb.substring((str[i].length()/2)-1,str[i].length()-1);
	f=0;
	}
	}
	sb.append(lf);
	}
	System.out.println(sb);
	}
	}
