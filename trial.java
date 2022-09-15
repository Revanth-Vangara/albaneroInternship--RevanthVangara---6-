package trial;
import java.util.Scanner;

public class Trial {
    public static void main(String[] args){
        System.out.println("Enter the number of digits to be inserted");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for (int i=0;i<n;i++) {
            System.out.print("Enter the number at index "+i+"\n");
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=a[n-i-1];
        }
        for(int j:b){
            System.out.print(j);
        }
    }
}
