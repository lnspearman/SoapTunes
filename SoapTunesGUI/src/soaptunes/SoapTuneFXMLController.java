/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaptunes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author lspear5
 */
public class SoapTuneFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
   
    private final MusicTune sound = new MusicTune();
    
    @FXML
    private void setSilence(ActionEvent event)
    {
        sound.stopTune();
        sound.newSilence();
    }
    
    @FXML
    private void setSwotr(ActionEvent event)
    {
        sound.stopTune();
        sound.newSwotr();
    }
    
    @FXML
    private void setFresh(ActionEvent e)
    {
        sound.stopTune();
        sound.newFresh();
    }
    
    @FXML
    private void playSound()
    {
        sound.playTune();
    }
    
}
