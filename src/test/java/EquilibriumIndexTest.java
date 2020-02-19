import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EquilibriumIndexTest {

    @DataProvider(name="equilibriumTest")
    public Object[][] testData(){
        return new Object[][]{
                new Object[]{ new int[]{-7, 1, 5, 2, -4, 3, 0}, 3},
                new Object[]{ new int[]{1, 2, 3}, -1},
                new Object[]{ new int[]{0, 7, -7}, 0},
                new Object[]{ new int[]{7, -7, 0}, 2},
                new Object[]{ new int[]{-10000}, 0},
                new Object[]{ new int[]{100, -20, 0, -20, 100}, 2},
        };
    }

    @Test(dataProvider = "equilibriumTest")
    public void shuldFindEquilibriumIndex3(int[] arr, int expectedEq){
        int size = arr.length;
        Assert.assertEquals(EquilibriumIndex.findEquilibriumIndex(arr,size), expectedEq);
    }
}
