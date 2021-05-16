package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.*;


public class ArrayListTest {

    @Test
    public void whenArrayListIsCreated_thenSizeIsZero() {

        //Initialization
        ArrayList<Integer> list = new ArrayList<>();
        //Run
        int size = list.getSize();
        //Validation
        assertThat(size).as("size should be 0").isZero();

    }

    @Test
    public void givenANewArray_whenAddElement_thenSizeIsOne() throws MyIndexOutOfBoundsException{

        //Initialization
        ArrayList<Integer> list = new ArrayList<>();
        //Run
        list.add(500);
        //Validation
        assertThat(list.getSize()).as("size should be 1").isEqualTo(1);
        assertThat(list.get(0)).isEqualTo(500);
    }

    @Test
    public void givenAnExistentArrayWith1Element_whenAddElement_thenSizeIsTwo() throws MyIndexOutOfBoundsException{

        //Initialization
        ArrayList<Integer> list = new ArrayList<>();
        list.add(500);
        //Run
        list.add(100);
        //Validation
        assertThat(list.getSize()).as("size should be 2").isEqualTo(2);
        assertThat(list.get(0)).isEqualTo(500);
        assertThat(list.get(1)).isEqualTo(100);
    }

    @Test
    public void givenAnExistentArrayWhitNoCapacity_whenAddElement_thenSizeAndCapacityIncrements() throws MyIndexOutOfBoundsException{

        //Initialization
        ArrayList<Integer> list = new ArrayList<>();

        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);

        //Run
        list.add(1000);
        //Validation
        assertThat(list.getSize()).as("size should be 5").isEqualTo(5);

        assertThat(list.get(0)).isEqualTo(500);
        assertThat(list.get(1)).isEqualTo(600);
        assertThat(list.get(2)).isEqualTo(700);
        assertThat(list.get(3)).isEqualTo(800);
        assertThat(list.get(4)).isEqualTo(1000);
    }

    @Test
    public void givenAnExistentArrayWith5Elements_whenIterator_thenAllElementsAreAccessible(){

        //Initialization
        ArrayList<Integer> list = new ArrayList<>();

        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        list.add(1000);

        //Run
        Iterator<Integer> it = list.getIterator();

        //Validation
        assertThat(it.hasNext()).as("'it' should have access to the next element").isTrue();
        assertThat(it.next()).isEqualTo(500);
        assertThat(it.hasNext()).as("'it' should have access to the next element").isTrue();
        assertThat(it.next()).isEqualTo(600);
        assertThat(it.hasNext()).as("'it' should have access to the next element").isTrue();
        assertThat(it.next()).isEqualTo(700);
        assertThat(it.hasNext()).as("'it' should have access to the next element").isTrue();
        assertThat(it.next()).isEqualTo(800);
        assertThat(it.hasNext()).as("'it' should have access to the next element").isTrue();
        assertThat(it.next()).isEqualTo(1000);
        assertThat(it.hasNext()).as("'it' shouldn't have access to the next element").isFalse();
    }

    @Test
    public void givenAnExistentArrayWith5Elements_whenReverseIterator_thenAllElementsAreAccessible(){

        //Initialization
        ArrayList<Integer> list = new ArrayList<>();

        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        list.add(1000);

        //Run
         Iterator<Integer> it = list.getReverseIterator();

        //Validation
        assertThat(it.hasNext()).as("'it' should have access to the previous element").isTrue();
        assertThat(it.next()).isEqualTo(1000);
        assertThat(it.hasNext()).as("'it' should have access to the previous element").isTrue();
        assertThat(it.next()).isEqualTo(800);
        assertThat(it.hasNext()).as("'it' should have access to the previous element").isTrue();
        assertThat(it.next()).isEqualTo(700);
        assertThat(it.hasNext()).as("'it' should have access to the previous element").isTrue();
        assertThat(it.next()).isEqualTo(600);
        assertThat(it.hasNext()).as("'it' should have access to the previous element").isTrue();
        assertThat(it.next()).isEqualTo(500);
        assertThat(it.hasNext()).as("'it' shouldn't have access to the previous element").isFalse();
    }

    @Test
    public void givenAnExistentArrayWith4Elements_whenDeleteElementInTheHead_thenSizeDecrements() throws MyIndexOutOfBoundsException{

        //Initialization
        ArrayList<Integer> list = new ArrayList<>();

        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);

        //Run
        list.delete(0);
        //Validation
        assertThat(list.getSize()).as("size should be 3").isEqualTo(3);

        assertThat(list.get(0)).isEqualTo(600);
        assertThat(list.get(1)).isEqualTo(700);
        assertThat(list.get(2)).isEqualTo(800);
    }

    @Test
    public void givenAnExistentArrayWith4Elements_whenDeleteElementInTheMiddle_thenSizeDecrements() throws MyIndexOutOfBoundsException{

        //Initialization
        ArrayList<Integer> list = new ArrayList<>();

        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);

        //Run
        list.delete(1);
        //Validation
        assertThat(list.getSize()).as("size should be 3").isEqualTo(3);

        assertThat(list.get(0)).isEqualTo(500);
        assertThat(list.get(1)).isEqualTo(700);
        assertThat(list.get(2)).isEqualTo(800);
    }

    @Test
    public void givenAnExistentArrayWith4Elements_whenDeleteElementInTheTail_thenSizeDecrements() throws MyIndexOutOfBoundsException{

        //Initialization
        ArrayList<Integer> list = new ArrayList<>();

        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);

        //Run
        list.delete(3);
        //Validation
        assertThat(list.getSize()).as("size should be 3").isEqualTo(3);

        assertThat(list.get(0)).isEqualTo(500);
        assertThat(list.get(1)).isEqualTo(600);
        assertThat(list.get(2)).isEqualTo(700);
    }

    @Test
    public void givenAnExistentArrayWith4Elements_whenDeleteElementAtIndex5_thenMyIndexOutOfBoundExceptionIsThrown(){

        //Initialization
        ArrayList<Integer> list = new ArrayList<>();

        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);

        //Run - Validation
        assertThatExceptionOfType(MyIndexOutOfBoundsException.class).as("MyIndexOutOfBoundsException should be thrown").isThrownBy(() ->  list.delete(5));
    }

    @Test
    public void givenAnExistingArrayWith4Elements_whenGetIteratorIt_thenItIsAnInstanceOfForwardIterator(){
        //Initialization
        ArrayList<Integer> list = new ArrayList<>();
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);

        //Run
        Iterator<Integer> it = list.getIterator();

        //Validation
        assertThat(it).as(" 'it' should be an instance of ForwardIterator").isExactlyInstanceOf(ArrayList.ForwardIterator.class);
    }

    @Test
    public void givenAnExistingArrayWith4Elements_whenGetReverseIteratorIt_thenItIsAnInstanceOfReverseIterator(){
        //Initialization
        ArrayList<Integer> list = new ArrayList<>();
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);

        //Run
        Iterator<Integer> it = list.getReverseIterator();

        //Validation
        assertThat(it).as(" 'it' should be an instance of ReverseIterator").isExactlyInstanceOf(ArrayList.ReverseIterator.class);
    }

}
