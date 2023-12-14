/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package uas_2020130004_fierrest.eyliem.Order_Menu.Controller;

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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import uas_2020130004_fierrest.eyliem.Controller.Ubah_Harga.FXMLUbahHargaController;
import uas_2020130004_fierrest.eyliem.Models.ListHarga.HargaMenu;
import uts_2020130004_fierrest.eyliem.Models.Menu.Menu;

/**
 * FXML Controller class
 *
 * @author Errest
 */
public class InputFXMLController implements Initializable {

    public static HargaMenu hrgmns = new HargaMenu();
    Menu mns = new Menu();
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
    @FXML
    private CheckBox ckhot;
    @FXML
    private ToggleButton HotteaEditHarga;
    @FXML
    private ToggleGroup EditHarga;
    @FXML
    private ToggleButton IceTeaEditHarga;
    @FXML
    private ToggleButton EggmushroomHargaEdit;
    @FXML
    private ToggleButton Chikenskinmushroom;
    @FXML
    private ToggleButton tahucabegaramhargaedit;
    @FXML
    private ToggleButton kulitcabegaramhargaedit;
    @FXML
    private ToggleButton kentanggorenghargaedit;
    @FXML
    private ToggleButton eskopihargaedit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        hrgmns.setHotTea(15000.0);
        hrgmns.setIceTea(18181.0);
        hrgmns.setEggMushroom(18181.0);
        hrgmns.setTahuCabeGaram(18181.0);
        hrgmns.setKulitCabeGaram(200000.0);
        hrgmns.setEskopsu(18181.0);
        hrgmns.setFrenchFries(15000.0);
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
                mns.setName(ckhot.getText());
                invoice.AmbilMenu(mns);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (ckegg.isSelected()) {
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
                mns.setName(ckegg.getText());
                invoice.AmbilMenu(mns);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (ckeskopsu.isSelected()) {
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
                mns.setName(ckeskopsu.getText());
                invoice.AmbilMenu(mns);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (ckff.isSelected()) {
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
                mns.setName(ckff.getText());
                invoice.AmbilMenu(mns);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (ckkulitayam.isSelected()) {
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
                mns.setName(ckkulitayam.getText());
                invoice.AmbilMenu(mns);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (ckskin.isSelected()) {
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
                mns.setName(ckskin.getText());
                invoice.AmbilMenu(mns);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (cktahu.isSelected()) {
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
                mns.setName(cktahu.getText());
                invoice.AmbilMenu(mns);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (ckicetea.isSelected()) {
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
                mns.setName(ckicetea.getText());
                invoice.AmbilMenu(mns);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @FXML
    private void EditHarga(ActionEvent event) {
        Alert at = new Alert(Alert.AlertType.WARNING, "Hanya Kurus Harga saja", ButtonType.OK);
        at.showAndWait();
        //Hot Tea
        if (event.getSource() == HotteaEditHarga) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/uas_2020130004_fierrest/eyliem/FXML/Ubah_Harga/FXMLUbahHarga.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                FXMLUbahHargaController price_updater = loader.getController();
                mns.setName("Hot Tea");
                price_updater.getValue(mns);
                stg.setTitle("Ubah Harga");
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                HotteaEditHarga.setSelected(true);
                HotteaEditHarga.setVisible(false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (event.getSource() == IceTeaEditHarga) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/uas_2020130004_fierrest/eyliem/FXML/Ubah_Harga/FXMLUbahHarga.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                FXMLUbahHargaController price_updater = loader.getController();
                mns.setName("Ice Tea");
                price_updater.getValue(mns);
                stg.setTitle("Ubah Harga");
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                IceTeaEditHarga.setSelected(true);
                IceTeaEditHarga.setVisible(false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (event.getSource() == EggmushroomHargaEdit) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/uas_2020130004_fierrest/eyliem/FXML/Ubah_Harga/FXMLUbahHarga.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                FXMLUbahHargaController price_updater = loader.getController();
                mns.setName("Egg Mushroom");
                price_updater.getValue(mns);
                stg.setTitle("Ubah Harga");
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                EggmushroomHargaEdit.setSelected(true);
                EggmushroomHargaEdit.setVisible(false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (event.getSource() == Chikenskinmushroom) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/uas_2020130004_fierrest/eyliem/FXML/Ubah_Harga/FXMLUbahHarga.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                FXMLUbahHargaController price_updater = loader.getController();
                mns.setName("Chicken Skin Mushroom");
                price_updater.getValue(mns);
                stg.setTitle("Ubah Harga");
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Chikenskinmushroom.setSelected(true);
                Chikenskinmushroom.setVisible(false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (event.getSource() == tahucabegaramhargaedit) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/uas_2020130004_fierrest/eyliem/FXML/Ubah_Harga/FXMLUbahHarga.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                FXMLUbahHargaController price_updater = loader.getController();
                mns.setName("Tahu Cabe Garam");
                price_updater.getValue(mns);
                stg.setTitle("Ubah Harga");
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                tahucabegaramhargaedit.setSelected(true);
                tahucabegaramhargaedit.setVisible(false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (event.getSource() == eskopihargaedit) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/uas_2020130004_fierrest/eyliem/FXML/Ubah_Harga/FXMLUbahHarga.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                FXMLUbahHargaController price_updater = loader.getController();
                mns.setName("Es Kopsu");
                price_updater.getValue(mns);
                stg.setTitle("Ubah Harga");
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                eskopihargaedit.setSelected(true);
                eskopihargaedit.setVisible(false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (event.getSource() == kentanggorenghargaedit) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/uas_2020130004_fierrest/eyliem/FXML/Ubah_Harga/FXMLUbahHarga.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                FXMLUbahHargaController price_updater = loader.getController();
                mns.setName("French Fries");
                price_updater.getValue(mns);
                stg.setTitle("Ubah Harga");
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                HotteaEditHarga.setSelected(true);
                HotteaEditHarga.setVisible(false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
