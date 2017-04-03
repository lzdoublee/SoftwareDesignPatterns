/**
 * Created by L.z Double E on 4/3/2017.
 */
public class SoccerPlayer implements DuplicateSoccerPlayer
{
    private String pos;
    private String team;

    public SoccerPlayer(String position, String team) {
        this.pos = position;
        this.team = team;
    }


    public DuplicateSoccerPlayer createCopy()
    {
        return new SoccerPlayer(pos,team);
    }

    public String toString()
    {
        return "Position: " + pos +"\n" +"Team: " + team + "\n";
    }
}
