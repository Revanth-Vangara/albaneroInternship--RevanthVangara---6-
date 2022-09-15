package RemovingGIvenChar;

import java.util.Scanner;

public class RemovingGIvenChar {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter any String to be compared");
        String s=scan.nextLine();
        String e="",g="";
        int f;

        System.out.println("Enter any Char to be replaced");
        char c=scan.next().charAt(0);


        if (c>64 && c<91){
            f=c+32;
            e+=(char)f;
            g+=c;
            s=s.replace(e,"");
            s=s.replace(g,"");
        }
        if (c>96 && c<123){
            f=c-32;
            e+=(char)f;
            g+=c;
            s=s.replace(e,"");
            s=s.replace(g,"");
        }
        else {
            e+=c;
            s=s.replace(e,"");
        }
        System.out.print(s);

    }
}
