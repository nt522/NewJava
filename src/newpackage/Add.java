package newpackage;

public class Add {

	public static void main(String[] args) {
		
		//0,1,2,56,-1,-9 == integers
		//87.89==decimal/float/double
		
		
		int number1=30;
		
		int number2=70;
		
		int result =number1+number2;
		System.out.println(result);
		System.out.println("the sum of two numbers is "+ result);
		
		
		//float,double
		
		int x=25;
		int y=6;
		int z=x+y;
		float average=(float)z/2;
		
		System.out.println("average is "+average);
		
		
		//double number1=3987.78;, float number2=456.8f; 
		float no1=345.78f; //rhs without f will be treated as double
		double no2=345.78f; //assignment of floating point number to double
		
		double number3=34.98;
		
		
		//boolean== it can store only true or false
		
		boolean isMale=true;
		//boolean isMale=false;
		
		
		//string
		String name="Nawal"; //Strings are always in double quote
		//string name2=nawal;//error
		String s2="10"; //here 10 will be treated as string as it is inside double quote 
		
		
		
	}

}
