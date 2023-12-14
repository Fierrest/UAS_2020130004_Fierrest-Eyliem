/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package uas_2020130004_fierrest.eyliem.Controller.Ubah_Harga;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import uas_2020130004_fierrest.eyliem.Models.Menu.Menu;
import uas_2020130004_fierrest.eyliem.Order_Menu.Controller.InputFXMLController;

/**
 * FXML Controller class
 *
 * @author Blizzard
 */
public class FXMLUbahHargaController implements Initializable {

    @FXML
    private ImageView Image_Menu;
    @FXML
    private Text Nama_Menu;
    @FXML
    private TextField txt_Harga;
    @FXML
    private Button ubahbtn;
    @FXML
    private Button batalbtn;
    @FXML
    private Button reset_btn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        txt_Harga.isFocused();
    }

    public void getValue(Menu mns) {
        String nama;
        double Harga;
        switch (mns.getName()) {
            case "Hot Tea": {
                nama = mns.getName();
                Nama_Menu.setText(mns.getName());
                Harga = InputFXMLController.hrgmns.getHotTea();
                txt_Harga.setText(String.valueOf(Harga));
                File fileHottea = new File("src/assets/images/teh manis panas.jpg");
                Image imageHottea = new Image(fileHottea.toURI().toString());
                Image_Menu.setImage(imageHottea);
                break;
            }
            case "Ice Tea": {
                Nama_Menu.setText(mns.getName());
                Harga = InputFXMLController.hrgmns.getIceTea();
                txt_Harga.setText(String.valueOf(Harga));
                File fileIcetea = new File("src/assets/images/es teh manis.jpg");
                Image imageIcetea = new Image(fileIcetea.toURI().toString());
                Image_Menu.setImage(imageIcetea);
                break;
            }
            case "Egg Mushroom": {
                Nama_Menu.setText(mns.getName());
                Harga = InputFXMLController.hrgmns.getEggMushroom();
                txt_Harga.setText(String.valueOf(Harga));
                File fileEggMushroom = new File("src/assets/images/egg mushroom.jpg");
                Image imageEggMushrooom = new Image(fileEggMushroom.toURI().toString());
                Image_Menu.setImage(imageEggMushrooom);
                break;
            }
            case "Chiken Skin Mushroom": {
                Nama_Menu.setText(mns.getName());
                Harga = InputFXMLController.hrgmns.getChikenSkinMushroom();
                txt_Harga.setText(String.valueOf(Harga));
                File fileChickenSkinMushroom = new File("src/assets/images/chiken skin.jpg");
                Image imageChickenSkinMushroom = new Image(fileChickenSkinMushroom.toURI().toString());
                Image_Menu.setImage(imageChickenSkinMushroom);
                break;
            }
            case "Tahu Cabe Garam": {
                Nama_Menu.setText(mns.getName());
                Harga = InputFXMLController.hrgmns.getTahuCabeGaram();
                txt_Harga.setText(String.valueOf(Harga));
                File fileIcetea = new File("src/assets/images/tahu cabe garam.jpg");
                Image imageIcetea = new Image(fileIcetea.toURI().toString());
                Image_Menu.setImage(imageIcetea);
                break;
            }
            case "Kulit Cabe Garam": {
                Nama_Menu.setText(mns.getName());
                Harga = InputFXMLController.hrgmns.getKulitCabeGaram();
                txt_Harga.setText(String.valueOf(Harga));
                File fileIcetea = new File("src/assets/images/kulit cabe garam.jpg");
                Image imageIcetea = new Image(fileIcetea.toURI().toString());
                Image_Menu.setImage(imageIcetea);
                break;
            }
            case "Eskopsu": {
                Nama_Menu.setText(mns.getName());
                Harga = InputFXMLController.hrgmns.getEskopsu();
                txt_Harga.setText(String.valueOf(Harga));
                File fileIcetea = new File("src/assets/images/es kopi susu.jpg");
                Image imageIcetea = new Image(fileIcetea.toURI().toString());
                Image_Menu.setImage(imageIcetea);
                break;
            }
            case "French Fries": {
                Nama_Menu.setText(mns.getName());
                Harga = InputFXMLController.hrgmns.getFrenchFries();
                txt_Harga.setText(String.valueOf(Harga));
                File fileIcetea = new File("src/assets/images/french friews.jpg");
                Image imageIcetea = new Image(fileIcetea.toURI().toString());
                Image_Menu.setImage(imageIcetea);
                break;
            }

        }
    }

    @FXML
    private void ubahklik(ActionEvent event) {
        Alert art = new Alert(Alert.AlertType.INFORMATION, "Ubah Harga Berhasil sesusai yang diharapkan!!", ButtonType.OK);
        art.showAndWait();
        if (art.getResult() == ButtonType.OK) {
            //Hot Tea
            InputFXMLController.hrgmns.setHotTea(Double.parseDouble(txt_Harga.getText()));

            //Ice Tea
            InputFXMLController.hrgmns.setIceTea(Double.parseDouble(txt_Harga.getText()));
            
            //Egg Mushroom
            InputFXMLController.hrgmns.setChikenSkinMushroom(Double.parseDouble(txt_Harga.getText()));
            
            //Chicken Skin Mushroom
            InputFXMLController.hrgmns.setChikenSkinMushroom(Double.parseDouble(txt_Harga.getText()));
            
            //Tahu Cabe Garam
            InputFXMLController.hrgmns.setTahuCabeGaram(Double.parseDouble(txt_Harga.getText()));
            
            //Kulit Cabe Garam
            InputFXMLController.hrgmns.setKulitCabeGaram(Double.parseDouble(txt_Harga.getText()));
            
            //Eskopsu
            InputFXMLController.hrgmns.setEskopsu(Double.parseDouble(txt_Harga.getText()));
            
            //Frence Fries
            InputFXMLController.hrgmns.setFrenchFries(Double.parseDouble(txt_Harga.getText()));
            ubahbtn.getScene().getWindow().hide();
        }
    }

    @FXML
    private void Batalkllik(ActionEvent event) {
        Alert art = new Alert(Alert.AlertType.CONFIRMATION, "Anda Yakin untuk membatalkan progress ini?", ButtonType.YES,
                ButtonType.NO);
        art.showAndWait();
        if (art.getResult() == ButtonType.YES) {
            batalbtn.getScene().getWindow().hide();
        }
    }

    @FXML
    private void reset_klik(ActionEvent event) {
        Alert art = new Alert(Alert.AlertType.WARNING, "Data akan permanen dihapus dan anda tidak dapat melakukan apapaun!!", ButtonType.YES,
                ButtonType.NO);
        art.showAndWait();
        if (art.getResult() == ButtonType.YES) {
            File filefirst = new File(
                    "/src/assets/images/logo.jpeg");
            Image imagesfirst = new Image(filefirst.toURI().toString());
            Image_Menu.setImage(imagesfirst);
            Image_Menu.getImage();
            Nama_Menu.setText("");
            txt_Harga.setText("");
        }
    }
}
