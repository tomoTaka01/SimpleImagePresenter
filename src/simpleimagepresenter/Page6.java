/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleimagepresenter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 *
 * @author tomo
 */
public class Page6 implements PageController, Initializable {
    @FXML StackPane stackPane;
    @FXML Circle c1;
    @FXML Text t1;
    
    private Timeline tl;
    private AnimationTimer timer;    
    private Integer i =0;
    private int x = 0;
    
    private int index = 0;

    @Override
    public boolean doAction() {
        switch (index) {
            case 0:
                tl = new Timeline();
                tl.setCycleCount(Timeline.INDEFINITE);
                tl.setAutoReverse(true);
                timer = new AnimationTimer() {
                    @Override
                    public void handle(long l) {
                        t1.setText(i.toString());
                        i++;
                    }
                };

                KeyValue kx = new KeyValue(stackPane.scaleXProperty(), 2);
                KeyValue ky = new KeyValue(stackPane.scaleYProperty(), 2);
                Duration duration = Duration.millis(2000);
                EventHandler<ActionEvent> onFinished = new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent t) {
                        i += 100;
                        stackPane.setTranslateX(i);
                        i = 0;
                    }
                ;

                };
                    KeyFrame keyFrame = new KeyFrame(duration, onFinished, kx, ky);

                tl.getKeyFrames().add(keyFrame);
                tl.play();
                timer.start();

                c1.setOpacity(1);
                t1.setOpacity(1);
                index++;
                return true;
            case 1:
                index++;
            default:
                return false;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        t1.setText("1");
        c1.setOpacity(0);
        t1.setOpacity(0);
    }
}
