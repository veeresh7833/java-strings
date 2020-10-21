import java.util.*;
import java.io.*;
import java.lang.*;
public class Wordspeciallargestwordcount {
public static void main(String [] args)
{
	try
	{
	FileInputStream fis=new FileInputStream(new File("sample2.txt"));
	int nw=0;
	int nl=0;
	int sy=0;
	String larword="";
	Scanner sc=new Scanner(fis);
	while(sc.hasNextLine())
	{
		String s1=sc.nextLine();
		String [] str=s1.split(" ");
		nw+=str.length;
		nl++;
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length()>larword.length())
			{
				larword=str[i];
			}
			for(int j=0;j<str[i].length();j++)
			{
				if(str[i].charAt(j)=='!'||str[i].charAt(j)=='@'||str[i].charAt(j)=='#'||str[i].charAt(j)=='%'||str[i].charAt(j)=='$'||str[i].charAt(j)=='^'||str[i].charAt(j)=='&'||str[i].charAt(j)=='*'||str[i].charAt(j)=='('||str[i].charAt(j)==')'||str[i].charAt(j)=='?')
				{
					sy++;
				}
			}
		}
	}
	System.out.println(nw+" "+nl+" "+sy);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
}
