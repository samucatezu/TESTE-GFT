package ExArray;
import java.util.*;

public class SimpleTesting{
    public static void main(String[] args) {
        int arr[] = new int[] {12,34,45,21,36,4};
        int sum = 0;

        double m=0;
        SimpleTesting obj = new SimpleTesting();
        if(arr == null) {
            System.out.println("The array is null");
        }

        else for(int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            Arrays.sort(arr);
        }


        System.out.println("Menor numero = " + arr[0]);
        System.out.println("Maior numero = " + arr[arr.length-1]);
        System.out.println("Soma de todos os numeros do array = "+sum);
       


    }
}
