package src.com.lambdaschool.solution;

public class HockeyAthleteImpl implements AthleteCreation
{
    @Override
    public void displayAthlete(/*String sport, String athlete*/)
    {
        System.out.println("Hockey" + " " + "Goalie");
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
