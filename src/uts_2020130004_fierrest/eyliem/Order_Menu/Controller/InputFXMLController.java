/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package uts_2020130004_fierrest.eyliem.Order_Menu.Controller;

import invoice.controller.InvoiceFXMLController;
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Errest
 */
public class InputFXMLController implements Initializable {

    @FXML
    private CheckBox ckff;
    @FXML
    private CheckBox ckegg;
    @FXML
    private CheckBox cktahu;
    @FXML
    private CheckBox ckeskopsu;
    @FXML
    private CheckBox ckskin;
    @FXML
    private CheckBox ckicetea;
    @FXML
    private CheckBox ckkulitayam;
    @FXML
    private AnchorPane Menu_List;
    private RadioButton rbhottea;
    @FXML
    private CheckBox ckhot;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void ordernow(ActionEvent event) {
        if (ckhot.isSelected()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/invoice/fxml/invoiceFXML.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                stg.setTitle("Order Menu");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_List.getScene().getWindow().hide();
                InvoiceFXMLController invoice = loader.getController();
                invoice.AmbilMenu(ckhot.getText());     
                invoice.setHarga(15000);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         if (ckegg.isSelected()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/invoice/fxml/invoiceFXML.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                stg.setTitle("Order Menu");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_List.getScene().getWindow().hide();
                InvoiceFXMLController invoice = loader.getController();
                invoice.AmbilMenu(ckegg.getText());     
                invoice.setHarga(18181);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         if (ckeskopsu.isSelected()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/invoice/fxml/invoiceFXML.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                stg.setTitle("Order Menu");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_List.getScene().getWindow().hide();
                InvoiceFXMLController invoice = loader.getController();
                invoice.AmbilMenu(ckeskopsu.getText());     
                invoice.setHarga(18181);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         if (ckff.isSelected()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/invoice/fxml/invoiceFXML.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                stg.setTitle("Order Menu");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_List.getScene().getWindow().hide();
                InvoiceFXMLController invoice = loader.getController();
                invoice.AmbilMenu(ckff.getText());     
                invoice.setHarga(15000);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         if (ckkulitayam.isSelected()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/invoice/fxml/invoiceFXML.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                stg.setTitle("Order Menu");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_List.getScene().getWindow().hide();
                InvoiceFXMLController invoice = loader.getController();
                invoice.AmbilMenu(ckkulitayam.getText());     
                invoice.setHarga(18181);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        if (ckskin.isSelected()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/invoice/fxml/invoiceFXML.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                stg.setTitle("Order Menu");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_List.getScene().getWindow().hide();
                InvoiceFXMLController invoice = loader.getController();
                invoice.AmbilMenu(ckskin.getText());     
                invoice.setHarga(18181);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         if (cktahu.isSelected()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/invoice/fxml/invoiceFXML.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                stg.setTitle("Order Menu");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_List.getScene().getWindow().hide();
                InvoiceFXMLController invoice = loader.getController();
                invoice.AmbilMenu(cktahu.getText());     
                invoice.setHarga(18181);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         if (ckicetea.isSelected()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/invoice/fxml/invoiceFXML.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                stg.setTitle("Order Menu");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_List.getScene().getWindow().hide();
                InvoiceFXMLController invoice = loader.getController();
                invoice.AmbilMenu(ckicetea.getText());     
                invoice.setHarga(18181);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }

}
