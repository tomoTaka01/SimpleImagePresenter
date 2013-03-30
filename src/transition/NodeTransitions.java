/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transition;

import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 *
 * @author tomo
 */
public class NodeTransitions {

    public static void fadein(Node node) {
        fadein(node, 1000);
    }
    public static void fadein(Node node, double ms) {
        FadeTransition fadein = new FadeTransition(Duration.millis(ms));
        fadein.setNode(node);
        fadein.setToValue(1.0);
        fadein.play();
    }
}
