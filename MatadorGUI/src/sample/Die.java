package sample;

public class Die
{
    public Die()
    {
    }

    public int generateRandomEyeNumber()
    {

        int generatedNumber = 1+(int)(Math.random() *6);

        return generatedNumber;
    }
}
