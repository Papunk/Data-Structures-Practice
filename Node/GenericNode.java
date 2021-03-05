package Node;


public class GenericNode<T> {
    public T data;
    public GenericNode next;

    public GenericNode(T data) {
        this(data, null);
    }

    public GenericNode(T data, GenericNode next) {
        this.data = data;
        this.next = next;
    }
}
