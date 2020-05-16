package csci3444.generics;

public class MainEntry 
{
	public static void main(String[] args)
	{
		MyGenInterface<Integer, String> mgi1;
		MyGenInterface<Integer, Integer> mgi2;
		
		mgi1 = new MyGenClass<Integer, String>(1, "Elijah");
		mgi2 = new MyGenClass<Integer, Integer>(1, 2020);
		
		Integer i1;
		Float f1;
		
		i1 = MyRegularClass.getSum(10,  20);
		f1 = MyRegularClass.getSum(100f, 200f);
		
		System.out.println("mgi1 Info: " + mgi1.getKey() + " " + mgi1.getValue());
		System.out.println("mgi2 Info: " + mgi2.getKey() + " " + mgi2.getValue());
		System.out.println("i1 Sume is: " + i1);
		System.out.println("f1 Sume is: " + f1);
				
		
	}	
}