package week2day2_homework;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=1251; 
int output = 0;
for (int i =input; i>0; i=i/10)
{
	int rem=i%10;
	 output=output*10+rem;
}
	if (input==output)
	{
		System.out.println("It is palindrome");
	}
	else
	{
		System.out.println("Not a palindrome");
	}
}
	}


