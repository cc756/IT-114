package test;
import java.util.*;

public class Class {
	public int pubInt;
	private int privInt;
	protected int protInt;
	
	public String myString;
	public char myChar;
	public Date myDate;
	public static void main(String[] args) {
		
		/**Class myObject=new Class();
		myObject.pubInt=1;
		System.out.println(myObject.pubInt);**/
		
		List<String> myStrings=new ArrayList<String>();
		String[] stringArray=new String[3];
		
		
		myStrings.add("Hi");
		myStrings.add("Bye");
		myStrings.add("Hi again");
		myStrings.add("And I'm still here");
		myStrings.add("See you tomorrow");
		// TODO make this sort alphabetically
		Collections.sort(myStrings);
		//TODO reverse alphabetical order
		//TODO shuffle
		Collections.shuffle(myStrings);
		//TODO create list of int, each index has a value of its index
		//sum and show result (size of 10)
		List<Integer> myInts=new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			myInts.add(i);
		}
		int total=0;
		for(int i=0; i<myInts.size(); i++)
		{
			total+=myInts.get(i);
		}
		System.out.println("My total: "+total);
		
		//TODO using the integer list, print the value and if it is odd or even
		for(int i=0; i<myInts.size(); i++) {
			System.out.print("The number is "+i+" and it is ");
			if(i%2==0)
				System.out.println("even");
			else
				System.out.println("odd");
		}
		
		/**
		stringArray[0]="Hi";
		stringArray[1]="Bye";
		stringArray[2]="Hi again";
		
		
		String temp=stringArray[2];
		stringArray[2]=stringArray[0];
		stringArray[0]=temp;
		
		myStrings.add(1);
		int myInt=1;
		String testString=myInt+"";
		if(testString.equals(myInt))
			System.out.println("testString=myInt");
		else
			System.out.println("testString!=myInt");
		
		myStrings.set(2, "It's me");
		
		int size=myStrings.size();
		for(int i=0; i<size; i++)
			if(i==1)
				myStrings.remove(i);
		*/
		for(int i=0; i<myStrings.size(); i++)
			System.out.println("Index["+i+"] is "+myStrings.get(i));
			//System.out.println("Array Index["+i+"] is "+stringArray[i]);
	}

}