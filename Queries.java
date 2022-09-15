package Queries;
import java.util.Arrays;
import java.util.Scanner;

public class Queries {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number of elements in the String array");
        int str=scan.nextInt();
        scan.nextLine();

        String[] s= new String[str];

        System.out.println("Enter the elements in the String array");
        for(int i=0;i<str;i++) {
            s[i]=(scan.nextLine());
        }
        System.out.println("String Elements are : \n"+Arrays.toString(s));

        System.out.println("Enter the number of elements in the Queries array");
        int query=scan.nextInt();
        scan.nextLine();

        String[] q=new String[query];
        int[] out=new int[query];

        System.out.println("Enter the elements in the queries array");
        for(int i=0;i<query;i++){
            q[i]=(scan.nextLine());
        }
        System.out.println("Query Elements are : \n"+Arrays.toString(q));


        for(int i=0;i<query;i++){
            int count=0;
            for(int j=0;j<str;j++) {
                if (q[i].equals(s[j])) {
                    count++;
                }
            }
            out[i]=count;
        }
        System.out.println(Arrays.toString(out));
    }
}
