import java.util.Scanner;
class SumNaturalNumbers{

	//Calculate sum
	void calculateSum(int n){

		int sum = 0;
		
		for(int value = 3;value <= n;value++)
		{
			if(value % 3 == 0 | value % 5 == 0)
			{
				sum += value;
			}
			else{
				continue;
			}
		}
		this.display(sum,n);
	}

	//Ask for the input of Number
	void input(){
		System.out.println("Enter the number n : ");
		int n = new Scanner(System.in).nextInt();
		if(n<3){
			System.out.println("Please enter value greater than 3");
			this.input();
		}else{
			this.calculateSum(n);
		}
	}

	//Display the result
	void display(int sum,int n){
		System.out.println("The sum of first "+n+" Natural numbers is : "+sum);
	}

	public static void main(String[] args) {
		new SumNaturalNumbers().input();
	}
}