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

public class CreditsController implements Initializable {

    @FXML
    public void openContact(ActionEvent event) throws IOException {
        //deze moet nog veranderd worden naar fxml/Contact.fxml.
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
