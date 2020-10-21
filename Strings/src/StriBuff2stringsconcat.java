import java.util.*;
public class StriBuff2stringsconcat {
public static void main( String [] args)
{
Scanner sc=new Scanner(System.in);
StringBuffer sb=new StringBuffer(sc.next());
StringBuffer b=new StringBuffer(sc.next());
int sbl=sb.length();
int bl=b.length();
if(sbl==bl)
{
	System.out.println("wont ppossible");
}
else
{
	if(sbl>bl)
	{
		sb=sb.insert(0,b);
		sb=sb.append(b);
	}
	else
	{
		b=b.insert(0,sb);
		b=b.append(sb);
		sb=b;
	}
	System.out.println(sb);
}
}
}
