//Second Largest
class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = arr[0];
        int second = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            }
            if (arr[i] > second && arr[i] < largest) {
                second = arr[i];
            }
        }
        return second;
    }
}
