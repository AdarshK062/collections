package Adarsh.collections;

import java.lang.instrument.Instrumentation;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 *
 */
public class App 
{
	public  static Instrumentation instrumentation;
	private static final org.apache.logging.log4j.Logger ak =LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
		ImplementationList<Object> il=new ImplementationList<Object>();
		while(true)
		{
			ak.info("Select the options 1.print the list 2.add elements 3.delete paartular position 4.fetch data at position 5.break");
			int s=sc.nextInt();
			if(s==1)
			{
				ak.info(il);
			}
			else if(s==2)
			{
				ak.info("Enter the how many elements u want to add");
				int w=sc.nextInt();
				for(int i=0;i<w;i++)
				{
					il.adding(sc.next());
					
				}
				
				
			}
			else if(s==3)
			{
				ak.info("Enter the position to delete at particualar index");
				int g=sc.nextInt();
				
				
				il.remove(g);
				
			}
			else if (s==4)
			{
				ak.info("Enter the position to fetch the data or acess it");
				int g1=sc.nextInt();
				Object y1=il.getting(g1);
				ak.info(y1);
			}
			else
			{
				break;
			}
			
			
		}
//        System.out.println( "Hello World!" );
    }
}