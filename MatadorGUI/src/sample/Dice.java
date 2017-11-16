package sample;

public class Dice
{

    //Creating two instances of Die
    Die die1 = new Die();
    Die die2 = new Die();
    private int value1 = die1.generateRandomEyeNumber();
    private int value2 = die2.generateRandomEyeNumber();

    public Dice()
    {
        this.die1 = die1;
        this.die2 = die2;
    }

    public int throwDice()
    {
//       int eyesFromDice = die1.generateRandomEyeNumber() + die2.generateRandomEyeNumber();
        int eyesFromDice = value1+value2;
       return (eyesFromDice);
    }

    public void numbersAreTheSame()
    {
//        if (die1.generateRandomEyeNumber() == die2.generateRandomEyeNumber())
        if (value1==value2)
        {
            System.out.println("Dice eye numbers are the same");

//            System.out.println("\ndie 1: " + die1.generateRandomEyeNumber());
//            System.out.println("die 2: " + die2.generateRandomEyeNumber());
            System.out.println("\ndie 1: " + value1);
            System.out.println("die 2: " + value2);
        }
    }

    public boolean isNumbersArethesame()
    {
//        if (die1.generateRandomEyeNumber() == die2.generateRandomEyeNumber())
        if (value1==value2)
        {
            return true;
        }
        else return false;
    }
}
