package src.com.lambdaschool.solution;

public class BaseballAthleteImpl implements AthleteCreation
{
    @Override
    public void displayAthlete(/*String sport, String athlete*/)
    {
        System.out.println("BaseBall" + " " + "Athlete");
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
