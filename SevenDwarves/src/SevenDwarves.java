public class SevenDwarves {

	public static void main(String[] args) {
		int num1=60,num2=1,num3=4,num4=5,num5=15,num6=8,num7=7,num8=16,num9=2;
		//check num1
		if(num8+num9+num3+num4+num5+num6+num7 == 100)
			System.out.println("num1,num2 Is Fake");
		if(num8+num2+num9+num4+num5+num6+num7 == 100)
			System.out.println("num1,num3 Is Fake");
		if(num8+num2+num3+num9+num5+num6+num7 == 100)
			System.out.println("num1,num4 Is Fake");
		if(num8+num2+num3+num4+num9+num6+num7 == 100)
			System.out.println("num1,num5 Is Fake");
		if(num8+num2+num3+num4+num9+num9+num7 == 100)
			System.out.println("num1,num6 Is Fake");
		if(num8+num2+num3+num4+num5+num6+num9 == 100)
			System.out.println("num1,num7 Is Fake");
		if(num7+num2+num3+num4+num5+num6+num9 == 100)
			System.out.println("num1,num8 Is Fake");
		if(num7+num2+num3+num4+num5+num6+num8 == 100)
			System.out.println("num1,num9 Is Fake");
		if(num7+num2+num3+num4+num5+num6+num8 == 100)
			System.out.println("num1,num9 Is Fake");
		//check num2
		if(num1+num8+num9+num4+num5+num6+num7 == 100)
			System.out.println("num2,num3 Is Fake");
		if(num1+num8+num3+num9+num5+num6+num7 == 100)
			System.out.println("num2,num4 Is Fake");
		if(num1+num8+num3+num9+num9+num6+num7 == 100)
			System.out.println("num2,num5 Is Fake");
		if(num1+num8+num3+num4+num9+num9+num7 == 100)
			System.out.println("num2,num6 Is Fake");
		if(num1+num8+num3+num4+num9+num9+num9 == 100)
			System.out.println("num2,num7 Is Fake");
		if(num1+num9+num3+num4+num5+num6+num7 == 100)
			System.out.println("num2,num8 Is Fake");
		if(num1+num8+num3+num4+num5+num6+num7 == 100)
			System.out.println("num2,num9 Is Fake");
		//check num3
		if(num1+num2+num8+num9+num5+num6+num7 == 100)
			System.out.println("num3,num4 Is Fake");
		if(num1+num2+num8+num9+num5+num6+num7 == 100)
			System.out.println("num3,num5 Is Fake");
		if(num1+num2+num8+num4+num5+num9+num7 == 100)
			System.out.println("num3,num6 Is Fake");
		if(num1+num2+num8+num4+num5+num6+num9 == 100)
			System.out.println("num3,num7 Is Fake");
		if(num1+num2+num7+num4+num5+num6+num9 == 100)
			System.out.println("num3,num8 Is Fake");
		if(num1+num9+num8+num4+num5+num6+num7 == 100)
			System.out.println("num3,num9 Is Fake");
		//check num4
		if(num1+num2+num3+num8+num9+num6+num7 == 100)
			System.out.println("num4,num5 Is Fake");
		if(num1+num2+num3+num8+num5+num9+num7 == 100)
			System.out.println("num4,num6 Is Fake");
		if(num1+num2+num3+num8+num5+num6+num9 == 100)
			System.out.println("num4,num7 Is Fake");
		if(num1+num2+num3+num7+num5+num6+num9 == 100)
			System.out.println("num4,num8 Is Fake");
		if(num1+num2+num3+num8+num5+num6+num7 == 100)
			System.out.println("num4,num9 Is Fake");
		//check num5
		if(num1+num2+num3+num4+num8+num9+num7 == 100)
			System.out.println("num5,num6 Is Fake");
		if(num1+num2+num3+num4+num8+num6+num9 == 100)
			System.out.println("num5,num7 Is Fake");
		if(num1+num2+num3+num4+num7+num6+num9 == 100)
			System.out.println("num5,num8 Is Fake");
		if(num1+num2+num3+num4+num8+num6+num7 == 100)
			System.out.println("num5,num9 Is Fake");
		//check num6
		if(num1+num2+num3+num4+num5+num8+num9 == 100)
			System.out.println("num6,num7 Is Fake");
		if(num1+num2+num3+num4+num5+num7+num9 == 100)
			System.out.println("num6,num8 Is Fake");
		if(num1+num2+num3+num4+num5+num7+num8 == 100)
			System.out.println("num6,num9 Is Fake");
		//check num7
		if(num1+num2+num3+num4+num5+num6+num9 == 100)
			System.out.println("num7,num8 Is Fake");
		if(num1+num2+num3+num4+num5+num8+num6 == 100)
			System.out.println("num7,num9 Is Fake");
		//check num8,9
		if(num1+num2+num3+num4+num5+num6+num7 == 100)
			System.out.println("num8,num9 Is Fake");
	}

}