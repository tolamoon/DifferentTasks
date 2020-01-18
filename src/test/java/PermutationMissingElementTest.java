import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PermutationMissingElementTest {
    private PermutationMissingElement pme;

    @BeforeTest
    public void setUp(){
        pme = new PermutationMissingElement();
    }

    @DataProvider(name="testingData")
    public Object[][] createData(){
        return new Object[][] {
                new Object [] { new int [] {                        }, 1 },
                new Object [] { new int [] {                      1 }, 2 },
                new Object [] { new int [] {                      2 }, 1 },
                new Object [] { new int [] {                   1, 3 }, 2 },
                new Object [] { new int [] {                   2, 3 }, 1 },
                new Object [] { new int [] {                1, 2    }, 3 },
                new Object [] { new int [] {                1, 3, 4 }, 2 },
                new Object [] { new int [] {                2, 4, 3 }, 1 },
                new Object [] { new int [] {             2, 3, 1, 5 }, 4 },
                new Object [] { new int [] { 4, 2, 3, 1, 5, 6, 8, 9 }, 7 },
                new Object [] { new int [] { 4, 2, 3, 1, 5, 6, 8, 7 }, 9 },
        };
    }

    @Test(dataProvider = "testingData")
    public void verifySolution(int[] exA, int expMissElem){
        Assert.assertEquals(pme.solution(exA), expMissElem);
    }
}
