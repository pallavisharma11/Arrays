public class BinarySearch {
    static int binarySeach(int[] arr,int low,int high,int key){
        if(high<low)
            return -1;
        int mid = (low + high)/2;
        if(key == arr[mid])
        {
            return mid;
        }
        if(key > arr[mid])
        {
            return binarySeach(arr,mid+1,high,key);
        }
        return binarySeach(arr,low,mid-1,key);
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length-1;
        int key = 70;
        System.out.println("index : " + binarySeach(arr,0,n,key));
    }
}
