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
public class Page5 implements PageController, Initializable {
    @FXML Text p1;
    @FXML Text p2;
    @FXML Text p3;
    @FXML Text p4;
    
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
        texts = new Text[]{p1,p2,p3,p4};

        for (int i = 0; i < texts.length; i++) {
                texts[i].setOpacity(0);
        }
    }
}
