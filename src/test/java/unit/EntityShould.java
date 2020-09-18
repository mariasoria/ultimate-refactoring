package unit;

import org.junit.Assert;
import org.junit.Test;
import untestableLegacy.Entity;

public class EntityShould {

    Entity entidad = new Entity();

    @Test
    public void should_be_fulanit(){
        Assert.assertEquals("fulanit", entidad.getMethod("fulanit*"));
    }

    @Test
    public void should_be_francisco() {
        Assert.assertEquals("francisco", entidad.getMethod("franc*isco"));
    }

    @Test
    public void should_eliminate_questionmark() {
        Assert.assertEquals("francisco", entidad.getMethod("fran?c*isco"));
    }

    @Test
    public void should_skip_the_space() {
        Assert.assertEquals("mari a", entidad.getMethod("mari a"));
    }

    @Test
    public void should_recognize_underscore() {
        Assert.assertEquals("he_llo", entidad.getMethod("he_llo"));
    }

    @Test
    public void should_skip_the_space_and_remove_illegal_chars() {
        Assert.assertEquals("a dam", entidad.getMethod("a d??a*m"));
    }


}
