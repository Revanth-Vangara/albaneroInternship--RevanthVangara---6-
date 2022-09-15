package DelDuplicate;

import java.util.Scanner;

public class DelDuplicate {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter any String to be Checked");
        String s=scan.nextLine().toLowerCase();

        int len=s.length();
        String s2="";

        int k=0;
        for (int i=0;i<s.length();i++){
            int count=0;
                for(int j=0;j<s.length();j++) {
                    if (i!=j && (s.charAt(i) == s.charAt(j))){
                        count++ ; }
                    }
                if(count==0) {s2+=s.charAt(i);
                }}
        System.out.println(s2);
    }
}