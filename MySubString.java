import java.util.Scanner;
class MySubString{
	
	StringBuilder str;

	StringBuilder mySubString(int starting,int ending){
		StringBuilder substr = new StringBuilder("");
		for(int i = starting;i<= ending-1;i++){
			substr.append(this.str.charAt(i));
		}
		return substr;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string...");
		StringBuilder string = new StringBuilder(scan.nextLine());
		MySubString obj = new MySubString();
		obj.str=string;
		System.out.println("Enter the Starting Substring Index");
		int starting = scan.nextInt();
		System.out.println("Enter the Ending Substring Index");
		int ending = scan.nextInt();
		StringBuilder substring = obj.mySubString(starting,ending);
		System.out.println("Your Substring is: "+substring);
	}

}