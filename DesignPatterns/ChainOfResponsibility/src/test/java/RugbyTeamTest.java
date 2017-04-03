import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/3/2017.
 */
public class RugbyTeamTest {

    private RugbyTeam team;
    private RugbyTeam flyHalf = null;
    private RugbyTeam fullBack = null;
    private RugbyTeam scrumHalf = null;
    private RugbyTeam winger = null;

    @Before
    public void setUp() throws Exception{

        fullBack = new FullBack();
        scrumHalf = new ScrumHalf();
        winger = new Winger();

        flyHalf.setRugbyTeam(fullBack);
        fullBack.setRugbyTeam(scrumHalf);
        scrumHalf.setRugbyTeam(winger);

        team = flyHalf;
    }

    @Test
    public void flyHalfTest() {
        Assert.assertEquals(true, team.team(PositionsInRugby.FLYHALF).equalsIgnoreCase("GoalKeeper "));
    }

    @Test
    public void fullBackTest() {
        Assert.assertEquals(true, team.team(PositionsInRugby.FULLBACK).equalsIgnoreCase("Not FlyHalf, Fullback "));
    }

    @Test
    public void scrumHalfTest() {
        Assert.assertEquals(true, team.team(PositionsInRugby.SCRUMHALF).equalsIgnoreCase("Not FlyHalf, Not Fullback, ScrumHalf "));
    }

    @Test
    public void wingerTest()
    {
        Assert.assertEquals(true, team.team(PositionsInRugby.WINGER).equalsIgnoreCase("Not FlyHalf, Not Fullback, Not ScrumHalf, Winger "));
    }
}
