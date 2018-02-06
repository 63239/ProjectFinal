import Models.DatabaseConnection;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application
{
    public static DatabaseConnection database;

    public static String theme = "dark_theme";
    public static Button[] myButtons = new Button[6];


    @Override
    public void start(Stage stage) throws Exception
    {
        database = new DatabaseConnection("MCAD.db");

        Pane root = new Pane();

        Scene scene = new Scene(root, 1024, 768);

        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();

        scene.getStylesheets().add("stylesheet.css");

        VBox boxOfButtons = new VBox(10);

        myButtons[0] = new Button("Button number one");
        myButtons[0].setPrefSize(250, 50);
        myButtons[0].setOnAction((ActionEvent ae) -> openNewStage(root)); // opens a new stage

        myButtons[1] = new Button("Button number two");
        myButtons[1].setPrefSize(250, 50);
        myButtons[1].setOnAction((ActionEvent ae) -> printText(ae)); // prints text to console

        myButtons[2] = new Button("Button number three");
        myButtons[2].setPrefSize(250, 50);
        myButtons[2].setOnAction((ActionEvent ae) -> printText(ae)); // prints text to console

        myButtons[3] = new Button("Button number four");
        myButtons[3].setPrefSize(250, 50);
        myButtons[3].setOnAction((ActionEvent ae) -> printText(ae)); // prints text to console

        myButtons[4] = new Button("Button number five");
        myButtons[4].setPrefSize(250, 50);
        myButtons[4].setOnAction((ActionEvent ae) -> printText(ae));  // prints text to console

        myButtons[5] = new Button("Theme changer");
        myButtons[5].setPrefSize(250, 50);
        myButtons[5].setOnAction((ActionEvent ae) -> changeTheme(ae));  // cycles through the different themes


        boxOfButtons.getChildren().addAll(myButtons);

        updateTheme();

        root.getChildren().add(boxOfButtons);

         /**
        ListView<String> list = new ListView<>();
        ObservableList<String> items = FXCollections.observableArrayList ("Playlist", "Playlist 2", "Playlist 3");
        list.setItems(items);
        list.setPrefWidth(100);
        list.setPrefHeight(50);
        root.getChildren().add(list);
         */

    }

    public static void main(String[] args)
    {
        launch(args);
    }

    public static void openNewStage(Pane parent)
    {
        StageTwo newStage = new StageTwo(parent);
    }

    public static void printText(ActionEvent ae) { System.out.println("You pressed a button!"); }

    public static void changeTheme(ActionEvent ae) {
        if (theme.equals("dark_theme")) {
            theme = "light_theme";
        } else if(theme.equals("light_theme")) {
            theme = "red_theme";
        } else if(theme.equals("red_theme")) {
            theme = "green_theme";
        } else if(theme.equals("green_theme")) {
            theme = "blue_theme";
        } else {
            theme = "dark_theme";
        }
        updateTheme();
    }

    public static void updateTheme() {
        for (int i = 0; i < 6; i++) {
            myButtons[i].getStyleClass().clear();
            myButtons[i].getStyleClass().add(theme);
        }
    }
}