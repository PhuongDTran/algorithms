public interface Queue<E> {
    public boolean add(E element);
    public E poll();
    public E peek();
}
