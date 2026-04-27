public class Node<T> {

    private T value;
    private Node<T> next;

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return   this.value + "->" + this.next;

    }

    public boolean hasNext (){
        return next!=null;
    }

    public void add(T value){
        Node<T> p = this;
        while(p.hasNext())
            p = p.getNext();
        p.setNext(new Node<>(value));
    }
}
