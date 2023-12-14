/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package uas_2020130004_fierrest.eyliem.FXML_Splash_Screen.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Errest
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane Smash_Shake;
    @FXML
    private Label label;
  

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Order_btn(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/uas_2020130004_fierrest/eyliem/Order_Menu/FXML/inputFXML.fxml"));
            Parent root = (Parent) loader.load();
            Scene scene = new Scene(root);
            Stage stg = new Stage();
            stg.setTitle("Order Menu");
            stg.initModality(Modality.APPLICATION_MODAL);
            stg.setResizable(false);
            stg.setIconified(false);
            stg.setScene(scene);
            stg.show();
            Smash_Shake.getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
