package DSA;

public class ArraySearch {
    static int search(int arr[], int n, int key) {
        for(int i=0; i<n; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5,1,3,4,2,6};
        int n = arr.length;
        int key = 19;
        
        int ans = search(arr, n, key);
        if(ans == -1) 
            System.out.println("Ele not found");
        else 
            System.out.println("Ele found at " + (ans+1));
    }
}
