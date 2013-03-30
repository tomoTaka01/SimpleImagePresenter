/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleimagepresenter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.FillTransition;
import javafx.animation.SequentialTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 *
 * @author tomo
 */
public class Page8 implements PageController, Initializable {
    @FXML AnchorPane pane;
    @FXML Text p1;
    @FXML Text p2;
    
    private int index = 0;

    @Override
    public boolean doAction() {
        switch (index) {
            case 0:
                FadeTransition fadein = new FadeTransition(new Duration(1000));
                fadein.setNode(p1);
                fadein.setToValue(1.0);
                fadein.play();
                FadeTransition fadein2 = new FadeTransition(new Duration(1000));
                fadein2.setNode(p2);
                fadein2.setToValue(1);
                fadein2.play();
                Rectangle rect = new Rectangle(0, 0, SimpleImagePresenter.WIDTH, SimpleImagePresenter.HEIGHT);
                rect.setFill(null);
                pane.getChildren().add(rect);
                FillTransition fill = new FillTransition(new Duration(5000l), rect, Color.rgb(0, 0, 0, 0), Color.web("#000033"));
                FadeTransition fadeout = new FadeTransition(new Duration(1000));
                fadeout.setNode(pane);
                fadeout.setToValue(0);
                SequentialTransition sequential = new SequentialTransition(fill, fadeout);
                sequential.play();
                index++;
                return true;
            default:
                return false;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        p1.setOpacity(0.0);
        p2.setOpacity(0.0);
    }
}
