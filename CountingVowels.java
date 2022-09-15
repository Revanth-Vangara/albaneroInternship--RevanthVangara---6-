package CountingVowels;

import java.util.Scanner;

public class CountingVowels {
    public static void main(String[] args){
        int vowel=0,consonant=0,other=0;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter any String to be compared");
        String s=scan.nextLine().toLowerCase();

        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            int a=x;
            if((a>=65 && a<=90) || (a>=97 && a<=122)){
                if ((x=='a') || (x=='e')||(x=='i')||(x=='o')||(x=='u') )
                    vowel++;
                else
                    consonant++;
            }
            else other++;
        }
        System.out.print("Vowels : "+vowel+"\nConsonants : "+consonant+"\nOthers: "+other);
    }
}
