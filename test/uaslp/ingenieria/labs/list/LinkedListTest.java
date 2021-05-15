package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {

    @Test
    public void whenANewListIsCreated_ThenListIsEmpty(){

        //Given:

        //When:
        ArrayList<Integer> lista = new ArrayList<>();

        //Then:
        assertEquals(0,lista.getSize());


    }
}
