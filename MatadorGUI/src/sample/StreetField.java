package sample;

public class StreetField extends OwnebleField
{
    private String name;
    private int number;

    public StreetField(int i, String fieldName, int i1, int i2)
    {
        this.name=fieldName;
        this.number=i1;
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
