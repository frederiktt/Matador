package sample;

public class Field //implements FieldInterface
{


    private String name;
    private int number;

    public Field(String name, int number)
    {
        this.name = name;
        this.number = number;
    }

    public Field()
    {
    }

    public String getName()
    {
        return name;
    }

    public int getNumber()
    {
        return number;
    }

//    @Override
//    public void consequense(Player poorPlayer)
//    {
//
//    }

}
