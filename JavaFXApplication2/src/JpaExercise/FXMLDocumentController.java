/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JpaExercise;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author rgp5043
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    private Object persistence;
    private Object jpaPerson;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        EntityManagerFactory emf;
        emf = persistence.CreateEntityManagerFactory("JpaExercisePU");
        
        Person dude = new Person();
        dude.setFirstName("rahul");
        
        PersonJpaController JpaPerson = new PersonJpaController (emf);
        
        jpaPerson.Create(dude);
    }    
    
}
