package linkedlist;

public class SingleLinkedList<E> {

    private Node<E> first;

    private static class Node<E> {
        private E element;
        private Node<E> next;

        Node(E element) {
            this.element = element;
        }
    }

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        int size = 0;
        Node<E> current = first;
        while(current!=null){
            size++;
            current = current.next;
        }
        return size;
    }

    public E get(int i){

        if(isEmpty() || i < 0)
            throw new IndexOutOfBoundsException("Index" + i);

        Node<E> currentNode = first;
        int currentInd = i;

        while(currentInd > 0){
            if(currentNode==null)
                throw new IndexOutOfBoundsException("Index"+ i);

            currentNode = currentNode.next;
            currentInd--;
        }
        return currentNode.element;
    }

    private static class NodePair<E> {
        private final Node<E> previous;
        private final Node<E> current;

        private NodePair(Node<E> previous, Node<E> current) {
            this.previous = previous;
            this.current = current;
        }
    }

    private NodePair<E> getNodePrevious(int i){

        if(isEmpty() || i<0)
            throw new IndexOutOfBoundsException("Index" + i);

        Node<E> previousNode = null;
        Node<E> currentNode = first;
        int currentInd = i;

        while(currentInd > 0){
            if(currentNode == null) {
                throw new IndexOutOfBoundsException("Index" + i);
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
            currentInd--;
        }
        return new NodePair<E>(previousNode,currentNode);
    }
}
