package gr.aueb.cf.cf9.ch17.singly_linked_list;

public class SigleList <T> {
    private Node<T> head = null;

    public void insertFirst(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);
        head = tmp;
    }

    public void insertLast(T t) {
        Node<T> TMP = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);

        if (is Empty()){
            insertFirst(t);
            return;
        }
        Node<T> n;
        for (n = head; n.getNext() != null; n = n.getNext()) ;
        n.setNext(tmp);

    }

    public Node<T> removeFirst() {
        if (isEmpty()) return null;
        Node<T> tmp = head;
        head = head.getNext();
        return tmp;

    }

    public Node<T> removeLast() {
        if (isEmpty() || head.getNext() == null) {
            return removeFirst();
        }
        Node<T> n;
        for (n = head; n.getNext().getNext() != null; n = n.getNext()) {

        }
        Node<T> nodeToReturn = n.getNext();
        n.setNext(null)
        return nodeToReturn;


        }


        public boolean isEmpty {
            return head == null;
        }
    }
}
