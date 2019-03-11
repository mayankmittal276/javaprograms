class CalculateAddition{
	public static void main(String[] args){

		java.util.Scanner scan=new java.util.Scanner(System.in);

		//Ask the user to enter no's
		System.out.println("Please enter two numbers");

		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();

		//Call add()
		int result = new CalculateAddition().add(firstNum,secondNum);

		//Display the result
		System.out.println("Addition of two numbers entered is : "+result);
	}

	int add(int firstNum,int secondNum){
		
		//Add the numbers
		int result = firstNum + secondNum;

		//Returning the result
		return result;
	}
}