package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Sample");
        stage.setWidth(1000);
        stage.setHeight(690);


        Circle point1 = new Circle(200,300,40,Color.YELLOW);
        ((Group) scene.getRoot()).getChildren().add(point1);


        Circle point2 = new Circle(700,200,40,Color.GREEN);
        ((Group) scene.getRoot()).getChildren().add(point2);

        Circle point3 = new Circle(700,500,40,Color.RED);
        ((Group) scene.getRoot()).getChildren().add(point3);


        Rectangle rect = new Lane(point1,point2,false,false);
        Rectangle rect2 = new Lane(point1,point3,false,false);

        Rectangle rect4 = new Lane(point1,point2,true,false);
        Rectangle rect5 = new Lane(point1,point3,true,false);
       // Rectangle rect6 = new Lane(point3,point2,true,false);

        //rect.getTransforms().add(new Rotate(45,0,0)); //
        //rect.setRotate(45);

        ((Group) scene.getRoot()).getChildren().add(rect);
        ((Group) scene.getRoot()).getChildren().add(rect2);
        ((Group) scene.getRoot()).getChildren().add(rect4);
        ((Group) scene.getRoot()).getChildren().add(rect5);
       // ((Group) scene.getRoot()).getChildren().add(rect6);

        stage.setScene(scene);
        stage.show();
    }
}