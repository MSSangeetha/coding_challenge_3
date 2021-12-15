import java.util.Arrays;
import java.util.Scanner;

public class Coding_Challenge_3 {
    public static String compare(String str1, String str2){
        if(str1.length()>str2.length()){
            return str1;
        }
        else if (str1.length() == str2.length()){
            return str1;
        }
        else{
            return str2;
        }
    }

    public static void main(String[] args) {
        // write your code here
        String splitWord;

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the Sentance: ");
//        splitWord = input.next();
        splitWord = input.nextLine();

        String[] splitting = splitWord.split(" ");

        System.out.println("The splitted Strings are " + Arrays.toString(splitting));
        String longest = "";
        for(int i=0;i<splitting.length;i++){

            longest = compare(longest,splitting[i]);

        }
        System.out.println("The longest word in the sentance is " +  longest);
        System.out.println(longest);


//        String longest = Arrays.stream(splitting).max(Comparator.comparingInt(String::length)).orElse(null);




    }
}

