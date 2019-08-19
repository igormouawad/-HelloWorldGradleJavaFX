package br.com.mouawad.exemplos.HelloWorldGradleJavaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Igor M Mouawad
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/FXML/HelloWorld.fxml"));
        stage.setScene(new Scene(parent, 500, 100));
        stage.setTitle("HelloWorld Gradle + JAVAFX + FXML + JAVA 12");
        stage.show();
        
    }

}
