package com.maven;

/**
 * Hello world!
 *
 */
public class App2 
{
	public int add(int x,int y)
	{
		return x+y;
	}
    public static void main( String[] args )
    {
        System.out.println( "\n\t*****************\n\tHello World!" );
		App2 a=new App2();
		int c=a.add(10,20);
		int expected=30;
		// System.out.println( "\n\t***Addition is: "+c);
		Assert.assertEuals("Result: ",expected,actual);
 System.out.println( "\n\t*****************");
    }
}
