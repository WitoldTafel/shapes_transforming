package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;


public class Lane extends Rectangle {

    private static final int width = 40;
    private static final Color color = Color.GRAY;

    public Lane(Circle rect1, Circle rect2, boolean AZ, boolean one) {
        this.setWidth(width);
        this.setHeight(-2*width + Math.sqrt(Math.pow((rect1.getCenterX() - rect2.getCenterX()), 2) + Math.pow((rect1.getCenterY() - rect2.getCenterY()), 2)));
        this.setFill(color);
        if (AZ){
            this.getTransforms().add(new Rotate(Math.toDegrees(Math.atan2(rect2.getCenterY() - rect1.getCenterY(), rect2.getCenterX() - rect1.getCenterX())) - 90, rect1.getCenterX(), rect1.getCenterY()));
            this.setX(rect1.getCenterX());
            this.setY(rect1.getCenterY());
        }else{
            this.getTransforms().add(new Rotate(Math.toDegrees(Math.atan2(rect1.getCenterY() - rect2.getCenterY(), rect1.getCenterX() - rect2.getCenterX())) - 90, rect2.getCenterX(), rect2.getCenterY()));
            this.setX(rect2.getCenterX());
            this.setY(rect2.getCenterY());
        }

        this.setStroke(Color.BLACK);
    }
}