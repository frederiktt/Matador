package sample;

import com.sun.org.omg.CORBA.Initializer;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller
{
    private Game game;
    @FXML
    private TextArea textField;
    @FXML
    private TextField numbersOfPlayers;

    public Controller()
    {
        game = new Game();
    }

    public void getPlayer(Player player)
    {
    }

    public void initialize()
    {
    }

    public void handleNumbersOfPlayers(Event e)
    {
        int input = Integer.parseInt(numbersOfPlayers.getText());
        game.setNrOfPLayersInput(input);
        System.out.println();
    }

}