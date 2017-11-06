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

public class FXMLController implements Initializable {
    
        
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
    }

  @FXML
    public void testFunction(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/Scene_1.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        Stage stage = new Stage();
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void backToContactAction(ActionEvent event) throws IOException {

        Parent backToContact = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/Credits.fxml"));

        Scene contactScene = new Scene(backToContact);
        contactScene.getStylesheets().add("/styles/Styles.css");

        Stage creditStage = new Stage();

        creditStage.setTitle("Contact");
        creditStage.setScene(contactScene);
        creditStage.show();
    }

    @FXML
    public void openContact(ActionEvent event) throws IOException {

        Parent openContact = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/Contact.fxml"));

        Scene contactScene = new Scene(openContact);
        contactScene.getStylesheets().add("/styles/Styles.css");

        Stage creditStage = new Stage();

        creditStage.setTitle("Contact");
        creditStage.setScene(contactScene);
        creditStage.show();
    }

    @FXML
    public void openFAQ(ActionEvent event) throws IOException {

       Parent openFAQ = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/FAQ.fxml"));

        Scene FAQScene = new Scene(openFAQ);
        FAQScene.getStylesheets().add("/styles/Styles.css");

        Stage FAQStage = new Stage();

        FAQStage.setTitle("Contact");
        FAQStage.setScene(FAQScene);
        FAQStage.show();

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
