package CheckingDigits;

import java.util.Scanner;

public class CheckingDigits {
    public static void main(String[] args){
        int count=0;

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter any String to check for digits");
        String s=scan.nextLine();

        for(int i=0;i<s.length();i++){
            if (s.charAt(i)>=0 && s.charAt(i)<=9)
                count++;
        }
        if (count<s.length())
            System.out.println("The Given String contains values other than digits");
        else
            System.out.println("The given string contains purely digits");
    }
}
