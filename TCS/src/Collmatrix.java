	import java.util.*;
	public class Collmatrix {
		public static void main(String[] args) 
		{
			//initializing scanner class
		    Scanner sc=new Scanner(System.in);
		    //scanning n value
		  int n=sc.nextInt();
		  //Arraylist intialisation
		  ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			int m=sc.nextInt();
			list.add(m);
		}
		int z=sc.nextInt();
		int money=0;
		int sk=0;
		if(list.get(list.size()-1)<0)
		{
			money=-1;
		}
		else
		{
			for(int i:list)
			{
				if(sk>z)
				{
					money=-1;
					break;
				}
				else
				{
					if(i<0)
					{
						sk+=i;
						continue;	
					}
					money=money+i;
				}
				
				
			}
		}
		//printing cost
		System.out.println(money);
		    }
		}