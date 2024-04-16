/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import DAO.ExpedienteDAO;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
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
import javax.swing.JOptionPane;
import model.expediente;
import proyecto.data;
import ventanas.OfendidoController;

/**
 * FXML Controller class
 *
 * @author Dimas
 */
public class NuevoController implements Initializable {

    @FXML
    private DatePicker txFecha;
    @FXML
    private ChoiceBox<String> txEstado;
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
    @FXML
    private TextField txtOfendido;
    @FXML
    private TextField txtDenunciado;
    @FXML
    private TextField txtDenunciante;
    @FXML
    private TextField txtExpediente;
    
     private  data conexion = new data();
    
    
    @FXML
    private void Atras(ActionEvent event){
        
        Object evt = event.getSource();
        
        if(evt.equals(BtCancelar)){
        
        logalStage("/ventanas/Fx.fxml", event);
        
        }
    }

    
        ObservableList<String> estado = FXCollections.observableArrayList(
            "En observacion","En proceso","Senteciado"

);
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        txEstado.setItems(estado);
        // TODO
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
        Logger.getLogger(FXController1.class.getName()).log(Level.SEVERE, null, e);
        
        
        }
        
    
    }

    @FXML
    private void Ofendido(ActionEvent event) {
        
         Object evt = event.getSource();
        
        if(evt.equals(btOfendido)){
        
        logalStage("/ventanas/Ofendido.fxml", event);
        
        }
    }

    @FXML
    private void Denunciado(ActionEvent event) {
        
         Object evt = event.getSource();
        
        if(evt.equals(btDenunciado)){
        
        logalStage("/ventanas/Denunciado.fxml", event);
        
        }
        
    }

    @FXML
    private void Denunciante(ActionEvent event) {
          Object evt = event.getSource();
        
        if(evt.equals(btDenunciante)){
        
        logalStage("/ventanas/Denunciante.fxml", event);
        
        }
        
    }

    @FXML
    private void guardar(ActionEvent event) {

          if (!txtExpediente.getText().equals("")){
            expediente expediente = new expediente();
            expediente.setIdExpediente(Integer.parseInt(txtExpediente.getText()));
            expediente.setBreveNarracion(txBreve.getText());
            expediente.setDelitos(txDelito.getText());
            expediente.setEstadoExpediente(txEstado.getValue());
            expediente.setFecha(txFecha.getValue());
            
            
            expediente expeOfendido = new expediente();
            
            expeOfendido.setIdOfendido(Integer.parseInt(txtOfendido.getText()));
            expeOfendido.setIdExpediente(Integer.parseInt(txtOfendido.getText()));
            expeOfendido.setIdOfendido(Integer.parseInt(txtOfendido.getText()));
            
            try{
                this.conexion.ConectarBases();
                ExpedienteDAO expedienteDao = new ExpedienteDAO(conexion);
                expedienteDao.guardar(expediente);
                expedienteDao.guardarOfendido(expeOfendido);
                
            
            }catch(SQLException ex){
            Logger.getLogger(OfendidoController.class.getName()).log(Level.SEVERE, null, ex);
                 JOptionPane.showMessageDialog(null, "Eror al guardar");
            }

        
        }
        
        
        
    }
    
    
}
