package mihaijulien.eu.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class MapTest {

    @Test
    public void MapTest(){
        Map<Integer, Integer> map = new Map<>();
        for(int i=0; i<10; i++){
            map.put(i, i);
        }
        assertTrue(map.isFull());
        for(int i=0; i<10; i++){
            assertEquals(i, (int) map.get(i));
        }
        try{
            map.put(10, 10);
            fail("Map is full");
        } catch(IllegalStateException e){
            //expected
        }

        map.remove(9);
        assertEquals(9, map.getSize());
    }
}
