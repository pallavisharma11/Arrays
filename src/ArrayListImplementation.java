import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListImplementation {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        /*list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.print(list);*/

        for(int i =0;i<5;i++){
            list.add(in.nextInt());
        }

        for(int i =0;i<5;i++){
            System.out.print(list.get(i) +" ");
        }
        System.out.println(" ");

        list.set(2,98);

        System.out.print(list);

        list.remove(1);
        System.out.print(list);

    }
}
