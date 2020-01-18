import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FrogJumpTest {
    private FrogJump frogJump;

    @BeforeTest
    public void setUp(){
        frogJump = new FrogJump();
    }

    @DataProvider(name="TestingData")
    public Object[][] createData(){
        return new Object[][]{
                new Object [] { new int[]  {    10,      85,     30 },    3 },
                new Object [] { new int [] {     1,      14,      3 },    5 },
                new Object [] { new int [] {   100,    1001,    100 },   10 },
                new Object [] { new int [] { 150000,  999999,  10000 },  85 },
                new Object [] { new int [] { 150000, 1000000,  10000 },  85 },
                //X and Y are the same - no jumps required
                new Object [] { new int [] {     14,      14,      3 },   0 },
        };
    }

    @Test(dataProvider = "TestingData")
    public void verifySolution(int[] exArray, int expVal){
        Assert.assertEquals(frogJump.solution(exArray[0], exArray[1], exArray[2]), expVal);
    }
}
