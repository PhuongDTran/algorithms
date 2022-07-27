public class BinarySearch {
    private int[] array;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    public int search(int target) {
        return searchHelper(target, 0, array.length - 1);
    }

    private int searchHelper(int target, int start, int end) {
        // not found
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (array[mid] == target) {
            return mid;
        }
        if (array[mid] < target) {
            return searchHelper(target, mid + 1, end);
        }
        return searchHelper(target, start, mid - 1);
    }
}
