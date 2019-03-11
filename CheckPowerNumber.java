class CheckPowerNumber{

	boolean check;
	//Checking the number
	boolean checkNumber(int num){

		if(Math.ceil(Math.log(num)/Math.log(2)) == Math.floor(Math.log(num)/Math.log(2))){
			this.check = true;
		}
		return this.check;
	}
	//Taking the input
	void input(){
		System.out.println("Enter the number ");

		int num = new java.util.Scanner(System.in).nextInt();

		this.check = this.checkNumber(num);

		this.display(check);
	}
	//Diplaying the output
	void display(boolean checkValue){

		if(checkValue == true)
		{
			System.out.println("Number is Power of 2");
		}
		else{
			System.out.println("Number is not Power of 2");
		}
	}

	public static void main(String[] args) {
		new CheckPowerNumber().input();
	}
}