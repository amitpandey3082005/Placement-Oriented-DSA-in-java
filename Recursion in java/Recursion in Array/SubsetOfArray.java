import java.util.ArrayList;

class SubsetOfArray {
    // Helper function to find all actual subsets
    public static void findSubsets(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> current, int[] arr,
            int idx) {
 
        if (idx == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(arr[idx]); // Add element to the temporary list
        findSubsets(result, current, arr, idx + 1); // Move to next index


        current.remove(current.size() - 1); // Remove the last added element
        findSubsets(result, current, arr, idx + 1); // Move to next index
    }

    // Main function to return all subsets
    public static ArrayList<ArrayList<Integer>> getAllSubsets(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();

        findSubsets(result, current, arr, 0); // Start recursion from index 0
        return result;
    }

    // Main method to test and print the subsets
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        ArrayList<ArrayList<Integer>> allSubsets = getAllSubsets(arr);

        System.out.println("Subsets are: " + allSubsets);
    }
}
