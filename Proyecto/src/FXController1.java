/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */


import java.io.IOException;


import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import java.util.logging.Level;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Dimas
 */
public class FXController1 implements Initializable {

    @FXML
    private Button btNuevo;
    @FXML
    private Button btBuscar;
    @FXML
    private Button btEliminar;
    
    @FXML
    private void VerNuevo(ActionEvent event){
        
        Object evt = event.getSource();
        
        if(evt.equals(btNuevo)){
        
        logalStage("/ventanas/Nuevo.fxml", event);
        
        }
    }
    @FXML
    private void VerBuscar(ActionEvent event){
        
        Object evt = event.getSource();
        
        if(evt.equals(btBuscar)){
        
        logalStage("/ventanas/Ofendido.fxml", event);
        
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
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
    
}
