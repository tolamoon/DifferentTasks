import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PalindromeTest {

    @DataProvider(name="palindromeTest")
    public Object[][] testData(){
        return new Object[][]{
                new Object[] { "abba", true },
                new Object[] { "have", false },
                new Object[] { "potop", true },
                new Object[] { "Ala ma kota", false }
        };
    }
    @Test(dataProvider = "palindromeTest")
    public void verifySolution(String example, boolean expected){
        Assert.assertEquals(Palindrome.isPalindrome(example), expected);
    }
}
