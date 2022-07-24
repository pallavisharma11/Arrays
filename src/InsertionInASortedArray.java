public class InsertionInASortedArray {
    static int insertElement(int[] arr,int n ,int key,int capacity)
    {
        if(n>=capacity)
            return n;
        int i =0;
        for (i =n-1;(i>0 && arr[i]>key) ;i--) {
            arr[i + 1] = arr[i];

        }
        arr[i+1] = key;
        return n+1;
    }
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 28;
        arr[4] = 32;
        arr[5] = 36;
        int n = 6;
        int capacity = 20;
        int key = 24;
        System.out.println("Before Insertion");
        for (int i =0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        n = insertElement(arr,n,key,capacity);
        System.out.println("After Insertion");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
