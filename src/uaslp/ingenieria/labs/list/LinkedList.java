package uaslp.ingenieria.labs.list;

public class LinkedList {
        private Node head;
        private Node tail;
        private int size;

        public void add(int data){
                Node node = new Node(data);

                node.setPrevious(tail);

                if(tail != null){
                        tail.setNext(node);
                }

                if(head == null){
                        head = node;
                }

                tail = node;
                size++;
        }

        public int getSize() {
                return size;
        }

        public int get(int index){
                Node currentNode = head;
                int currentIndex = 0;

                while(currentIndex < index){
                        currentNode = currentNode.getNext();
                        currentIndex++;
                }

                return currentNode.getData();
        }

        public void delete(int index){
                Node currentNode = head;
                int currentIndex = 0;

                if(index < 0 || index >= size){
                        return;
                }

                size--;

                if(size == 0){
                        head = null;
                        tail = null;
                        return;
                }

                if(index == 0){
                        head = head.getNext();
                        head.setPrevious(null);
                }

                if(index == size-1){
                        tail = tail.getPrevious();
                        tail.setNext(null);
                }

                if(index > 0 && index < size-1){

                        while(currentIndex < index){
                                currentNode = currentNode.getNext();
                                currentIndex++;
                        }

                        currentNode.getPrevious().setNext(currentNode.getNext());
                        currentNode.getNext().setPrevious(currentNode.getPrevious());
                }
        }

        public Iterator getIterator(){
                return new Iterator(head);
        }
}

