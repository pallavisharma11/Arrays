public class SearchInArray {

    static int findKey(int[] arr,int n ,int key)
    {
        for(int i =0;i<n;i++)
            if(arr[i] == key)
            {
                return i;
            }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,6,3,5};
        int n = arr.length;

        int key = 3;
        int position = findKey(arr,n,key);
        if(position == -1)
        {
            System.out.println("key not found");

        }
        else
        {
            System.out.println("element found at index "+position);
        }
    }
}
