package interviewprograms;

public class SinglyLinkedListReverse<T> {


    private Node<T> head;

    public static void main(String[] args) {
        SinglyLinkedListReverse<Integer> list = new SinglyLinkedListReverse<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.traverse();
        list.reverse();
        list.traverse();
    }

    private void reverse() {
        Node<T> next = null;
        Node<T> previous = null;
        Node<T> current = head;
        while(current!=null){
            next = current.nextRef;
            current.nextRef = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    private void traverse() {
        Node<T> temp = head;
        while(true){
            if(temp==null) break;
            System.out.println(temp.value);
            temp = temp.nextRef;
        }
    }

    private void add(T i) {
        Node<T> item = new Node<>();
        item.value = i;
        Node<T> temp = head;
        while(true){
            if(temp == null) {
                head = item;
                break;
            }
            else if(temp.nextRef == null) {
                temp.nextRef = item;
                break;
            }
            else temp = temp.nextRef;
        }
    }




    class Node<T> {
        T value;
        Node<T> nextRef;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNextRef() {
            return nextRef;
        }

        public void setNextRef(Node<T> nextRef) {
            this.nextRef = nextRef;
        }



    }
}
