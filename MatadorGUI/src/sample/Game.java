package sample;

import javafx.geometry.Insets;

import java.util.ArrayList;
import java.util.Scanner;

public class Game
{
    //        ASCII ascii= new ASCII();
    //        ascii.ascii1();
    private int nrOfPLayersInput=1;

    public void playGame()
    {
        Scanner input = new Scanner(System.in);

        //Creating print object with no.arg constructor
        PrintToConsole printNumbersOfPLayers = new PrintToConsole();
        //Creating print object with no.arg constructor
        PrintToConsole printToConsole = new PrintToConsole();

        //Print "Enter numbers of players
        printNumbersOfPLayers.printEnterNumbersOfPLayers();
        //Scanner input -> Numbers of players
//        int nrOfPLayersInput = input.nextInt();
//        nrOfPLayersInput=1;

        // Consume newline left-over -> Prepare to receive next string input
        input.nextLine();
        int [] nrOfPLayers = new int[nrOfPLayersInput];

        ArrayList<Player>playersArrayList = new ArrayList<>();
        ArrayList<Driver> driversArrayList = new ArrayList<>();

        //Create print object
        PrintToConsole printNumberOfPLayers = new PrintToConsole(nrOfPLayers.length);

        //Print number of players
        printNumberOfPLayers.printNumbersofPLayer(nrOfPLayers.length);

        //Create players
        String name;
        for (int i =0; i< nrOfPLayersInput;i++)
        {
            System.out.println("Enter name of Player "+(i+1));
            name = input.nextLine();
            playersArrayList.add(new Player(name));
            driversArrayList.add(new Driver(name));
        }
            int number = 1;

//        driversArrayList.get(0).fillFields();
//        System.out.println("test: "+driversArrayList.get(0).getPlate()[2]);

            while (number != 0 )
            {
                for (int i =0; i<nrOfPLayers.length;i++)
                {

                    //Create PrintToConsole with constructor
                    // for printing current fieldnumber and name for the current player)
                    PrintToConsole printPlayerStatus =
                            new PrintToConsole(playersArrayList,driversArrayList,i);

                    //Print who's turn
                    printPlayerStatus.printCurrentPLayersTurn(i);

                    //Prints "PLayername" is on "Currentfield" (fieldnumber)
                    printPlayerStatus.printCurrentPlayerAndFieldNameAndFieldNumber
                            (i,playersArrayList);

                    //Print "Press enter:"
                    printToConsole.printPressEnter();

                    //Read scanner input
                    String throwDice = input.nextLine();

                        if (throwDice.equals(""))
                        {
                            //Instantiates new Dice object
                            Dice dice = new Dice();

                            //Move player
                            playersArrayList.get(i).move(dice);

                            //Print "You got" -> eyes from dice
                            printPlayerStatus.printDiceEyes(dice);

                            int nrOfTrhows =1;
                            dice.numbersAreTheSame();
                            boolean twoEquals=false;

                            //Print the field current player landed on
                            printPlayerStatus.playerLandedOn(i,playersArrayList);

                                while (dice.isNumbersArethesame() && nrOfTrhows <=3
                                        && twoEquals==false)
                                {
                                    //Print "You got two equals\nPress enter:"
                                    printToConsole.printYouGotTwoEquals();
                                    throwDice = input.nextLine();
                                    if (throwDice.equals(""))
                                    {
                                        Dice diceNewThrowAfterTwoEquals = new Dice();
                                        playersArrayList.get(i).move(diceNewThrowAfterTwoEquals);

                                        //Print
                                        printPlayerStatus.playerLandedOn(i,playersArrayList);

                                        //Print "You got:
                                        printToConsole.printYouGotAfterTwoEqualsThrow
                                                (diceNewThrowAfterTwoEquals,nrOfTrhows);
                                        if (diceNewThrowAfterTwoEquals.isNumbersArethesame()==false)
                                        {
                                            twoEquals=true;
                                        }
                                        nrOfTrhows++;
                                    }
                                }
                        }

                    if(playersArrayList.get(i).getRounds()==5)
                    {
                        System.out.println("\n"+ playersArrayList.get(i).getPlayerName() +
                                                   " has reached " +playersArrayList.get(i).getRounds()+
                                                   " rounds");
                        number = 0;
                    }
                }
            }

        }

    public int getNrOfPLayersInput()
    {
        return nrOfPLayersInput;
    }

    public void setNrOfPLayersInput(int nrOfPLayersInput)
    {

        this.nrOfPLayersInput = nrOfPLayersInput;

    }


}
