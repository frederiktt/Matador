package sample;

public class Brewery extends OwnebleField
{
    private String name;
    private int number;

    public Brewery(Dice dice, String fieldName, int i, int i1)
    {
        this.name=fieldName;
        this.number=i;
    }

    public Brewery(int i, String fieldName, int i1, int i2)
    {

    }

    @Override
public void consequense(Player player)
{

}
    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public int getNumber()
    {
        return number;
    }

}
