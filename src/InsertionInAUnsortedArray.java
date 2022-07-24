public class InsertionInAUnsortedArray {
    static int insert(int[] arr,int n,int key,int capacity)
    {

        if(n>=capacity)
            return n;
        arr[n] = key;
        return (n+1);
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 5;
        arr[4] = 4;
        arr[5] = 6;

        int n =6;
        int key = 7;
        int capacity = 10;
        System.out.println("before insertion");
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        n = insert(arr,n,key,capacity);
        System.out.println("after insertion");
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
