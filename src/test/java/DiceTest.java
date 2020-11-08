import org.junit.Assert;
import org.junit.Test;

// Given (our data)
// When (an object is constructed)
// When (we retrieve data from the object)
// Then (we expect the given data to match the retrieved data)

public class DiceTest {

    @Test
    public void testNumOfDice(){
        //given
        Integer numberOfDice = 2;

        // when object is constructed
        Dice dice = new Dice(numberOfDice);

        //when we retrieve info
        Integer actualNumOfDice = dice.getNumOfDice();

        //assert equals
        Assert.assertEquals(numberOfDice, actualNumOfDice);
    }



}
