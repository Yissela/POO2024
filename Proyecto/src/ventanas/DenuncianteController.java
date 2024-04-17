/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ventanas;

import DAO.DenuncianteDAO;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import model.denunciante;
import proyecto.data;

/**
 * FXML Controller class
 *
 * @author Dimas
 */
public class DenuncianteController implements Initializable {

    @FXML
    private TextField txtId;
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
    private Button btGuardad;

    /**
     * Initializes the controller class.
     */
    
     private  data conexion = new data();
    @FXML
    private Button btAtras;
     
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Guardar(ActionEvent event) {
        
         if (!txtId.getText().equals("") && !txtNombre.getText().equals("") ){
            denunciante denunciante = new denunciante();
            denunciante.setId(Integer.parseInt(txtId.getText()));
            denunciante.setNombre(txtNombre.getText());
            denunciante.setApellido(txtApellido.getText());
            //denunciante.setEstado_civil(txtEstado.getText());
            denunciante.setSexo(txtDelitos.getText());
            denunciante.setGenero(txtGenero.getText());
            denunciante.setDireccion(txtEstado.getText());
            try{
                this.conexion.ConectarBases();
                DenuncianteDAO denuncianteDao = new DenuncianteDAO(conexion);
                denuncianteDao.guardar(denunciante);
                
            
            }catch(SQLException ex){
            Logger.getLogger(DenuncianteController.class.getName()).log(Level.SEVERE, null, ex);
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
        Logger.getLogger(DenuncianteController.class.getName()).log(Level.SEVERE, null, e);
        
        
        }
        
    
    }
    
}
