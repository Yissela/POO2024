/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ventanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Dimas
 */
public class OfendidoController implements Initializable {

    @FXML
    private TextField txtId;
    @FXML
    private TextArea txtReferencia;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtGenero;
    @FXML
    private TextField txtEstado;
    @FXML
    private TextField txtDelitos;
    @FXML
    private TextField txtMunicipio;
    @FXML
    private TextField txtAldea;
    @FXML
    private TextField txtCalle;
    @FXML
    private TextField txtBloque;
    @FXML
    private Button btGuardad;
    @FXML
    private Button BtBuscar;
    @FXML
    private ComboBox<?> txtDepartamento;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
