import org.testng.Assert;

public class FrogJump {

    //x-start, y-end, d-distance of 1 jump
    int solution(int x, int y, int d){
        int distanceToGo = y - x;
        int jumps = distanceToGo/d;

        //if remainder is present add one jump
        if(distanceToGo % d != 0)
            jumps++;

        return jumps;
    }

    public static void main(String[] args){
        int x = 10;
        int y = 90;
        int d = 25;
        FrogJump fj = new FrogJump();
        int expValue = 4;
        //System.out.print("Required number of jumps: " + fj.solution(x,y,d));
        Assert.assertEquals(fj.solution(x,y,d), expValue);
    }
}
