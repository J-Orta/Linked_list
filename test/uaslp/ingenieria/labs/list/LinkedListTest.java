package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {


    @Test
    public void givenOneExistentLinkedList_whenANewListIsCreated_thenListCountIsTwo(){
        //Given:
        LinkedList<Integer> list = new LinkedList<>();
        //When:
        LinkedList<Integer> list2 = new LinkedList<>();
        //Then:
        assertThat(LinkedList.getListsCount()).as("listCount should be 2").isEqualTo(2);
    }

    @Test
    public void whenANewLinkedListIsCreated_thenSizeIsZero(){

        //Given:

        //When:
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList.setListCount(0);

        //Then:
        assertThat(list.getSize()).as("size should be 0").isZero();

    }

    @Test
    public void givenAnExistentLinkedListWith5Elements_whenIterator_thenAllElementsAreAccessible(){

        //Initialization
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList.setListCount(0);


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
    public void givenAnExistentLinkedListWith5Elements_whenReverseIterator_thenAllElementsAreAccessible(){

        //Initialization
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList.setListCount(0);

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
    public void givenANewLinkedList_whenGetElementByAnyIndex_thenMyNullPointerExceptionIsThrown(){

        //Given
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList.setListCount(0);
        //Run - Validation
        assertThatExceptionOfType(MyNullPointerException.class).as("MyNullPointerException should be thrown").isThrownBy(()->list.get(0));
        assertThatExceptionOfType(MyNullPointerException.class).as("MyNullPointerException should be thrown").isThrownBy(()->list.get(4));
    }

    @Test
    public void givenAnExistentLinkedListWith4Elements_whenGetElementByIndex3_thenCurrentNodeDataIsAccessible() throws MyNullPointerException{
        //Given
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList.setListCount(0);
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        //Run
        int g = list.get(3);
        //Validation
        assertThat(g).as("g should be 800").isEqualTo(800);

    }

    @Test
    public void givenANewLinkedList_whenDeleteElementByAnyIndex_thenMyNullPointerExceptionIsThrown(){

        //Given
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList.setListCount(0);
        //Run - Validation
        assertThatExceptionOfType(MyNullPointerException.class).as("MyNullPointerException should be thrown").isThrownBy(()->list.delete(0));
        assertThatExceptionOfType(MyNullPointerException.class).as("MyNullPointerException should be thrown").isThrownBy(()->list.delete(4));
    }

    @Test
    public void givenAnExistentLinkedListWith4Elements_whenDeleteElementByIndex3_thenLinkedListSizeDecrement() throws MyNullPointerException{
        //Given
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList.setListCount(0);
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        //Run
        list.delete(3);
        //Validation
        assertThat(list.getSize()).as("size should be 3").isEqualTo(3);

    }

}
