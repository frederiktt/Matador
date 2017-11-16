package sample;

public class OtherField implements FieldInterface
{
    private String name;
    private int number;
    public OtherField(String fieldName, int i)
    {
        this.name=fieldName;
        this.number=i;
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

    @Override
    public void consequense(Player player)
    {

    }
}
