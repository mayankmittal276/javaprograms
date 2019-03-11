class CheckVowels{

	void input(){
		System.out.println("Enter the String ");

		StringBuilder str = new StringBuilder(new java.util.Scanner(System.in).nextLine());

		this.checkVowels(str);
	}

	void checkVowels(StringBuilder str){
		int flag = 0;
		for(int i=0;i<=str.length()-1;i++){
			if(str.charAt(i) == 'a'|str.charAt(i) == 'e'|str.charAt(i) == 'i'|str.charAt(i) == 'o'|str.charAt(i) == 'u'){
				flag++;
			}
		}
		this.display(flag);
	}

	void display(int flag){
		if(flag>0){
			System.out.println("String has vowels and its numbers is : "+flag);
		}
		else{
			System.out.println("String does not have any vowels in it...");
		}
	}

	public static void main(String[] args) {
		new CheckVowels().input();
	}
}