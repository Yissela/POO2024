/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Dimas
 */
public class NuevoController implements Initializable {

    @FXML
    private DatePicker txFecha;
    @FXML
    private ChoiceBox<?> txEstado;
    @FXML
    private TextArea txBreve;
    @FXML
    private TextField txDelito;
    @FXML
    private Button btOfendido;
    @FXML
    private Button btDenunciado;
    @FXML
    private Button btDenunciante;
    @FXML
    private Button btGuardar;
    @FXML
    private Button BtCancelar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
