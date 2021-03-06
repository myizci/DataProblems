public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }

        System.out.println(binarySearchIterative(arr,4));
    }

    public static int binarySearchIterative(int[] array, int data){

        int left =0;
        int right = array.length-1;

        while(left<=right){
            int middle = (left+right)/2;

            if(array[middle]==data) return middle;
            if(data<array[middle]) right=array[middle-1];
            else left=middle+1;
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] array, int data){

        return  binarySearchRecursive(array,data, 0, array.length-1);

        }
        public static int binarySearchRecursive(int[] array, int data, int left, int right){
       if(right<left) return -1;
            int middle = (left+right)/2;
            if(array[middle]==data) return middle;
            if(data<array[middle]) return binarySearchRecursive(array, data, left, middle-1);
            else return binarySearchRecursive(array, data, middle+1, right);
    }
}
