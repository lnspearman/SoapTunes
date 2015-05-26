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
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author lspear5
 */
public class SoapTuneFXMLController implements Initializable {
    
    private final MusicTune sound = new MusicTune();
    @FXML
    private ImageView imagething;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        imagething.setOpacity(0.0);
    }   
    
    
    
    @FXML
    private void setSilence(ActionEvent event)
    {
        imagething.setOpacity(0.0);
        sound.stopTune();
        sound.newSilence();
    }
    
    
    
    @FXML
    private void setSwotr(ActionEvent event)
    {
        imagething.setOpacity(0.0);
        sound.stopTune();
        sound.newSwotr();
    }
    
    @FXML
    private void setFresh(ActionEvent e)
    {
        imagething.setOpacity(0.0);
        sound.stopTune();
        sound.newFresh();
    }
    
    @FXML
    private void setMew(ActionEvent event)
    {
        imagething.setOpacity(0.0);
        sound.stopTune();
        sound.newMew();
    }
    
    @FXML
    private void playSound()
    {
        sound.playTune();
        imagething.setOpacity(1.0);
        
    }
    
    
    
}
