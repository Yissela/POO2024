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
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dimas
 */
public class OfendidoController implements Initializable {
    
  
    

    @FXML
    private TextField txtId;
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
    private Button btGuardad;
    @FXML
    private Button btAtras;
    
  
    
    /**
     * Initializes the controller class.
     */
    
    
    private OfendidoDAO OfendidoDao;
    private  data conexion = new data();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
       
        
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

    @FXML
    private void atras(ActionEvent event) {
        
          Object evt = event.getSource();
        
        if(evt.equals(btAtras)){
        
        logalStage("/ventanas/Nuevo.fxml", event);
        
        }
        
        
    }
    
    
    
      private void logalStage(String url, Event event){
        
        try{
        
        // Oculta la ventana actual
        ((Node)(event.getSource())).getScene().getWindow().hide();
        
        // Carga el archivo FXML proporcionado
        Parent root = FXMLLoader.load(getClass().getResource(url));
        Scene scene = new Scene(root);
        
        // Crea y muestra una nueva ventana
        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.show();
       
       
        }catch (IOException e){
        Logger.getLogger(OfendidoController.class.getName()).log(Level.SEVERE, null, e);
        
        
        }
        
    
    }
    
    
}
