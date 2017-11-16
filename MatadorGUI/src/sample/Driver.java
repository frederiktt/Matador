package sample;

public class Driver implements FieldInterface
{

    private Dice dice;
    private String nameOfDriver;
    //    private FieldInterface[]plate=new FieldInterface[40];
//    private Field [] board = new Field[40];
    private FieldInterface[] board = new FieldInterface[40];

    public Driver(String nameOfDriver)
    {
        this.nameOfDriver = nameOfDriver;
    }

//    public Field [] board()
//    {
//        for (int i=0; i < (board.length);i++)
//        {
//            board[i] = new Field(MonopolyConstants.FIELD_NAMES[i+1], i+1);
//        }
//        return board;
//    }

    public FieldInterface[] board()
    {
        for (int i = 0; i < board.length; i++)
        {
            switch (i + 1)
            {
                case 1: // other fields
                case 3:
                case 5:
                case 8:
                case 11:
                case 18:
                case 21:
                case 23:
                case 34:
                case 37:
                case 39:
                    board[i] = new OtherField(MonopolyConstants.FIELD_NAMES[i + 1], i + 1);
                    break;
                case 31: // Go to jail:
                    board[i] = new GoToJailField(MonopolyConstants.FIELD_NAMES[i + 1], i + 1);
                    break;
                case 6: // Shipping companies:
                case 16:
                case 26:
                case 36:
                    board[i] = new ShippingCompany(50, MonopolyConstants.FIELD_NAMES[i + 1], i + 1, 200);
                    break;
                case 13:
                case 29: //Breweries:
// Dice is an argument, as the payable amount depends on the total number of dots
                    board[i] = new Brewery(dice, MonopolyConstants.FIELD_NAMES[i + 1], i + 1, 150);
                    break;
                default: // Streets:
                    board[i] = new StreetField(3 * i, MonopolyConstants.FIELD_NAMES[i + 1], i + 1, 10 * i);
// The payable amount when landing on the field and
// the price to buy the field are here simulated by 3*i and 10*i, respectively.
// You are most welcome to come up with smarter solutions
            }
        }
        return board;
    }

    @Override
    public String getName()
    {

        return null;
    }

    @Override
    public int getNumber()
    {
        return 0;
    }

    @Override
    public void consequense(Player poorPlayer)
    {

    }
}
