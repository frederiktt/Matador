package sample;

import java.util.ArrayList;

public class PrintToConsole
{
    private ArrayList<Player> players;
    private ArrayList<Driver> driver;
    private int playerNumber;
    private int numbersOfPLayers;

    private Dice dice;

    public PrintToConsole()
    {
    }

    //Constructor for printing current fieldnumber and name for the current player
    public PrintToConsole(ArrayList players, ArrayList driver, int i)
    {
        this.players = players;
        this.driver = driver;
        this.playerNumber = i;
    }

    //Constructor for printing eyes from dice
    public PrintToConsole(Dice dice)
    {
        this.dice = dice;
    }

    //Constructor for printing numbers of players
    public PrintToConsole(int numbersOfPLayers)
    {
        this.numbersOfPLayers = numbersOfPLayers;
    }

    private String currentPlayerName(int i)
    {
        String playerName = players.get(i).getPlayerName();
        return playerName;
    }


    private String currentFieldName(int i, ArrayList<Player> players)
    {
        String currentFieldNumber = driver.get(i).board()[players.get(i).getCurrentField()].getName();
        return currentFieldNumber;
    }

    private int currentFieldNumber(int i, ArrayList<Player> players)
    {
        int currentFieldName = driver.get(i).board()[players.get(i).getCurrentField()].getNumber();
        return currentFieldName;
    }


    public void printCurrentPlayerAndFieldNameAndFieldNumber(int i, ArrayList<Player> players)
    {
        System.out.println("Player " + currentPlayerName(i) + " is on " +
                                   currentFieldName(i, players) +
                                   "(" + currentFieldNumber(i, players) + ")");
    }

    public void playerLandedOn(int i, ArrayList<Player> players)
    {
        System.out.println("\nYou landed on: " +
                                   currentFieldName(i, players) + "(" + currentFieldNumber(i, players) + ")");
    }

    public void printCurrentPLayersTurn(int i)
    {
        System.out.println("\nIt's " + currentPlayerName(i) + " turn");
    }

    public void printPressEnter()
    {
        System.out.println("Press enter:");
    }

    public void printDiceEyes(Dice dice)
    {
        System.out.println("You got: " + dice.throwDice());
    }

    public void printNumbersofPLayer(int numbersOfPLayers)
    {
        System.out.println("Number of players are: " + numbersOfPLayers);
    }

    public void printEnterNumbersOfPLayers()
    {
        System.out.println("Enter numbers of players: ");
    }

    public void printYouGotTwoEquals()
    {
        System.out.println("You got two equals\nPress enter:");
    }

    public void printYouGotAfterTwoEqualsThrow(Dice diceNewThrowAfterTwoEquals, int nrOfTrhows)
    {
        System.out.println("You got: " + diceNewThrowAfterTwoEquals.throwDice() + " number of throws: " + nrOfTrhows);
    }
}
