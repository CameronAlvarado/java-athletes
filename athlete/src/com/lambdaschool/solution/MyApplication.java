package src.com.lambdaschool.solution;

public class MyApplication implements Processor
{
    // constructor injections
    private AthleteCreation athCre;

    public MyApplication(AthleteCreation athCre)
    {
        this.athCre = athCre;
    }

    @Override
    public void displayAthlete(/*String sport, String athlete*/)
    {
        // rules
//        sport = sport + "\n************";
//        athlete = "************\n" + athlete;
        athCre.displayAthlete(/*sport, athlete*/);
    }

    @Override
    public String readMessage()
    {
        return "Not Implemented";
    }
}
