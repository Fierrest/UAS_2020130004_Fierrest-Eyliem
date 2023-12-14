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
import invoice.fxml.modelinvoice;
import uts_2020130004_fierrest.eyliem.Models.Menu.Menu;

/**
 * FXML Controller class
 *
 * @author Errest
 */
public class InvoiceFXMLController implements Initializable {

    modelinvoice dt = new modelinvoice();
    
    

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

    public void AmbilMenu(Menu mn) {
        menu.setText(mn.getName());
    }

    public void setHarga(int Harga) {
        harga_txt.setText(String.valueOf(Harga));
        dt.getHarga_txt(Integer.parseInt(harga_txt.getText()));
        double na = (Double.valueOf(harga_txt.getText()) * 0.01);

        txtpajak.setText(String.valueOf(na));
        double ab = (Double.valueOf(harga_txt.getText()) * 0.01) + (Double.valueOf(harga_txt.getText()));

        txttotal.setText(String.valueOf(ab));

    }

    @FXML
    private void btnkeluar(ActionEvent event) {
        System.exit(0);
    }
}
