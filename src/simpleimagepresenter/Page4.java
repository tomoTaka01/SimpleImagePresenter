/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleimagepresenter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import transition.NodeTransitions;

/**
 *
 * @author tomo
 */
public class Page4 implements PageController, Initializable {
    @FXML Text p1;
    @FXML Text p2;
    @FXML Text p3;
    @FXML Text p4;
    @FXML Text p5;
    @FXML Text p6;
    @FXML Text p7;
    @FXML Text p8;
    
    private Text[] texts;
    
    private int index = 0;

    @Override
    public boolean doAction() {
        if (index < texts.length) {
                NodeTransitions.fadein(texts[index]);
                index++;
                return true;
        }
            return false;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        texts = new Text[]{p8,p6,p4,p2};

        for (int i = 0; i < texts.length; i++) {
                texts[i].setOpacity(0);
        }
    }
}
