class CheckNumberIncrease{

	boolean check = true;

	boolean checkNumber(int num){
		
		while(num != 0)
		{
			int lastTemp = num % 10;
			num = num / 10;
			int secondLastTemp = num % 10;
			if(secondLastTemp <= lastTemp)
			{
				continue;
			}
			else
			{
				this.check = false;
				break;
			}
		}
		return this.check;
	}

	void input(){
		System.out.println("Enter the number for the difference");

		int num = new java.util.Scanner(System.in).nextInt();

		this.check = this.checkNumber(num);

		this.display(check);
	}

	void display(boolean checkValue){

		if(checkValue == true)
		{
			System.out.println("Number is Increasing");
		}
		else{
			System.out.println("Number is not Increasing");
		}
	}

	public static void main(String[] args) {
		new CheckNumberIncrease().input();
	}
}