package lesson22;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr={11,13,15,25,57,79,92};
        int find=92;
         search(arr,find);
    }
    public static void search(int[]arr,int find){
        int high=arr.length-1;
        int low=0;
        int step=0;
        for (int i = 0; i <= high; i++) {
            int mid = (low + high) / 2;
            if (arr[mid] == find) {
                step++;
                System.out.println(step+" "+mid);
                break;
            } else if (arr[mid] < find) {
                step++;
                low = mid + 1;
            } else {
                step++;
                high = mid - 1;
            }
        }

    }
}
