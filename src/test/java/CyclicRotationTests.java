import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CyclicRotationTests {
    private CyclicRotation solution;

    @BeforeTest
    public void setUp(){
        solution = new CyclicRotation();
    }

    @DataProvider(name="test1")
    public Object[][] createData1(){
        return new Object[][]{
                new Object[] { new int[] { 3, 8, 9, 7, 6 },  3,  new int[] { 9, 7, 6, 3, 8 } },
                new Object[] { new int[] { 0, 0, 0 },        1,  new int[] { 0, 0, 0 } },
                new Object[] { new int[] { 1, 2, 3, 4 },     4,  new int[] { 1, 2, 3, 4 } },
                new Object[] { new int[] { 1, 2, 3, 4 },     5,  new int[] { 4, 1, 2, 3 } },
                new Object[] { new int[] { -1, 2, -3, 4 },  10,  new int[] { -3, 4, -1, 2 } },
                //same as rotate by 3 (99 mod 4 = 3)
                new Object[] { new int[] { -1, 2, -3, 4 },  99,  new int[] { 2, -3, 4, -1 } },
                //finish where it started
                new Object[] { new int[] { -1, 2, -3, 4 }, 100,  new int[] { -1, 2, -3, 4 } }
        };
    }

    @Test (dataProvider="test1")
    public void verifySolution(int[] exArray, int exK, int[] expectedArray){
        int[] rotatedArray = solution.rotateArray(exArray, exK);
        Assert.assertEquals(expectedArray.length, rotatedArray.length);
        for (int i=0; i<expectedArray.length; i++){
            Assert.assertEquals(expectedArray[i], rotatedArray[i]);
        }
    }

}

