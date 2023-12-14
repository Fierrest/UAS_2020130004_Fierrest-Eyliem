/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package uas_2020130004_fierrest.eyliem.Controller.Ubah_Harga;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import uts_2020130004_fierrest.eyliem.Models.Menu.Menu;

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
    }
    
    public void getValue(Menu mns) {
        String nama;
        switch (mns.getName()) {
            case "Hot Tea": {
                nama = mns.getName();
                Nama_Menu.setText(mns.getName());
                
                break;
            }
        }
    }
    
    @FXML
    private void ubahklik(ActionEvent event) {
    }
    
    @FXML
    private void Batalkllik(ActionEvent event) {
    }
    
    @FXML
    private void reset_klik(ActionEvent event) {
    }
    
}
