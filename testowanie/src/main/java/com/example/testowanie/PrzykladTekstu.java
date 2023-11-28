package com.example.testowanie;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PrzykladTekstu extends Application {
    @Override
    public void start(Stage stage) {

        Text text1 = new Text();
        text1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        text1.setText("Jak tam?");

        text1.setX(50);
        text1.setY(75);
        text1.setStrikethrough(true);

        Text text2 = new Text("Witam w mojej aplikacji");
        text2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        text2.setX(50);
        text2.setY(150);
        text2.setUnderline(true);


        Group root = new Group(text1, text2);

        Scene scene = new Scene(root, 600, 300);

        stage.setTitle("Przykład aplikacji");

        stage.setScene(scene);

        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
