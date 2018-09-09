import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
    @Test
    public final void when2NumbersAreUsedThenNoExceptionThrown(){
        StringCalculator.add("1,2");
    }

    @Test(expected = RuntimeException.class)
    public final void whenNotANumberIsUsedThenExceptionThrown(){
        StringCalculator.add("1,x");
    }
    @Test
    public final void whenEmptyStringIsUsedThenReturnValueZero(){
        Assert.assertEquals(0,StringCalculator.add(""));
    }
    @Test
    public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber(){
        Assert.assertEquals(3,StringCalculator.add("3"));
    }
    @Test
    public final void whenTwoNumbersAreUsedThenReturnValueShouldBeTheirSum(){
        Assert.assertEquals(3+2,StringCalculator.add("3,2"));
    }
    @Test
    public final void whenUnknownAmountOfNumbersAreUsedThenReturnValueShouldBeTheirSum(){
        Assert.assertEquals(4+5+33+45+50,StringCalculator.add("4,5,33,45,50"));
    }
    @Test
    public final void whenNewLineIsUsedBetweenTheNumbersThenReturnValueShouldBeTheirSum(){
        Assert.assertEquals(1+2+3,StringCalculator.add("1,2n3"));
    }
}
