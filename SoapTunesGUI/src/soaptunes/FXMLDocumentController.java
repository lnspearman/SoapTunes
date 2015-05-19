/* This class handles button functionality, like a "cassette chooser"
 * Each button stops currently-playing music if possible and 
 * sets the currentSound to a new type of MusicTune
 */
package soaptunes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author lspear5
 */
public class FXMLDocumentController implements Initializable {
  
    private MusicTune currentSound = new Silence();
    
    
    @FXML
    private void setSilence(ActionEvent event)
    {
        currentSound.stopTune();
    }
    
    @FXML
    private void playSound()
    {
        currentSound.playTune();
    }
    
    
    
    
    
    @FXML
    private Label label;   
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    
    
}
