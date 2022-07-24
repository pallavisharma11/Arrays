public class ReverseArray {
    public static void main(String[] args) {
        int[] arrays ={1,2,3,4,5};
        for (int i = 0; i <arrays.length ; i++) {
            System.out.print(arrays[i] +" ");
        }
        System.out.println(" ");
        revesre(arrays,0,4);
        for (int i = 0; i <arrays.length ; i++) {
            System.out.print(arrays[i]+" ");
        }
    }
    //Brute Force
    /*static void revesre(int[] arr,int start,int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }*/

    //Recursive

    static void revesre(int[] arrays,int start,int end){
        if(start>=end){
            return;
        }
        int temp = arrays[start];
        arrays[start] = arrays[end];
        arrays[end] = temp;
        revesre(arrays,start+1,end-1);

    }

}
