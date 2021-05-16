package uaslp.ingenieria.labs.list;

public class LinkedList <G> implements List<G> {

        private static class Node <T> {

                private final T data;
                private Node<T> previous;
                private Node<T> next;

                Node(T data){
                        this.data=data;
                }
        }

        private Node<G> head;
        private Node<G> tail;
        private int size;

        private static int listsCount=0;

        public LinkedList(){
                listsCount++;
        }

        public static int getListsCount() { return listsCount;}

        public static void setListCount(int data) {listsCount = data;}

        public class ForwardIterator implements Iterator <G> {

                private Node<G> currentNode;

                public ForwardIterator(){
                        this.currentNode = head;
                }

                public boolean hasNext(){
                        return currentNode != null;
                }

                public G next(){
                        G data = currentNode.data;

                        currentNode = currentNode.next;

                        return data;
                }
        }

        public class ReverseIterator implements Iterator<G> {

                private Node<G> currentNode;

                public ReverseIterator() {
                        this.currentNode = tail;
                }


                public boolean hasNext(){
                        return currentNode != null;
                }

                public G next(){
                        G data = currentNode.data;

                        currentNode = currentNode.previous;

                        return data;
                }
        }

        @Override
        public int getSize() {
                return size;
        }

        @Override
        public void add(G data) {
                Node<G> node = new Node<>(data);

                node.previous = tail;

                if (tail != null) {
                        tail.next = node;
                }

                if (head == null) {
                        head = node;
                }

                tail = node;
                size++;
        }

        @Override
        public G get(int index) throws MyNullPointerException{

                if(head == null){
                        throw new MyNullPointerException();
                }

                Node<G> currentNode = head;
                int currentIndex = 0;

                while (currentIndex < index) {
                        currentNode = currentNode.next;

                        currentIndex++;
                }

                if(currentNode == null){
                        throw new MyNullPointerException();
                }

                return currentNode.data;
        }

        @Override
        public void delete(int index) throws MyNullPointerException {

                if (head == null) {
                        throw new MyNullPointerException();
                }

                Node<G> currentNode = head;
                int currentIndex = 0;

                size--;

                if (size == 0) {
                        head = null;
                        tail = null;
                        return;
                }

                if (index == 0) {
                        head = head.next;
                        head.previous = null;
                }

                if (index == size) {
                        tail = tail.previous;
                        tail.next = null;
                }

                if (index > 0 && index < size) {
                        while (currentIndex < index) {
                                currentNode = currentNode.next;
                                currentIndex++;
                        }

                        if(currentNode == null){
                                throw new MyNullPointerException();
                        }
                        currentNode.previous.next = currentNode.next;
                        currentNode.next.previous = currentNode.previous;
                }


        }

        @Override
        public Iterator<G> getIterator() {
                return new ForwardIterator();
        }

        @Override
        public ReverseIterator getReverseIterator() {
                return new ReverseIterator();
        }

}

