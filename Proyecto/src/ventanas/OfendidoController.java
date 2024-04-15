/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ventanas;


import DAO.OfendidoDAO;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import model.delito;
import model.ofendido;
import proyecto.data;

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
    private ComboBox<String> txtDepartamento;
    
    ObservableList<String> departamentos = FXCollections.observableArrayList(
            "Atlántida",
"Choluteca",
"Colón",
"Comayagua",
"Copán",
"Cortés",
"El Paraíso",
"Francisco Morazán",
"Gracias a Dios",
"Intibucá",
"Islas de la Bahía",
"La Paz",
"Lempira",
"Ocotepeque",
"Olancho",
"Santa Bárbara",
"Valle",
"Yoro"
);
    
    /**
     * Initializes the controller class.
     */
    
    
    private OfendidoDAO OfendidoDao;
    private  data conexion = new data();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
       txtDepartamento.setItems(departamentos);
        
    }    

    @FXML
    private void guardar(ActionEvent event) {
        
        if (!txtId.getText().equals("") && !txtNombre.getText().equals("") ){
            ofendido ofendido = new ofendido();
            ofendido.setId(Integer.parseInt(txtId.getText()));
            ofendido.setNombre(txtNombre.getText());
            ofendido.setApellido(txtApellido.getText());
            //ofendido.setEstado_civil(txtEstado.textProperty());
            ofendido.setSexo(txtDelitos.getText());
            ofendido.setGenero(txtGenero.getText());
            ofendido.setDireccion(txtEstado.getText());
            try{
                this.conexion.ConectarBases();
                OfendidoDAO ofendidoDao = new OfendidoDAO(conexion);
                ofendidoDao.guardar(ofendido);
                
            
            }catch(SQLException ex){
            Logger.getLogger(OfendidoController.class.getName()).log(Level.SEVERE, null, ex);
                 JOptionPane.showMessageDialog(null, "Eror al guardar");
            }

        
        }
        
        
        
    }
    
}
