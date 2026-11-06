public class SubsetSum {
    public static boolean checkSubset(int[] arr, int targetSum, int currSum, int idx) {
        // base Case
        if (currSum == targetSum) {
            return true;
        }

        if (idx == arr.length || currSum > targetSum) {
            return false;
        }
        // recursive cases
        // 1. recursion to pick
        boolean pick = checkSubset(arr, targetSum, currSum + arr[idx], idx + 1);
        // if pick return true no need skip recursion
        if (pick)
            return true;
        boolean skip = checkSubset(arr, targetSum, currSum, idx + 1);
        return skip;

    }

    public static boolean isSubsetSum(int arr[], int sum) {
        // Base function ko call kiya: starting sum = 0, starting index = 0
        return checkSubset(arr, sum, 0, 0);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 34, 4, 12, 5, 2 };

        System.out.println(isSubsetSum(arr, 38));
    }
}