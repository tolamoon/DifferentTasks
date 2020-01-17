import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OddOcurrencesInArrayTests {
    private OddOccurrencesInArray solution;

    @BeforeTest
    public void setUp(){
        solution = new OddOccurrencesInArray();
    }

    @DataProvider(name="test")
    public Object[][] createData1(){
        return new Object[][]{
                new Object [] { new int [] { 7, 2, 4, 2, 7, 7, 4 }, 7 },
                new Object [] { new int [] { 1, 2, 1, 3, 5, 2, 3 },  5 },
                //no odd number in array, result is 0
                new Object [] { new int [] { 7, 2, 4, 2, 7, 7, 4, 7 }, 0 },
                //double pair matching
                new Object [] { new int [] { 1, 2, 1, 3, 5, 2, 3, 1, 1, 2, 2 },  5 },
                //large numbers
                new Object [] { new int [] { 1000000, 2000000, 1000000, 30000000, 5000000, 2000000, 30000000 },  5000000 },
        };
    }

    @Test(dataProvider = "test")
    public void verifySolution(int[] exA, int expRes){
        Assert.assertEquals(solution.solution(exA), expRes);
    }

}
