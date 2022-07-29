public class QueueUsingArray implements Queue<Integer> {
    private int[] arr;
    private int size;

    public QueueUsingArray(){
        arr = new int[10];
        size = 0;
    }

    @Override
    public boolean add(Integer element) {
        return false;
    }

    @Override
    public Integer poll() {
        return null;
    }

    @Override
    public Integer peek() {
        return null;
    }
}
