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
import javafx.scene.control.Label;

/**
 *
 * @author lspear5
 */
public class FXMLDocumentController implements Initializable {
  
    private MusicTune currentSound;
    
    
    @FXML
    private void setSilence(ActionEvent event)
    {
        currentSound = new Silence();
    }
    
    @FXML
    private void setJazz(ActionEvent event)
    {
        currentSound = new JazzTune();
    }
    
    @FXML
    private void setFuture(ActionEvent event)
    {
        currentSound = new FutureTune();
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
