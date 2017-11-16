package sample;

import java.util.ArrayList;
import java.util.List;

public class Player
{
    private String playerName;
    private int currentField;
    private int rounds;
    private List<OwnebleField> ownebleFieldList= new ArrayList<>();
    private int money = MonopolyConstants.START_MONEY;


    public Player(String name)
    {
        this.playerName=name;
    }

    public int getRounds()
    {
        return rounds;
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }

    public int getCurrentField()
    {
        return currentField;
    }

    public void setCurrentField(int currentField)
    {
        this.currentField = currentField;
    }

    public void move(Dice dice)
    {
        int CheckIfEndOfFieldIsReached = currentField + dice.throwDice();

        if (CheckIfEndOfFieldIsReached< 40)
        {
            currentField += dice.throwDice();
        }
        else if(CheckIfEndOfFieldIsReached== 40)
        {
            currentField=0;
            rounds++;
        }

        else if (CheckIfEndOfFieldIsReached > 40)
        {
            currentField = CheckIfEndOfFieldIsReached - 40;
            rounds++;
        }
    }
    public void buy(OwnebleField ownebleField)
    {
        pay(ownebleField.getPrice());
        ownebleFieldList.add(ownebleField);
    }

    private void pay(int price)
    {
        money=-price;
    }


}
