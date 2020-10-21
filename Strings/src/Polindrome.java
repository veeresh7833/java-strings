import java.util.*;
public class Polindrome 
{
  public static void main(String [] args)
  {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int i=0;
	int j=s.length()-1;
	int temp=0;
	while(j>i)
	{
	if(s.charAt(i)!=s.charAt(j))
	{
		temp=1;
		break;
	}
	i++;
	j--;
	}
	if(temp==1)
	{
		System.out.println("Not a polindrome");
	}
	else
	{
		System.out.println("polindrome number");	
	}
  }
}
