import _1_Iterations.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldProcessSingleNumber(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("1", fizzBuzz.process(1));
        assertEquals("2", fizzBuzz.process(2));
        assertEquals("Fizz",fizzBuzz.process(3));
        assertEquals("4",fizzBuzz.process(4));
        assertEquals("Buzz",fizzBuzz.process(5));
        assertEquals("Fizz",fizzBuzz.process(6));
        assertEquals("FizzBuzz",fizzBuzz.process(15));

    }


}
