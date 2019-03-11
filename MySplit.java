import java.util.Scanner;
import java.util.Vector;
class MySplit{

    String inputString(){

        System.out.println("Enter a String.....");
        String str = new Scanner(System.in).nextLine();
        return str;

    }

    String delim(){

        System.out.println("Enter a string through which you want to split the string");
        String str = new Scanner(System.in).nextLine();
        return str;

    }

    //Splitting the string
    void splitString(String str, String del)
    {
        String []result = new String[str.length()];

        int start = 0, j = 0;
        int pos = str.indexOf(del);

        while (pos >= start) {
        if (pos > start) {
            result[j] = str.substring(start,pos);
        }

        start = pos + del.length();
        pos = str.indexOf(del,start);
        j++; 
        }

        if (start<str.length()) {
        result[j] = str.substring(start);
        }

        String[] array = result;

        this.display(array);
    }

    //Display the result
    void display(String[] array){

        for(String var: array)
        {
           if(var == null)
              break;
        System.out.println(var);
        }

    }

    public static void main(String[] args) {

        MySplit spl = new MySplit();

        //Asking user to enter a string input

        String inputstring = spl.inputString();

        //Asking user to enter the element through which the string is to splitted

        String splitter = spl.delim();

        System.out.println("Answer after splitting ...");

        spl.splitString(inputstring, splitter);
        
    }
}