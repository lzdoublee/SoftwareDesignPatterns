import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/3/2017.
 */
public class SoccerPlayerTest {


    SoccerPlayer player;
    SoccerPlayer player2;
    @Before
    public void setUp() throws Exception {
        player = new SoccerPlayer("Striker","Real Madrid");
        player2 = (SoccerPlayer) player.createCopy();
    }

    @Test
    public void duplicateTest() throws Exception {
        Assert.assertEquals(player.toString(),player2.toString());
    }
}
