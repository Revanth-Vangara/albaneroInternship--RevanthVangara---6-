package Shifting;
import java.util.Arrays;
import java.util.Scanner;

public class Shifting {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number of elements in the Array");
        int a=scan.nextInt();

        int arr1[]=new int[a];

        System.out.println("Enter the elements in the Array");
        for(int i=0;i<a;i++) {
            arr1[i]=(scan.nextInt());
        }
        System.out.println("Elements in the array before rotating "+Arrays.toString(arr1));

        System.out.println("Enter the number of times the Array is to be rotated");
        int d=scan.nextInt();


        int c = d % a;

        for (int i = 0; i < c; i++) {
            int num1 = arr1[0];

            for (int j =0; j < a-1; j++) {
                arr1[j]=arr1[j+1];
            }
            arr1[a-1]=num1;

        }
        System.out.println(Arrays.toString(arr1));
    }
}

