package chris.portfoliofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private Stage primaryStage;

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Bienvenu");
        menuPrincipal();
    }

    private void menuPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("Menu.fxml"));
            AnchorPane menuLayout = loader.load();
            Scene scene = new Scene(menuLayout, 678, 604);
            scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
            primaryStage.setScene(scene);
            MenuController controller = loader.getController();
            controller.setMainApp(this);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {
        launch();
    }
}