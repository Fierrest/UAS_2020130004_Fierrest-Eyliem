/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package invoice.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.text.NumberFormat;
import java.util.Locale;
import javafx.scene.image.Image;
import uas_2020130004_fierrest.eyliem.Models.Menu.Menu;
import uas_2020130004_fierrest.eyliem.Order_Menu.Controller.InputFXMLController;

/**
 * FXML Controller class
 *
 * @author Errest
 */
public class InvoiceFXMLController implements Initializable {

    //Curency Formatter
    Locale Indonesia = new Locale("in", "ID");
    NumberFormat formater = NumberFormat.getCurrencyInstance(Indonesia);

    @FXML
    private AnchorPane invoice_total;

    @FXML
    private TextArea menu;
    @FXML
    private TextArea harga_txt;
    @FXML
    private TextField txtpajak;
    @FXML
    private TextField txttotal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void getValue(Menu mns) {
        String nama;
        double Harga;
        switch (mns.getName()) {
            case "Hot Tea": {
                nama = mns.getName();
                menu.setText(mns.getName());
                Harga = InputFXMLController.hrgmns.getHotTea();
                harga_txt.setText(String.valueOf(Harga));
                break;
            }
            case "Ice Tea": {
                menu.setText(mns.getName());
                Harga = InputFXMLController.hrgmns.getIceTea();
                harga_txt.setText(String.valueOf(Harga));
                break;
            }
            case "Egg Mushroom": {
                menu.setText(mns.getName());
                Harga = InputFXMLController.hrgmns.getEggMushroom();
                harga_txt.setText(String.valueOf(Harga));
                break;
            }
            case "Chiken Skin Mushroom": {
                menu.setText(mns.getName());
                Harga = InputFXMLController.hrgmns.getChikenSkinMushroom();
                harga_txt.setText(String.valueOf(Harga));
                break;
            }
            case "Tahu Cabe Garam": {
                menu.setText(mns.getName());
                Harga = InputFXMLController.hrgmns.getTahuCabeGaram();
                harga_txt.setText(String.valueOf(Harga));
                break;
            }
            case "Kulit Cabe Garam": {
                menu.setText(mns.getName());
                Harga = InputFXMLController.hrgmns.getKulitCabeGaram();
                harga_txt.setText(String.valueOf(Harga));
                break;
            }
            case "Eskopsu": {
                menu.setText(mns.getName());
                Harga = InputFXMLController.hrgmns.getEskopsu();
                harga_txt.setText(String.valueOf(Harga));

                break;
            }
            case "French Fries": {
                menu.setText(mns.getName());
                Harga = InputFXMLController.hrgmns.getFrenchFries();
                harga_txt.setText(String.valueOf(Harga));
                break;
            }
        }
        double na = (Double.valueOf(harga_txt.getText()) * 0.01);
        txtpajak.setText(formater.format(na));
        double ab = (Double.valueOf(harga_txt.getText()) * 0.01) + (Double.valueOf(harga_txt.getText()));
        txttotal.setText(formater.format(ab));

    }


  
    @FXML
    private void btnkeluar(ActionEvent event) {
        System.exit(0);
    }
}
