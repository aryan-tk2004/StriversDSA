//Brute Force Approach
class Solution {
    public static int largest(int[] arr) {
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        return largest;
    }
}

//Optimal Solution
class Solution {
    public static int largest(int[] arr) {
        int largest = arr[0];
        for (int i = 0;i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}

