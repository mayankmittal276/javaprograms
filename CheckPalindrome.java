class CheckPalindrome{

	void input(){
		System.out.println("Enter the String ");

		StringBuilder str = new StringBuilder(new java.util.Scanner(System.in).nextLine());

		this.checkPalindrome(str);
	}

	void checkPalindrome(StringBuilder str){
		if(str.toString().toLowerCase().equals((this.reverse(str)).toString().toLowerCase())){
			System.out.println("String is Palindrome");
		}
		else{
			System.out.println("String is not Palindrome");
		}
	}

	StringBuilder reverse(StringBuilder str){
		StringBuilder reverse = new StringBuilder("");

		for(int i = str.length() - 1;i >= 0;i--){
			reverse.append(str.charAt(i));
		}
		return reverse;
	}

	public static void main(String[] args) {
		new CheckPalindrome().input();
	}
}