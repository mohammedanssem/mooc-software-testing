package tudelft.ghappy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest
    @CsvSource({
        "xxggxx,true","xxggxggxxgg,true","ggxx,true","xxgg,true","xxgxx,false","xggxgx,false","gx,false","xg,false","x,false"
    })
    
    public  void GHappyAutomatedTests(String word, boolean expectedResult){
        GHappy s= new GHappy();
        boolean result=s.gHappy(word);
        Assertions.assertEquals(expectedResult, result);
    }
}
