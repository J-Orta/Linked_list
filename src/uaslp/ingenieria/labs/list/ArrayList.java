package uaslp.ingenieria.labs.list;

public class ArrayList <H> implements List <H>{

    private Object arrayData[];
    int size;

    public ArrayList() {
        this.arrayData = new Object[2];
    }


    @Override
    public void add(H data) {
        if (size >= arrayData.length) {
            Object arrayAux[] = new Object[arrayData.length * 2];
            System.arraycopy(arrayData, 0, arrayAux, 0, arrayData.length);
            arrayData = arrayAux;
        }
        arrayData[size++] = data;
    }

    @Override
    public H get(int index) throws MyIndexOutOfBoundsException{

        if(index > size || index < 0) {
            throw new MyIndexOutOfBoundsException();
        }

        return (H) arrayData[index];
    }

    @Override
    public void delete(int index) throws MyIndexOutOfBoundsException {

        if(arrayData.length - (index+1) >= 0) {
            System.arraycopy(this.arrayData,index+1,this.arrayData,index+1-1,arrayData.length-(index+1));
        }else {
            throw new MyIndexOutOfBoundsException();
        }
        size--;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Iterator<H> getIterator() {
        return new ForwardIterator();
    }

    @Override
    public Iterator<H> getReverseIterator() {
        return new ReverseIterator();
    }

    public class ForwardIterator implements Iterator <H> {

        private int currentPosition;

        public ForwardIterator(){
            this.currentPosition = 0;
        }

        @Override
        public boolean hasNext(){
            return currentPosition < size;
        }

        @Override
        public H next(){
            H data = (H) arrayData[currentPosition];

            currentPosition++;

            return data;
        }

    }

    public class ReverseIterator implements Iterator<H> {

        private int currentPosition;

        public ReverseIterator() {
            this.currentPosition = size-1;
        }

        @Override
        public boolean hasNext(){
            return currentPosition >= 0;
        }

        @Override
        public H next(){
            H data = (H) arrayData[currentPosition];

            currentPosition--;

            return data;
        }
    }
}
