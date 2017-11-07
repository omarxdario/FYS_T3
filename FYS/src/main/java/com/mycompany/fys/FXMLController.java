package com.mycompany.fys;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class FXMLController extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        stage.setTitle("FYS project");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void openHome(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        final Parent home = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));
        final Scene hScene = new Scene(home);
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        root.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.ESCAPE) {
                    System.out.println("Key Pressed: " + ke.getCode() + " Made by ShaMaster");
                    stage.setScene(hScene);
                }
            }
        });
    }

    @FXML
    public void openSubmitAction(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        final Parent home = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));
        final Scene hScene = new Scene(home);
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Submit.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        root.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.ESCAPE) {
                    System.out.println("Key Pressed: " + ke.getCode());
                    stage.setScene(hScene);
                }
            }
        });
    }

    @FXML
    public void openStatisticsAction(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        final Parent home = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));
        final Scene hScene = new Scene(home);
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Statistics.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        root.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.ESCAPE) {
                    System.out.println("Key Pressed: " + ke.getCode());
                    stage.setScene(hScene);
                }
            }
        });
    }

    @FXML
    public void openSeachLugAction(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        final Parent home = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));
        final Scene hScene = new Scene(home);
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/SearchLug.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        root.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.ESCAPE) {
                    System.out.println("Key Pressed: " + ke.getCode());
                    stage.setScene(hScene);
                }
            }
        });
    }

    @FXML
    public void openCreditsAction(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        final Parent home = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));
        final Scene hScene = new Scene(home);
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Credits.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        root.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.ESCAPE) {
                    System.out.println("Key Pressed: " + ke.getCode());
                    stage.setScene(hScene);
                }
            }
        });
    }

    @FXML
    public void backToCreditsAction(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        final Parent home = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));
        final Scene hScene = new Scene(home);
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Credits.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        root.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.ESCAPE) {
                    System.out.println("Key Pressed: " + ke.getCode());
                    stage.setScene(hScene);
                }
            }
        });
    }

    @FXML
    public void openContact(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        final Stage stage = (Stage) node.getScene().getWindow();
        final Parent home = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));
        final Scene hScene = new Scene(home);
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Contact.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        root.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.ESCAPE) {
                    System.out.println("Key Pressed: " + ke.getCode());
                    stage.setScene(hScene);
                }
            }
        });
    }

    @FXML
    public void openFAQ(final ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        final Parent home = FXMLLoader.load(getClass().getResource("/fxml/Homepage.fxml"));
        final Scene hScene = new Scene(home);
        final Stage stage = (Stage) node.getScene().getWindow();
        final Parent root = FXMLLoader.load(getClass().getResource("/fxml/FAQ.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        root.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.ESCAPE) {
                    System.out.println("Key Pressed: " + ke.getCode());
                    stage.setScene(hScene);
                }
            }
        });
    }
    
    @FXML
    public void openHelp(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/helpPopup.fxml"));
        final Scene scene = new Scene(root);
        final Stage stage = new Stage();
        stage.setTitle("Help");
        stage.setScene(scene);
        stage.show();

        root.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                if (ke.getCode() == KeyCode.ESCAPE) {
                    System.out.println("Key Pressed: " + ke.getCode());
                    stage.close();
                }
            }
        });
    }

    @FXML
    public void closeHelp(ActionEvent event) throws IOException {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
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
