package uaslp.ingenieria.labs.list;

public class ArrayList <H> implements List <H>{

    private Object arrayData[];
    int size;

    public ArrayList() {
        this.arrayData = new Object[2];
    }


    @Override
    public void add(H data) {
        if(size < arrayData.length){
            arrayData[size++] = data;
        }else{
            Object arrayAux[] = new Object[arrayData.length*2];
            System.arraycopy(arrayData, 0, arrayAux, 0, arrayData.length);
            arrayData = arrayAux;
            arrayData[size++] = data;
        }
    }

    @Override
    public H get(int index) {
        return (H) arrayData[index];
    }

    @Override
    public void delete(int index) {
        for(int i = index + 1; i < size ; i++ ){
           arrayData[i-1] = arrayData [i];
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

    @Override
    public void insert(H data, Position position, Iterator<H> it) {

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
