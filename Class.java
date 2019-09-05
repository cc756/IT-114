package test;
import java.util.Date;

public class Class {
	public int pubInt;
	private int privInt;
	protected int protInt;
	
	public String myString;
	public char myChar;
	public Date myDate;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class myObject=new Class();
		myObject.pubInt=1;
		System.out.println(myObject.pubInt);
	}

}