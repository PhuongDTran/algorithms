public interface Queue<E> {
    public E peek();
    public E poll();
    public boolean add(E element);
}