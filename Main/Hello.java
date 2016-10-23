import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Hello extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        Scene login = new Scene (vbox, 300, 150);
        primaryStage.setScene(login);
        primaryStage.show();

        Label pealkiri = new Label("Mis on parool?");
        TextField paroolFiled = new TextField();
        Button submitButton = new Button("Login");

        vbox.getChildren().addAll(pealkiri, paroolFiled, submitButton);

        Circle ring = new Circle(100);
        Pane pane = new Pane();
        pane.getChildren().add(ring);
        Scene seesStseen = new Scene (pane, 300, 300);

        submitButton.setOnAction(event -> {
            String parool = paroolFiled.getText();
            if (parool.equals("Hello World!")){
                System.out.println("Hello World!");
                primaryStage.setScene(seesStseen);
            } else {
                System.out.println("Proovi uuesti!");
            }
        });

    }
}
