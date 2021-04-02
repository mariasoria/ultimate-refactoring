package moveResponsibility;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class GodShould {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    @Test
    public void add_should_return_3(){
        assertEquals(3, God.add(1, 2));
    }

    God god = new God();
    @Test
    public void substract_should_return_4(){
        assertEquals(4, god.substract(7, 3));
    }

}