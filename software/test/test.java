import org.junit.Test;
import static org.junit.Assert.assertEquals;
import paint.Prog;

public class test { //here I'm testing whether my program outputs what it's meant to output
    @Test
    public void areaTest(){
        Prog c = new Prog();
        assertEquals(20, c.area(4,5),0.0);
    }

    @Test
    public void volumeTest(){ //here I tested whether it would take in a decimal however because it was expecting a float it didn't work like that which led me to accept double in my methods
        Prog c = new Prog();
        assertEquals(10, c.volume(2, 2.5,2),0);
    }




}
