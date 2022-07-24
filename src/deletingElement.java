public class deletingElement {
    static  int findElement(int[] arr,int n,int key)
    {
        for(int i =0;i<n;i++)
        {
            if(arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    static int deleteElement(int[] arr,int n,int key)
    {
        int position = findElement(arr,n,key);
        if(position == -1)
            return n;
        for(int i =position;i<n-1;i++)
        {
            arr[i] = arr[i+1];

        }

        return n-1;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,40,30,50};
        int n = arr.length;
        int key = 40;
        System.out.println("Before Deleting");
        for (int i =0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        n = deleteElement(arr,n,key);

        System.out.println("After Deleting");
        for (int i =0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }



}
