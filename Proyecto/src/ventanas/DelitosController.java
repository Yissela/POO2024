/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ventanas;

import DAO.DelitoDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.delito;
import proyecto.data;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Dimas
 */
public class DelitosController implements Initializable {

    @FXML
    private Button btGuardar;
    @FXML
    private TextField txtDelito;
    @FXML
    private TextField txtNumero;

    /**
     * Initializes the controller class.
     */
    private DelitoDAO DelitoDAO;
    private  data conexion = new data();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       
        // TODO
    }    

    @FXML
    private void Guardar(ActionEvent event) {
        
        if (!txtDelito.getText().equals("") && !txtNumero.getText().equals("") ){
            delito d = new delito();
            d.setId_delito(Integer.parseInt(txtNumero.getText()));
            d.setNombre(txtDelito.getText());
            try{
                this.conexion.ConectarBases();
                DelitoDAO DelitoDao = new DelitoDAO(conexion);
                DelitoDao.guardar(d);
                
            
            }catch(SQLException ex){
            Logger.getLogger(DelitosController.class.getName()).log(Level.SEVERE, null, ex);
                 JOptionPane.showMessageDialog(null, "Eror al guardar");
            }

        
        }
        
    }
    
}
