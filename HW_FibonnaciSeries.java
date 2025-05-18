package week2day2_homework;

public class HW_FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int fibnumber=8;
	int number1=0;
	int number2=1;
	
	System.out.println(number1+"\n"+number2);
	for (int i=2; i<=fibnumber; i++)
	{
	int number3=number1+number2;
	System.out.println(number3);
	number1=number2;
	number2=number3;

	}

	}

	}

