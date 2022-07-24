import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arrays = new int[3][3];

        /*for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                arrays[i][j]=sc.nextInt();
            }
        }

        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                System.out.print(arrays[i][j]);
            }
            System.out.println(" ");
        }*/


        //if array has different number of element
        for(int i =0;i<arrays.length;i++){
            for(int j =0;j<arrays[i].length;j++)
            {
                arrays[i][j]=sc.nextInt();
            }
        }


        /*for(int i =0;i< arrays.length;i++){
            for(int j =0;j<arrays[i].length;j++){
                System.out.print(arrays[i][j] +" ");
            }
            System.out.println(" ");
        }*/

        //Displaying using toString method
        for(int i =0;i<arrays.length;i++){
            System.out.print(Arrays.toString(arrays[i]));
        }


    }
}
