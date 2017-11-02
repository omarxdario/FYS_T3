package com.mycompany.fys;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ContactController implements Initializable {
    

  @FXML
    public void backToContactAction(ActionEvent event) throws IOException 
    {
        //deze moet nog veranderd worden naar fxml/Contact.fxml.
        Parent backToContact = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/Credits.fxml"));
        
        Scene contactScene = new Scene(backToContact);
        contactScene.getStylesheets().add("/styles/Styles.css");
        
        Stage creditStage = new Stage();
        
        creditStage.setTitle("Contact");
        creditStage.setScene(contactScene);
        creditStage.show();
    }
      @FXML

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
