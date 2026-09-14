
public class segrigate0sAnd1s {

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1};

        // Writing logic to seprate zeroes and 1s (such that all 0s at starting adn 1s at the end of the array 
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            } else {
                // swap element at left and element at right 
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        print(arr);

    }
}
