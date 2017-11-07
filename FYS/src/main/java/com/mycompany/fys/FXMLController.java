package com.mycompany.fys;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXMLController extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

        @FXML
    public void openHome(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));/* Exception */
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    
    
    @FXML
    public void testFunction(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene_1.fxml"));/* Exception */
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


      @FXML
    public void openSubmitAction(ActionEvent event) throws IOException {

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Submit.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
       @FXML
    public void openStatisticsAction(ActionEvent event) throws IOException {

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Statistics.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
        @FXML
    public void openSeachLugAction(ActionEvent event) throws IOException {

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/SearchLug.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void openCreditsAction(ActionEvent event) throws IOException {

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Credits.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void backToCreditsAction(ActionEvent event) throws IOException {

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Credits.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void openContact(ActionEvent event) throws IOException {

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Contact.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void openFAQ(ActionEvent event) throws IOException {

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/FAQ.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void printPDFFile(ActionEvent event) throws IOException {

        try {

            String fileName = "PDFoutput.pdf";

            PDDocument doc = new PDDocument();
            PDPage page = new PDPage();

            doc.addPage(page);

            PDPageContentStream content = new PDPageContentStream(doc, page);

            content.beginText();
            content.setFont(PDType1Font.TIMES_ROMAN, 26);
            content.moveTextPositionByAmount(220, 750);
            content.drawString("Titel");
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.TIMES_ROMAN, 16);
            content.moveTextPositionByAmount(80, 700);
            content.drawString("Inhoud");
            content.endText();

            content.close();
            doc.save(fileName);
            doc.close();

            System.out.println("your file was saved in: " + System.getProperty("user.dir"));

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
