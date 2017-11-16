package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainGUI extends Application implements ActionListener
{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("GameGUI.fxml"));
        primaryStage.setTitle("Matador");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();


    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }

}
