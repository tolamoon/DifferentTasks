import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FibonacciNumbersTest {

    @DataProvider(name="Data")
    public Object[][] createData(){
        return new Object[][]{
                new Object[] {  1, new int [] { 1 } },
                new Object[] {  2, new int [] { 1, 1 } },
                new Object[] {  3, new int [] { 1, 1, 2 } },
                new Object[] {  6, new int [] { 1, 1, 2, 3, 5, 8 } },
                new Object[] {  8, new int [] { 1, 1, 2, 3, 5, 8, 13, 21 } },
                new Object[] { 10, new int [] { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 } },
                new Object[] { 12, new int [] { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 } },
        };
    }

    @Test(dataProvider = "Data")
    public void verifySolution(int exn, int[] expFibonacci){
        int[] currentFib = FibonacciNumbers.generateFibonacci(exn);
        Assert.assertEquals(currentFib.length, expFibonacci.length);

        System.out.println("Fibonacci numbers: ");
        for(int i=0; i<expFibonacci.length; i++){
            System.out.print(currentFib[i] + ", ");
            Assert.assertEquals(currentFib[i], expFibonacci[i]);
        }
    }

}
