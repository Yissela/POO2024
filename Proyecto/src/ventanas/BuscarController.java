/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ventanas;

import DAO.ExpedienteDAO;
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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import proyecto.data;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
/**
 * FXML Controller class
 *
 * @author Dimas
 */
public class BuscarController implements Initializable {

    @FXML
    private Button btAtras;
    @FXML
    private TextField NoExpediente;
    @FXML
    private TableColumn<?, ?> tableDelitos;
    @FXML
    private TableColumn<?, ?> tbEstado;
    @FXML
    private TableColumn<?, ?> tbDenunciado;
    @FXML
    private TableColumn<?, ?> tbDenunciante;
    @FXML
    private TableColumn<?, ?> tbOfendido;
    
    ExpedienteDAO ExpedienteDao;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    private data conexion = new data();

    @FXML
    private void Atras(ActionEvent event) {
        
        Object evt = event.getSource();
        
        if(evt.equals(btAtras)){
        
        logalStage("/ventanas/fx.fxml", event);
        
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
        Logger.getLogger(BuscarController.class.getName()).log(Level.SEVERE, null, e);
        
        
        }
        
    
    }

    @FXML
    private void Buscar(ActionEvent event) {
        
        
        
        
    }
    
    
    
    
    
}
