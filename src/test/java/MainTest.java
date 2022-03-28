
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {

    @Test
    void sumIsFive()
    {
        var main=new Main();
        assertEquals(11,main.addition(5,6));
    }

    @Test
    void tryNew(){
        var main=new Main();
        assertTrue(main.addition(1,1)==2);
    }



    @Test
    void throwsError(){
        var main=new Main();
        assertThrows(IllegalArgumentException.class,
                ()->{
            main.answer(200);
                });

    }
}