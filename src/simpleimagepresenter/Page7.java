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

/**
 *
 * @author tomo
 */
public class Page7 implements PageController, Initializable {
    @FXML Text t1_1;
    @FXML Text t1_2_1;
    @FXML Text t1_2_2;
    @FXML Text t1_2_3;
    @FXML Text t1_3_1;
    @FXML Text t1_3_2;
    @FXML Text t1_3_3;
    @FXML Text t1_4;
    @FXML Text t1_5;
    @FXML Text t2_1_1;
    @FXML Text t2_1_2;
    @FXML Text t2_1_3;
    @FXML Text t2_2_1;
    @FXML Text t2_2_2;
    @FXML Text t2_2_3;
    @FXML Text t2_3;
    @FXML Text t2_4;
    @FXML Text t2_5_1;
    @FXML Text t2_5_2;
    @FXML Text t2_5_3;
    @FXML Text t2_6;
    @FXML Text t2_7;
    
    
    @Override
    public boolean doAction() {
        return false;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        t1_1.setText("<AnchorPane xmlns:fx=\"http://javafx.com/fxml\" ");
        t1_2_1.setText("       fx:controller=\"");
        t1_2_2.setText("simpleimagepresenter.Page5");
        t1_2_3.setText("\">");
        t1_3_1.setText("<Text fx:id=\"");
        t1_3_2.setText("p1");
        t1_3_3.setText("\" fill=\"WHITE\" text=\"なんとか\" >");
        
        t2_1_1.setText("public class ");
        t2_1_2.setText("Page5");
        t2_1_3.setText(" implements PageController {");
        t2_2_1.setText("    @FXML Text ");
        t2_2_2.setText("p1");
        t2_2_3.setText(";");
        t2_3.setText("FadeTransition fadein = ");
        t2_4.setText("   new FadeTransition(Duration.millis(1000));");
        t2_5_1.setText("       fadein.setNode(");
        t2_5_2.setText("p1");
        t2_5_3.setText(");");
        t2_6.setText("       fadein.setToValue(1.0);");
        t2_7.setText("       fadein.play();");
    }
}
