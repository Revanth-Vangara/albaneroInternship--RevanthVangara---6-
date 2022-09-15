package MaxOccurringCharacter;

import java.util.Scanner;

public class MaxOccurringCharacter {

    public static void main(String[] args){

        int max=0,index=0;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter any String to give the Maximum Occurring Character");
        String a=scan.nextLine().toLowerCase();

        for(int i=0;i<a.length();i++){
            int count = 0, k=0;
            for(int j=0;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j)){
                    count++;
                }
                if (count>=max){
                    index=i;
                    max=count;

                }
            }
        }
        System.out.println("Maximum Occurring Character of the given String : \n" + a.charAt(index));
    }
}
