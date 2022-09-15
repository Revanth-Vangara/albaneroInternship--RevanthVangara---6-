package CountingChar;

import java.util.Scanner;

public class CountingChar {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter any String to be compared");
        String s=scan.nextLine().toLowerCase();

        System.out.println("Enter the character to be checked");
        char c = scan.next().charAt(0);

        int count=0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)==c){
                count++;
            }
        }
        System.out.println(count);
    }
}