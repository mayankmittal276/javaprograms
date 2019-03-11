class CalculateDifference{

	void calculateDifference(int n){

		int diff = 0;
		int squaresSum = (n * (n +1) * (2 * n + 1))/6;
		int sumSquares = (n * (n + 1))/2;

		diff = squaresSum - (sumSquares * sumSquares);

		this.display(diff,n);
	}

	void input(){
		System.out.println("Enter the number for the difference");

		int n = new java.util.Scanner(System.in).nextInt();

		this.calculateDifference(n);
	}

	void display(int diff, int n){
		System.out.println("Difference of between the sum of squares and square of the sum of the first "+n+" natural numbers is: "+diff);
	}

	public static void main(String[] args) {
		new CalculateDifference().input();
	}
}